package com.icici.loans.homeloans;

public class B extends A  // isA relationship
{
	public void m1()
	{
		System.out.println("iam overriden  m1 from class B");
	}
	
	public void m2()
	{
		System.out.println("iam m2 from class B");
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.m2();
		System.out.println(b.x);
		
		A a=new A();  // hasA relationship
		a.m1();
		System.out.println(a.x);
	}
	
}


