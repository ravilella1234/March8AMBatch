package com.icici.loans.homeloans;

public class StringDemo1
{

	public static void main(String[] args) 
	{
		String s1="ravikanth";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		String s2="lella";
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		s1=s1+s2;
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		
		StringBuffer a1=new StringBuffer("ravikanth");
		System.out.println(a1);
		System.out.println(a1.hashCode());
		
		StringBuffer a2=new StringBuffer("lella");
		System.out.println(a2);
		System.out.println(a2.hashCode());
		
		a1=a1.append(a2);
		System.out.println(a1);
		System.out.println(a1.hashCode());

	}

}
