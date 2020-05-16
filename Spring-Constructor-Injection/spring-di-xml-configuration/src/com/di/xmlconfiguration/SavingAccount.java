/**
 * 
 */
package com.di.xmlconfiguration;

/**
 * @author Ashutosh Bane
 *
 */
public class SavingAccount implements IAccount {
	
	private InterestService interestService;
	
	public SavingAccount(InterestService theInterestService) {
		this.interestService = theInterestService;
	}
	
	@Override
	public String createAccount() {
		return "Savings account created...!";
	}
	
	@Override
	public Integer getInterestRate() {
		return this.interestService.getInterestRate("savings");
	}

}
