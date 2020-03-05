package com.icici.loans.homeloans;

import java.util.Date;

public   class A 
{
	public int x=100;
	
	public  void m1()
	{
		System.out.println("iam m1 from class A");
	}
	
	public static void m5()
	{
		System.out.println("iam m5 static method...");
	}
	
	static
	{
		System.out.println("iam static block1....");
	}
	
	static
	{
		Date dt=new Date();
		System.out.println(dt);
		System.out.println("iam static block2....");
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		System.out.println(a.x);
		
		A.m5();
	}
}
