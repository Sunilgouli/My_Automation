package com.sg.string1.programs;

public class FindNumberOfWords {
	static void wordCount(String s) {
		System.out.println("Given String :"+s);
		String sArray[]=s.split(" ");
		int count=0;
		for (String s1 : sArray) {
			count++;
		}
		System.out.println("Words Count:"+count);
	}

	public static void main(String[] args) {
		String s="this is a book";
		wordCount(s);
	}

}



