package atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;


public class Account {

	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$' ###, ##0.00");
	
//	set the customer number 
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
//	get the customer number 
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
//	get the pin number
	public int getPinNumber() {
		return pinNumber;
	}
	
//	get Checking Account Balance
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
//	get Saving Account Balance
	public double getSavingBalance() {
		return savingBalance;
	}
	
//	calculate Checking Account Withdrawl 
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
//	calculate saving Account Withdrawl 
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	

//	calculate Checking Account Deposit 
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	
//	calculate saving Account Deposit 
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	

	
//	customer Checking Account withdraw input
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account balance : " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from checking Account :");
		double amount = input.nextDouble();
		
		if ((checkingBalance - amount ) >=0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance : "+moneyFormat.format(checkingBalance) + "\n");
		} else {
			System.out.println("Balance can not be negative . "+"\n");
		}
	}
	
//	Customer saving Account Withdraw input 
	public void getSavingWithdrawInput() {
		System.out.println("Checking Account balance : "+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving Account :");
		double amount = input.nextDouble();
		
		if ((savingBalance - amount ) >=0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance : "+savingBalance + "\n");
		} else {
			System.out.println("Balance can not be negative . "+"\n");
		}
	}
	
	
//	Customer Checking Account Deposit input 
	public void getCheckingDepositInput() {
		System.out.println("Checking Account balance is : "+moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to deposit from saving Account :");
		double amount = input.nextDouble();
		
		if ((checkingBalance + amount ) >=0) {
			calcSavingDeposit(amount);
			System.out.println("New Checking Account Balance is: "+moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Balance can not be negative . "+"\n");
		}
	}
	
	
//	Customer Saving Account Deposit input 
	public void getSavingDepositInput() {
		System.out.println("Checking Account balance is : "+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to deposit from saving Account :");
		double amount = input.nextDouble();
		
		if ((savingBalance + amount ) >=0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account Balance is: "+moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance can not be negative . "+"\n");
		}
	}
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	
	

}
