package com.capgemini.lab6;

public class Saving_Account extends Account {
	private final double minBalance = 1000;

	@Override
	public boolean withdrawl(Double amount) {
		if (super.getBalance()>=minBalance && (super.getBalance()-amount)>=minBalance) {
			super.setBalance(super.getBalance() - amount);
			return true;
		} else {
			return false;
		}

	}
	
}
