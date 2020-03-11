package com.icici.loans.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedDemo 
{
	
	public static void m1() throws Exception 
	{
		BufferedReader b = new BufferedReader(new FileReader("d://xyz.txt"));
	}

	public static void main(String[] args) throws Exception 
	{
		m1();

	}

}
