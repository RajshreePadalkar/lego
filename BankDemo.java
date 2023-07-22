package com.gurukul.day5;

import java.util.Scanner;

class Bank
{
	private String name,branch;
	private long Accno;
	private double balance;
	private static int count=1000;
	private static double total=0;
	
	Bank(){}
	Bank(String n,String b,double bal)
	{
		count++;
		name=n;
		branch = b;
		Accno=count;
		balance = bal;
		total=total+balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public long getAccno() {
		return Accno;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt)
	{
		double a=getBalance()+amt;
		setBalance(a);
		total=total+amt;
	}
	public double currentBalance()
	{
		double a=getBalance();
		return a;
	}
	public String toString()
	{
		return "\nName :"+name +" Account no :" + Accno +" Balance :"+balance+ " Branch : "+ branch ;
	}
	public void withdraw(double am)
	{
		
//		if(balance-1000<=0)
//			System.out.println("amount is below 1000 ");
//		else
			balance = balance-am;
			total=total-am;
		
	}
	public double getAvalibleBal()
	{
		return balance-1000;
		
	}
	
	public static double getTotal()
	{
		return total;
	}
	
}

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank  acc1=new Bank("Ram", "Bandra", 2500);
		Bank  acc2=new Bank("Sita", "Bandra", 3500);
		Bank  acc3=new Bank("Rahim", "Bandra", 2800);
		Bank  acc4=new Bank("Rita", "Bandra", 5500);
		acc1.deposit(5000);
		acc2.deposit(2500);
		acc3.withdraw(1200);
		System.out.println(acc1);
		//Name: Ram Account Number 1001   Balance Rs.7500 Branch: Bandra 
		System.out.println(acc2);
		//Name: Sita Account Number 1002   Balance Rs.6000 Branch: Bandra 

		System.out.println(acc3);
		//Name: Rahim Account Number 1003   Balance Rs.1600 Branch: Bandra 
		System.out.println(acc4);
		//Name: Rita Account Number 1004   Balance Rs.5500 Branch: Bandra 
		System.out.println("\nTotal Balance in Bank:"+Bank.getTotal());

		/*Scanner sc= new Scanner(System.in);
		

		Bank  acc1=new Bank("Ram", "Bandra", 2500);
		
		acc1.deposit(2550);
		
		double bal=acc1.currentBalance();
		
		System.out.println(acc1.getName()+" has "+ bal+" amount");
				// Ram has 5050 amount
		
		System.out.println("Enter the amount to withdraw");
		double am=sc.nextDouble();//4500
		
		if(acc1.getAvalibleBal()>am)
		
		acc1.withdraw(am);
		else
			
		System.out.println("Insufficient fund"); //output .because Minimum balance 1000
		
		
		System.out.println("Details of the account holder"+ acc1);
		
		// Name: Ram Account Number 123456   Balance Rs.5050 Branch: Bandra 

		
       Bank  acc2=new Bank("Sita", "Bandra", 2000);
		
		acc2.deposit(2550);
		
		 bal=acc2.currentBalance();
		
		System.out.println(acc2.getName()+" has "+ bal+" amount");
				// Sita has 4050 amount
		
		System.out.println("Enter the amount to withdraw");
		 am=sc.nextDouble();//2500
		
		if(acc2.getAvalibleBal()>am)
		
		acc2.withdraw(am);
		else
			
		System.out.println("Insufficient fund"); 
		
		System.out.println("Details of the account holder"+ acc2);
		
		// Name: Sita Account Number 23456   Balance Rs.1550 Branch: Bandra 
*/
	}

}
