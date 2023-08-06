package Aatm;

import java.util.Scanner;

public class Acc {
	static Scanner Scanner = new Scanner(System.in);
	
public double amount;

	public Acc(String name) {
		super();
		this.name = name;
	}

	private String name;
	String password = Scanner.nextLine();
	private double balance;
	
	

	public double getBalance() {
		return balance;
		
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
	public double getamount() {
		return amount;
	}

	public void setamount(double amount) {
	
		this.amount= amount;
	}
	
public static int withdraw(Acc account, double amount ) {
		
	System.out.println("How much money would you like to withdraw?");
	  amount = Scanner.nextLine();
	 
	if (amount > account.getBalance() ) {
		System.out.println("amount is bigger than balance.");
	} else if (amount <=0) {
		
		System.out.println("what do you want then");
	} else {
		
		account.setBalance(account.getBalance()-amount);
	}}
	
	//DEPOSIT MONEY
	public static void depositMoney(Acc account, double amount) {
		
		account.setBalance(account.getBalance()+ amount);
		
	}
	
	//CHECK BALANCE 
	public static void checkBalance(Acc account, double balance) {
		System.out.println("Your balance is $" + balance);
	}
	
	public static void Exit() {
		System.out.println("Good Bye");
	}
	


}