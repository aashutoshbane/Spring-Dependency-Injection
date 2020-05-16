package com.di.xmlconfiguration;

public class CurrentAccount implements IAccount {
	
	private InterestService interestService;
	
	public CurrentAccount(InterestService theInterestService) {
		this.interestService = theInterestService;
	}

	@Override
	public String createAccount() {
		return "Current account created";
	}
	
	@Override
	public Integer getInterestRate() {
		return this.interestService.getInterestRate("current");
	}

}
