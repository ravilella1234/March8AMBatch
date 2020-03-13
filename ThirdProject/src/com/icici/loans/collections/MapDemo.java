package com.icici.loans.collections;

import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		h.put(90, 100);
		h.put(100, 200);
		h.put(70, 300);
		h.put(10, 400);
		h.put(30, 500);
		h.put(50, 100);
		
		System.out.println(h);
		
		System.out.println(h.get(40));

	}

}
