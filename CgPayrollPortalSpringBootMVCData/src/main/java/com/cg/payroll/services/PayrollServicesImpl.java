package com.cg.payroll.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;

@Component("payrollServices")
public class PayrollServicesImpl implements PayrollServices{
	double taxableAmount;
	@Autowired
	private AssociateDAO associateDAO;
	
	@Override
	public Associate acceptAssociateDetails(Associate associate) {
	
		associate = associateDAO.save(associate);// returns associate with ID
		return associate;
	}
		
	
	@Override
	public Associate calculateNetSalary(int associateId) throws AssociateDetailNotFoundException {
		Associate associate = calculateTaxAmount(associateId);
		int netSalary= associate.salary.getGrossSalary()-(associate.salary.getMonthlyTax()*12)+associate.salary.getEpf()+associate.salary.getCompanyPf();
		associate.salary.setNetSalary(netSalary);
		associateDAO.save(associate);
		return associate;
	}

@Override
public Associate calculateTaxAmount(int associateId) throws AssociateDetailNotFoundException{
	double taxAmount = 0;
	Associate associate = getAssociateDetails(associateId);
	  associate.salary.setHra((associate.salary.getBasicSalary()*30)/100);
	  associate.salary.setConveyenceAllowance((associate.salary.getBasicSalary()*30
	  )/100);
	  associate.salary.setOtherAllowance((associate.salary.getBasicSalary()*35)/100
	  );
	  associate.salary.setPersonalAllowance((associate.salary.getBasicSalary())/5);
	  associate.salary.setGrossSalary(associate.salary.getBasicSalary()+associate.
	  salary.getConveyenceAllowance()+associate.salary.getHra()
	  +associate.salary.getOtherAllowance()+associate.salary.getPersonalAllowance()
	  +associate.salary.getCompanyPf()+associate.salary.getEpf()); 
	
	  int taxableAmount = associate.salary.getGrossSalary()-(associate.salary.getEpf()+associate.salary.getCompanyPf()+associate.getYearlyInvestmentUnder8oC());
	  associate.salary.setTaxableAmount(taxableAmount);
	  while(taxableAmount>250000) {
		if(taxableAmount>250000&&taxableAmount<=500000) {
			taxableAmount -= 250000;
			taxAmount = taxAmount+taxableAmount/10;
		}
		if(taxableAmount>500000&&taxableAmount<=1000000) {
			taxableAmount -= 500000;
			taxAmount = taxAmount+taxableAmount/20;
		}
		if(taxableAmount>1000000) {
			taxableAmount -= 1000000;
			taxAmount = taxAmount+taxableAmount/30;
		}
		associate.salary.setMonthlyTax((int) (taxAmount/12));
	}
	return associate;
}
	@Override
	public Associate getAssociateDetails(int associateId) throws AssociateDetailNotFoundException {
	 return associateDAO.findById(associateId).orElseThrow
			 (()->new AssociateDetailNotFoundException("Associate details not found for associateId "+associateId));
	}

	@Override
	public List<Associate> getAllAssociatesDetails() {
		 return  associateDAO.findAll();
		
	}
	
}
