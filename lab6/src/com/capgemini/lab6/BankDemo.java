package com.capgemini.lab6;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String balance, age, age1;
		System.out.println("Enter for Smith");
		System.out.println("Enter Name:");
		String name = scr.next();
		System.out.println("Enter Age:");
		age = scr.next();
		try {
			if (Integer.parseInt(age) < 15) {
				throw new AgeException("Age should be above 15");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		Person accHolder = new Person();
		accHolder.setName(name);
		accHolder.setAge(Integer.parseInt(age));
		System.out.println("Enter Balance:");
		balance = scr.next();

//Saving Bank Account
		Saving_Account act = new Saving_Account();
		// act.setAccNo(Account.getAccNo());
		act.setBalance(Double.parseDouble(balance));
		act.setAccHolder(accHolder);
		System.out.println("Amount to be Deposited Smith:");
		String amount11 = scr.next();
		act.deposit(Double.parseDouble(amount11));
		System.out.println("Withdrawl Amount:");
		String amount12 = scr.next();
		boolean test = act.withdrawl(Double.parseDouble(amount12));// check withdrawl
		if (!test) {
			System.out.println("Transaction failed ! You don't have enough balance");
		}
		System.out.println("Total Balance by Smith:");
		System.out.println(act.getBalance());// check balance

		// Current Bank Account
		Current_Account current_Account = new Current_Account();
		current_Account.setBalance(act.getBalance());
		current_Account.setAccHolder(accHolder);
		System.out.println("Withdrawl Amount throught Current Account:");
		String amount = scr.next();
		boolean current_Check = current_Account.withdrawl(Double.parseDouble(amount));// check withdrawl
		if (!current_Check) {
			System.out.println("Transaction failed ! You don't have enough balance");
		}
		System.out.println("Total Balance by Smith:");
		System.out.println(current_Account.getBalance());
		System.out.println(current_Account);

		System.out.println("Enter for Kathy");
		System.out.println("Enter Name:");
		String name1 = scr.next();
		System.out.println("Enter Age:");

		age1 = scr.next();
		try {
			if (Integer.parseInt(age1) < 15) {
				throw new AgeException("Age should be above 15");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		Person accHolder1 = new Person();
		accHolder1.setName(name1);
		accHolder1.setAge(Integer.parseInt(age1));
		System.out.println("Enter Balance:");
		String balance1 = scr.next();

		Saving_Account act1 = new Saving_Account();
//		act1.setAccNo(Account.getAccNo());
		act1.setBalance(Double.parseDouble(balance1));
		act1.setAccHolder(accHolder1);

		// Balance

		System.out.println("Amount to be Deposited Karthy:");
		String amount22 = scr.next();
		act1.deposit(Double.parseDouble(amount22));
		System.out.println("Withdrawl Amount:");
		String amount23 = scr.next();
		boolean test1 = act1.withdrawl(Double.parseDouble(amount23));
		if (!test1) {
			System.out.println("Transaction failed ! You don't have enough balance");
		}
		System.out.println("Total Balance by Karthy:");
		System.out.println(act1.getBalance());// Balance

		System.out.println(act1);
	}

}
