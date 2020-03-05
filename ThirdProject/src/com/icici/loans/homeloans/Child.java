package com.icici.loans.homeloans;


class Parent
{
	 public  Number workhard()
	{
		System.out.println("wakeup early, goto college....");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Atmost care...");
	}
}

public class Child extends Parent
{
	
	public strictfp Object workhard()
	{
		System.out.println("wakeup anytime, goto bar/ beautyparlour....");
		return 0;
	}
	
	public void love()
	{
		System.out.println("iam in love...");
	}

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.workhard();
		c.care();
		c.love();

	}

}
