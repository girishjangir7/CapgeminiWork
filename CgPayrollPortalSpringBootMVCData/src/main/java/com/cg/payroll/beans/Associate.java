package com.cg.payroll.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Associate {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int associateId;
	private int yearlyInvestmentUnder8oC;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotEmpty
	private String department;
	@NotEmpty
	private String designation;
	@NotEmpty
	private String panCard;
	@NotEmpty
	@Email
	private String emailId;
	
	@Embedded
	public Salary salary;
	@Embedded
	public BankDetails bankDetails;
	
	public Associate() {
		super();
	}

	public Associate( int yearlyInvestmentUnder8oC, String firstName, String lastName,
			String department, String designation,  String emailId,String panCard,Salary salary, BankDetails bankDetails) {
		super();
	
		this.yearlyInvestmentUnder8oC = yearlyInvestmentUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.emailId = emailId;
		this.panCard = panCard;
		this.salary=salary;
		this.bankDetails=bankDetails;
	}

	public Associate(int associateId, int yearlyInvestmentUnder8oC, String firstName, String lastName,
			String department, String designation, String panCard, String emailId,Salary salary,BankDetails bankDetails) {
		super();
		this.associateId = associateId;
		this.yearlyInvestmentUnder8oC = yearlyInvestmentUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.panCard = panCard;
		this.emailId = emailId;
		this.bankDetails = bankDetails;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + associateId;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((panCard == null) ? 0 : panCard.hashCode());
		result = prime * result + yearlyInvestmentUnder8oC;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Associate other = (Associate) obj;
		if (associateId != other.associateId)
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (panCard == null) {
			if (other.panCard != null)
				return false;
		} else if (!panCard.equals(other.panCard))
			return false;
		if (yearlyInvestmentUnder8oC != other.yearlyInvestmentUnder8oC)
			return false;
		return true;
	}

	public int getAssociateId() {
		return associateId;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public int getYearlyInvestmentUnder8oC() {
		return yearlyInvestmentUnder8oC;
	}

	public void setYearlyInvestmentUnder8oC(int yearlyInvestmentUnder8oC) {
		this.yearlyInvestmentUnder8oC = yearlyInvestmentUnder8oC;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	
	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", yearlyInvestmentUnder8oC=" + yearlyInvestmentUnder8oC
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", designation=" + designation + ", panCard=" + panCard + ", emailId=" + emailId + ", salary="
				+ salary + ", bankDetails=" + bankDetails + "]";
	}
}
