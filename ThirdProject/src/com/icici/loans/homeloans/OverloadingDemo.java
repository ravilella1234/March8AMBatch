package com.icici.loans.homeloans;

public class OverloadingDemo 
{
	
	

	/*
	 * public void m1(int i) { System.out.println(i); }
	 */
	
	
	/*
	 * public void m1(float i) { System.out.println(i); }
	 */

	/*
	 * public void m1(String i) { System.out.println(i); }
	 */
	
	/*
	 * public void m1(Number i) { System.out.println(i); }
	 */
	
	/*
	 * public void m1(Integer i) { System.out.println(i); }
	 */
	
	public void m1(Object i)
	{
		System.out.println(i);
	}
	
	
	public static void main(String[] args)
	{
		OverloadingDemo obj=new OverloadingDemo();
		obj.m1(100);
		obj.m1(12.34f);
		obj.m1("ravilella");
		obj.m1(2000);
		obj.m1(3456.54f);
		obj.m1("ravi");
	}

}
