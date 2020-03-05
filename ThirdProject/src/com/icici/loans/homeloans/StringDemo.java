package com.icici.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1="ravikanth";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('v'));
		
		
		//System.out.println("\n\n\n   **************************");
		
		String s2=new String(" Ravikanth");
		//System.out.println(s2);
		//System.out.println(s2.hashCode());
		
		//equals & ignorecase & contains
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("Kanth"));
		
		//lower & uppercase
		//System.out.println(s1.equals(s2));
		System.out.println(s2);
		System.out.println(s2.toLowerCase());
		
		
		System.out.println(s2.equals(s1));
		System.out.println(s2.toLowerCase().equals(s1));
		
		
		//starts-with & ends-with
		System.out.println(s1.startsWith("ravi"));
		System.out.println(s1.endsWith("kanth"));
		
		//subString
		System.out.println(s1.substring(2, 7));
		
		//replace
		System.out.println(s1);
		System.out.println(s1.replace(s1, "keerthan"));
		
		//concat
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		
		//trim spaces
		System.out.println(s1.equals(s2));
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println(s1.equals(s2.trim().toLowerCase()));
		
		String name="ravi kanth lella";
		System.out.println(name);
		String[] strarr = name.split(" ");
		//System.out.println(strarr[0]);
		//System.out.println(strarr[1]);
		//System.out.println(strarr[2]);
		for(String i : strarr)
			System.out.println(i);
		
		
		String a1=" ravi kanth ";
		System.out.println(a1.trim());
		System.out.println(a1.replace(' ', '_'));
	}

}
