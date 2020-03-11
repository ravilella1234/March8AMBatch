package com.icici.loans.exceptions;

import java.util.Scanner;

public class UserException extends Exception
{

	public UserException(String string) 
	{
		super(string);
	}

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
				
		while (true) 
		{
			System.out.println("Enter the String :");
			str=sc.nextLine();
			try 
			{
				if (str.length() != 10) 
				{
					throw new UserException("String should be 10 character");
				} 
				else 
				{
					System.out.println(str);
					break;
				}
			} 
			catch (UserException e) 
			{
				e.printStackTrace();
			} 
			finally 
			{
				System.out.println("iam final msg...");
			}
		}

	}

}
