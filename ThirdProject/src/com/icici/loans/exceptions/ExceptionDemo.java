package com.icici.loans.exceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		int x=10;
		
		 
		
		int nr,dr,result;
		Scanner sc=new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("Enter the nr value : ");
			nr=sc.nextInt();
			System.out.println("Enter the denominator value : ");
			dr=sc.nextInt();
			
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			}
			
			catch (Exception e) {
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println("Denominator value should be greater than zero....");
			}

			
		}

	}

}
