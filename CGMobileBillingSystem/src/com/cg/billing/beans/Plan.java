package com.cg.billing.beans;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
@Entity
public class Plan {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int planID;
	private int monthlyRental, freeLocalCalls, freeStdCalls, freeLocalSMS, freeStdSMS, freeInternetDataUsageUnits;
	private float localCallRate, stdCallRate, localSMSRate, stdSMSRate, internetDataUsageRate;
	private String planCircle, planName;
	@OneToMany(mappedBy="plan",cascade=CascadeType.ALL)
	@MapKey
	private Map<Long, PostpaidAccount> accounts;
	public Plan() {}
	public Plan(int planID, int monthlyRental, int freeLocalCalls,
			int freeStdCalls, int freeLocalSMS, int freeStdSMS,
			int freeInternetDataUsageUnits, float localCallRate,
			float stdCallRate, float localSMSRate, float stdSMSRate,
			float internetDataUsageRate, String planCircle, String planName) {
		super();
		this.planID = planID;
		this.monthlyRental = monthlyRental;
		this.freeLocalCalls = freeLocalCalls;
		this.freeStdCalls = freeStdCalls;
		this.freeLocalSMS = freeLocalSMS;
		this.freeStdSMS = freeStdSMS;
		this.freeInternetDataUsageUnits = freeInternetDataUsageUnits;
		this.localCallRate = localCallRate;
		this.stdCallRate = stdCallRate;
		this.localSMSRate = localSMSRate;
		this.stdSMSRate = stdSMSRate;
		this.internetDataUsageRate = internetDataUsageRate;
		this.planCircle = planCircle;
		this.planName = planName;
	}
	public int getPlanID() {
		return planID;
	}
	public void setPlanID(int planID) {
		this.planID = planID;
	}
	public int getMonthlyRental() {
		return monthlyRental;
	}
	public void setMonthlyRental(int monthlyRental) {
		this.monthlyRental = monthlyRental;
	}
	public int getFreeLocalCalls() {
		return freeLocalCalls;
	}
	public void setFreeLocalCalls(int freeLocalCalls) {
		this.freeLocalCalls = freeLocalCalls;
	}
	public int getFreeStdCalls() {
		return freeStdCalls;
	}
	public void setFreeStdCalls(int freeStdCalls) {
		this.freeStdCalls = freeStdCalls;
	}
	public int getFreeLocalSMS() {
		return freeLocalSMS;
	}
	public void setFreeLocalSMS(int freeLocalSMS) {
		this.freeLocalSMS = freeLocalSMS;
	}
	public int getFreeStdSMS() {
		return freeStdSMS;
	}
	public void setFreeStdSMS(int freeStdSMS) {
		this.freeStdSMS = freeStdSMS;
	}
	public int getFreeInternetDataUsageUnits() {
		return freeInternetDataUsageUnits;
	}
	public void setFreeInternetDataUsageUnits(int freeInternetDataUsageUnits) {
		this.freeInternetDataUsageUnits = freeInternetDataUsageUnits;
	}
	public float getLocalCallRate() {
		return localCallRate;
	}
	public void setLocalCallRate(float localCallRate) {
		this.localCallRate = localCallRate;
	}
	public float getStdCallRate() {
		return stdCallRate;
	}
	public void setStdCallRate(float stdCallRate) {
		this.stdCallRate = stdCallRate;
	}
	public float getLocalSMSRate() {
		return localSMSRate;
	}
	public void setLocalSMSRate(float localSMSRate) {
		this.localSMSRate = localSMSRate;
	}
	public float getStdSMSRate() {
		return stdSMSRate;
	}
	public void setStdSMSRate(float stdSMSRate) {
		this.stdSMSRate = stdSMSRate;
	}
	public float getInternetDataUsageRate() {
		return internetDataUsageRate;
	}
	public void setInternetDataUsageRate(float internetDataUsageRate) {
		this.internetDataUsageRate = internetDataUsageRate;
	}
	public String getPlanCircle() {
		return planCircle;
	}
	public void setPlanCircle(String planCircle) {
		this.planCircle = planCircle;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + freeInternetDataUsageUnits;
		result = prime * result + freeLocalCalls;
		result = prime * result + freeLocalSMS;
		result = prime * result + freeStdCalls;
		result = prime * result + freeStdSMS;
		result = prime * result + Float.floatToIntBits(internetDataUsageRate);
		result = prime * result + Float.floatToIntBits(localCallRate);
		result = prime * result + Float.floatToIntBits(localSMSRate);
		result = prime * result + monthlyRental;
		result = prime * result
				+ ((planCircle == null) ? 0 : planCircle.hashCode());
		result = prime * result + planID;
		result = prime * result
				+ ((planName == null) ? 0 : planName.hashCode());
		result = prime * result + Float.floatToIntBits(stdCallRate);
		result = prime * result + Float.floatToIntBits(stdSMSRate);
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
		Plan other = (Plan) obj;
		if (freeInternetDataUsageUnits != other.freeInternetDataUsageUnits)
			return false;
		if (freeLocalCalls != other.freeLocalCalls)
			return false;
		if (freeLocalSMS != other.freeLocalSMS)
			return false;
		if (freeStdCalls != other.freeStdCalls)
			return false;
		if (freeStdSMS != other.freeStdSMS)
			return false;
		if (Float.floatToIntBits(internetDataUsageRate) != Float
				.floatToIntBits(other.internetDataUsageRate))
			return false;
		if (Float.floatToIntBits(localCallRate) != Float
				.floatToIntBits(other.localCallRate))
			return false;
		if (Float.floatToIntBits(localSMSRate) != Float
				.floatToIntBits(other.localSMSRate))
			return false;
		if (monthlyRental != other.monthlyRental)
			return false;
		if (planCircle == null) {
			if (other.planCircle != null)
				return false;
		} else if (!planCircle.equals(other.planCircle))
			return false;
		if (planID != other.planID)
			return false;
		if (planName == null) {
			if (other.planName != null)
				return false;
		} else if (!planName.equals(other.planName))
			return false;
		if (Float.floatToIntBits(stdCallRate) != Float
				.floatToIntBits(other.stdCallRate))
			return false;
		if (Float.floatToIntBits(stdSMSRate) != Float
				.floatToIntBits(other.stdSMSRate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "planID=" + planID + ", monthlyRental=" + monthlyRental
				+ ", freeLocalCalls=" + freeLocalCalls + ", freeStdCalls="
				+ freeStdCalls + ", freeLocalSMS=" + freeLocalSMS
				+ ", freeStdSMS=" + freeStdSMS
				+ ", freeInternetDataUsageUnits=" + freeInternetDataUsageUnits
				+ ", localCallRate=" + localCallRate + ", stdCallRate="
				+ stdCallRate + ", localSMSRate=" + localSMSRate
				+ ", stdSMSRate=" + stdSMSRate + ", internetDataUsageRate="
				+ internetDataUsageRate + ", planCircle=" + planCircle
				+ ", planName=" + planName;
	}

}