package com.sg.file.programs;

import java.io.File;

public class Assign1 {
	public static void main(String[] args) {
		   fileDetails();
		}
	    private static void fileDetails()
	    {
	    	try
	    	{
	    		File f1=new File("F:\\Cricket\\India\\viratkohili\\captainofindia\\rcbfranchise");
	    		f1.mkdirs();
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }

	}


