package com.icici.loans.homeloans;

public class EmployeeChild extends Employee
{
	String address;

	public EmployeeChild(String address) 
	{
		super(1745,"sai",23.34f);
		this.address=address;
		
		System.out.println(this.address);
	}
	
	
	public void m1()
	{
		
	}

	public static void main(String[] args) 
	{
		EmployeeChild c=new EmployeeChild("hyderabad");

	}

}
