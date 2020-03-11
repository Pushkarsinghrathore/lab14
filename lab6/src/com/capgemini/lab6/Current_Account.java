package com.capgemini.lab6;

public class Current_Account extends Account {

	private final double Overdraft_Limit = 10000;

	@Override
	public boolean withdrawl(Double amount) {
		if (amount <= Overdraft_Limit) {
			super.setBalance(super.getBalance()-amount);
			return true;
		} else {
			return false;
		}
	}
}
