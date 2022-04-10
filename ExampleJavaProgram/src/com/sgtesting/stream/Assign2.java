package com.sgtesting.stream;

import java.io.BufferedReader;
import java.io.FileReader;

public class Assign2 {
	readContent();
}

private static void readContent1()
{
	BufferedReader br=null;
	int count=0;
	try
	{
		br=new BufferedReader(new FileReader("D:\\Sample1\\Demo\\Test1.txt"));
		String sLine=null;
		
		while((sLine=br.readLine())!=null)
		{
			count++;
			System.out.println(sLine);
			if (count==5)
			{
				System.out.println();
				System.out.println("Finished reading first 5 lines");
				System.out.println("---------------------------------------");
				System.out.println("Find the next  5 lines below");
				
			}
				
		}
	}catch(Exception e)
	{
		e.printStackTrace();
	}

	finally
	{
		try
		{
			br.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	System.out.println("-------------------------------------");
	System.out.println("Number  of lines:"+count);
}
}


