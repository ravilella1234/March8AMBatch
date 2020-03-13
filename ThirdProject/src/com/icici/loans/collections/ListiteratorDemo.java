package com.icici.loans.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListiteratorDemo 
{

	public static void main(String[] args) 
	{
		LinkedList<String> l = new LinkedList<String>();
		l.add("oaktech");
		l.add("oracle");
		l.add("orien");
		l.add("carrier");
		
		System.out.println(l);
		
		ListIterator<String> var = l.listIterator();
		while(var.hasNext())
		{
			String val = var.next();
			if(val.equals("oracle"))
				var.set("ravilella");
			else
				var.remove();
		}
		
		System.out.println(l);
	}

}
