package com.sg.file.programs;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		createFolder();
		createNestedFolder();
}
	
	private static void createFolder()
	{
		File f1=new File("F:\\Sample\\Demo\\sunil");
		f1.mkdir();
	}
	private static void createNestedFolder()
	{
		File f1=new File("F:\\Sample\\Demo\\sunil\\rahul\\ram\\raju\\kichaa\\dachuu\\santosh\\manjula");
		f1.mkdirs();
	}
		
	
	private static void folderCollections()
	{
		try
		{
			File f1=new File("F:\\Sample\\Demo\\sunil");
			File f[]=f1.listFiles();
			for(int i=0;i<f.length;i++)
			{
				if(f[i].isDirectory())
				{
					String s=f[i].getPath();
					System.out.println(s);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}