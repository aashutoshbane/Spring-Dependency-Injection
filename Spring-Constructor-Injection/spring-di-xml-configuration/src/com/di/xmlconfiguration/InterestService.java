package com.di.xmlconfiguration;

public interface InterestService {
	public AccountInterest getInterestRates();
	public Integer getInterestRate(String accountType);
}

