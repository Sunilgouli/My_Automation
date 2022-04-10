package com.testquestions;
class samp
{
	boolean vowel (char ch)
	{
		boolean vowel;
		switch (ch)
		{
		case 'a': case 'e': case 'i': case 'o': case 'u':
			vowel=true;
			break;
			default:
			vowel=false;
		}
		 return vowel;
		}
		
	}

public class Vowel {

	public static void main(String[] args) {
		samp obj = new samp ();
		char a='u';
		boolean val = obj.vowel(a);
		if (val)
		{
			System.out.println(a +"is vowel");
		}
		

	}

}
