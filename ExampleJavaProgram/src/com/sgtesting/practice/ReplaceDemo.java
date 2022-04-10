package com.sgtesting.practice;

public class ReplaceDemo {
public static void main(String[] args) {
	//replaceDemo();
	//getCharsFromString();
	//displaychar();
	//existanceOfString();
	compareString1();
}
	
	private static void replaceDemo()
	{
		String s="It is a banglore";
		System.out.println("Replaced String :"+s.replace("is", "was"));
		System.out.println("+++++++++++++");
	}
	private static void getCharsFromString()
	{
		String s="Java";
		char ch[]=s.toCharArray();
		for(char ch1:ch)
		{	
			System.out.println(ch1);
		     System.out.println("++++++++");
	}
	}
		
		private static void displaychar()
	{
		String s="java";
		for (int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
			
		}
	}
		private static void existanceOfString()
		{
			String s="It is a old kolhapurtemple";
			System.out.println("Starts With:"+s.startsWith("It"));
			System.out.println("Ends With :"+s.endsWith("temple"));
			System.out.println("Contains :"+s.contains("new"));
			System.out.println("+++++++++++++");
		}

		
	private static void compareString1()
{
	String s="sunil";
	String s1="SUNIL";
	System.out.println("s.equals(s1) :"+s.equals(s1));
	System.out.println("s.equalsIgnoreCase(s1) :"+s.equalsIgnoreCase(s1));
	System.out.println("+++++++++++++");
}
}

