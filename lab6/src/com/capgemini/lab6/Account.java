package com.capgemini.lab6;

public abstract class Account {
	private static long accNo = 10000;
	private double balance;
	private Person accHolder;

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}

	public Account() {
		accNo++;
		// TODO Auto-generated constructor stub
	}

	public static long getAccNo() {
		return accNo;
	}

	public void setAccNo(Long accNo) {
		Account.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void deposit(Double amount) {
		this.balance = this.balance + amount;
	}

//	public void withdrawl(Double amount) {
//		if (this.balance > amount) {
//			this.balance = this.balance - amount;
//		}
//	}
	public abstract boolean withdrawl(Double amount);
	

}
