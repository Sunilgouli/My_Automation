package com.sg.string1.programs;

public class LengthOfCharacter {
	static void findLength(String s) {
		char ch[]=s.toCharArray();
		int length=0;
		for (char c : ch) {
			length++;
		}
		System.out.println("String length :"+length);
	}

	public static void main(String[] args) {
		findLength("sunil is a good student");

	}

}

	