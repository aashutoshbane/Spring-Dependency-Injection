package com.di.xmlconfiguration;

public class AccountInterest implements InterestService {
	
	private int savingsRate;
	private int currentRate;
	
	public AccountInterest() {
		this.savingsRate = 4;
		this.currentRate = 5;
	}
	
	@Override
	public AccountInterest getInterestRates() {
		return this;
	}

	@Override
	public Integer getInterestRate(String accountType) {
		int rate;
		
		switch (accountType) {
		case "savings":
			rate = this.savingsRate;
			break;
		case "current":
			rate = this.currentRate;
			break;
		default:
			throw new Error("Unknown type passed");
		}
		
		return rate;
	}

}
