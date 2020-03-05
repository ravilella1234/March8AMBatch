package com.icici.loans.homeloans;

public final strictfp class  FinalVariable 
{
	final public   int x=10;
	final static int y=20;
	
	public strictfp static void m5()
	{
		
	}

	public static void main(String[] args) 
	{
		final int z=30;
		
		FinalVariable obj=new FinalVariable();
		System.out.println(obj.x);
		obj.x=100;
		System.out.println(obj.x);
		
		System.out.println(FinalVariable.y);
		y=200;
		System.out.println(FinalVariable.y);
		
		System.out.println(z);
		z=300;
		System.out.println(z);
	}

}
