package com.icici.loans.homeloans;

public class VariableTypes 
{
	
	
	
	//primitive variable
	int x=100;  // instance (or) global (or) non-static Variable
	static String cname="vmware";  // static variable
	static VariableTypes obj;
	
	public void m1()
	{
		
		int y=200;  // local variable
		System.out.println(y);
		System.out.println(x);
		System.out.println(cname);
	}

	public static void m2()
	{
		obj=new VariableTypes();
		System.out.println(obj.x);
		obj.m1();
		System.out.println(VariableTypes.cname);
		VariableTypes.m2();
	}
	
	public static void main(String[] args) 
	{
		obj = new VariableTypes();  // reference variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
		
	}
}
