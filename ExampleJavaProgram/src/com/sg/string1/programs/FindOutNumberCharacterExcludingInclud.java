package com.sg.string1.programs;

public class FindOutNumberCharacterExcludingInclud {
	private static void countWithSpaces(String s) {
		System.out.println("Given String:");
		System.out.println(s);
		char[] ch=s.toCharArray();
		int count=0;
		for (char c:ch) {
			count++;
		}
		System.out.println("Characters count including spaces : "+count);
	}
	private static void countWithoutSpaces(String s) {
		System.out.println("Given String:");
		System.out.println(s);
		s=s.replace(" ", "");
		char[] ch=s.toCharArray();
		int count=0;
		for (char c:ch) {
			count++;
		}
		System.out.println("Characters count Excluding spaces : "+count);
	}

	public static void main(String[] args) {
		String s="vivo mobile phone is the no 1 brand in india";
		countWithSpaces(s);
		System.out.println("------------------");
		countWithoutSpaces(s);

	}

}
