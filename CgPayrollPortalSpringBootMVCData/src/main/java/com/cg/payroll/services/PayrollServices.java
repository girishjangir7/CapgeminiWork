package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;

public interface PayrollServices {	
	Associate calculateNetSalary(int associateId) throws AssociateDetailNotFoundException;
	
	Associate getAssociateDetails(int associateId) throws AssociateDetailNotFoundException;
	
	List <Associate> getAllAssociatesDetails();

	Associate calculateTaxAmount(int associateId) throws AssociateDetailNotFoundException;

	Associate acceptAssociateDetails(Associate associate);
	
}
