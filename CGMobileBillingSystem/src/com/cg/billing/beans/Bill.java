package com.cg.billing.beans;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Bill {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int billID; 
	private int noOfLocalSMS, noOfStdSMS, noOfLocalCalls, noOfStdCalls, internetDataUsageUnits;
	private String billMonth;
	private float totalBillAmount, localSMSAmount, stdSMSAmount, localCallAmount, stdCallAmount, internetDataUsageAmount,stateGST,centralGST;
	public Bill() {
		super();
	}
	public Bill(int noOfLocalSMS, int noOfStdSMS, int noOfLocalCalls, int noOfStdCalls, int internetDataUsageUnits,
			String billMonth, float totalBillAmount, float localSMSAmount, float stdSMSAmount, float localCallAmount,
			float stdCallAmount, float internetDataUsageAmount, float stateGST, float centralGST) {
		super();
		this.noOfLocalSMS = noOfLocalSMS;
		this.noOfStdSMS = noOfStdSMS;
		this.noOfLocalCalls = noOfLocalCalls;
		this.noOfStdCalls = noOfStdCalls;
		this.internetDataUsageUnits = internetDataUsageUnits;
		this.billMonth = billMonth;
		this.totalBillAmount = totalBillAmount;
		this.localSMSAmount = localSMSAmount;
		this.stdSMSAmount = stdSMSAmount;
		this.localCallAmount = localCallAmount;
		this.stdCallAmount = stdCallAmount;
		this.internetDataUsageAmount = internetDataUsageAmount;
		this.stateGST = stateGST;
		this.centralGST = centralGST;
	}
	public Bill(int billID, int noOfLocalSMS, int noOfStdSMS, int noOfLocalCalls, int noOfStdCalls,
			int internetDataUsageUnits, String billMonth, float totalBillAmount, float localSMSAmount,
			float stdSMSAmount, float localCallAmount, float stdCallAmount, float internetDataUsageAmount,
			float stateGST, float centralGST) {
		super();
		this.billID = billID;
		this.noOfLocalSMS = noOfLocalSMS;
		this.noOfStdSMS = noOfStdSMS;
		this.noOfLocalCalls = noOfLocalCalls;
		this.noOfStdCalls = noOfStdCalls;
		this.internetDataUsageUnits = internetDataUsageUnits;
		this.billMonth = billMonth;
		this.totalBillAmount = totalBillAmount;
		this.localSMSAmount = localSMSAmount;
		this.stdSMSAmount = stdSMSAmount;
		this.localCallAmount = localCallAmount;
		this.stdCallAmount = stdCallAmount;
		this.internetDataUsageAmount = internetDataUsageAmount;
		this.stateGST = stateGST;
		this.centralGST = centralGST;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billID;
		result = prime * result + ((billMonth == null) ? 0 : billMonth.hashCode());
		result = prime * result + Float.floatToIntBits(centralGST);
		result = prime * result + Float.floatToIntBits(internetDataUsageAmount);
		result = prime * result + internetDataUsageUnits;
		result = prime * result + Float.floatToIntBits(localCallAmount);
		result = prime * result + Float.floatToIntBits(localSMSAmount);
		result = prime * result + noOfLocalCalls;
		result = prime * result + noOfLocalSMS;
		result = prime * result + noOfStdCalls;
		result = prime * result + noOfStdSMS;
		result = prime * result + Float.floatToIntBits(stateGST);
		result = prime * result + Float.floatToIntBits(stdCallAmount);
		result = prime * result + Float.floatToIntBits(stdSMSAmount);
		result = prime * result + Float.floatToIntBits(totalBillAmount);
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
		Bill other = (Bill) obj;
		if (billID != other.billID)
			return false;
		if (billMonth == null) {
			if (other.billMonth != null)
				return false;
		} else if (!billMonth.equals(other.billMonth))
			return false;
		if (Float.floatToIntBits(centralGST) != Float.floatToIntBits(other.centralGST))
			return false;
		if (Float.floatToIntBits(internetDataUsageAmount) != Float.floatToIntBits(other.internetDataUsageAmount))
			return false;
		if (internetDataUsageUnits != other.internetDataUsageUnits)
			return false;
		if (Float.floatToIntBits(localCallAmount) != Float.floatToIntBits(other.localCallAmount))
			return false;
		if (Float.floatToIntBits(localSMSAmount) != Float.floatToIntBits(other.localSMSAmount))
			return false;
		if (noOfLocalCalls != other.noOfLocalCalls)
			return false;
		if (noOfLocalSMS != other.noOfLocalSMS)
			return false;
		if (noOfStdCalls != other.noOfStdCalls)
			return false;
		if (noOfStdSMS != other.noOfStdSMS)
			return false;
		if (Float.floatToIntBits(stateGST) != Float.floatToIntBits(other.stateGST))
			return false;
		if (Float.floatToIntBits(stdCallAmount) != Float.floatToIntBits(other.stdCallAmount))
			return false;
		if (Float.floatToIntBits(stdSMSAmount) != Float.floatToIntBits(other.stdSMSAmount))
			return false;
		if (Float.floatToIntBits(totalBillAmount) != Float.floatToIntBits(other.totalBillAmount))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Bill [billID=" + billID + ", noOfLocalSMS=" + noOfLocalSMS + ", noOfStdSMS=" + noOfStdSMS
				+ ", noOfLocalCalls=" + noOfLocalCalls + ", noOfStdCalls=" + noOfStdCalls + ", internetDataUsageUnits="
				+ internetDataUsageUnits + ", billMonth=" + billMonth + ", totalBillAmount=" + totalBillAmount
				+ ", localSMSAmount=" + localSMSAmount + ", stdSMSAmount=" + stdSMSAmount + ", localCallAmount="
				+ localCallAmount + ", stdCallAmount=" + stdCallAmount + ", internetDataUsageAmount="
				+ internetDataUsageAmount + ", stateGST=" + stateGST + ", centralGST=" + centralGST + "]";
	}

	
}