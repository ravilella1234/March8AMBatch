package com.icici.loans.homeloans;

import java.util.Scanner;

public class ArrayDemo 
{
	public int arrayDemo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size :");
		int asize = sc.nextInt();
		int sum=0;
		
		int[] a = new int[asize];
		
		System.out.println("Enter the array elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum=sum+a[i];
		}
		System.out.println("Sum of the afrray Array is : " + sum);
		return sum;
	}
	

	public static void main(String[] args) 
	{
		//int[] a= {10,20,30,40,50};
		
		//for(int i=0;i<a.length;i++)
		//System.out.println("a["+i+"]="+a[i]);
		
		ArrayDemo obj=new ArrayDemo();
		int count = obj.arrayDemo();
		System.out.println("sum of array in outside is : " + count);
	
	}

}
