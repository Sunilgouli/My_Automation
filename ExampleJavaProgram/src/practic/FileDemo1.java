package practic;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		//createfile();
		//renamefile();
		//deletefile();
		filecollections();
	}
	private static void createfile()
	{
		try
		{
			File f1 = new File ("F:\\sample\\Demo\\animals.txt");
			f1.createNewFile();
		} catch (Exception e)
		{
			e.printStackTrace();
		}


	}


	private static void renamefile()
	{
		try
		{
			File f1 = new File ("F:\\sample\\Demo\\animals.txt");
			File f2 = new File ("F:\\sample\\Demo\\sunil.txt");
			f1.renameTo(f2);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletefile()
	{
		try
		{
			File f2= new File ("F:\\sample\\Demo\\sunil.txt");
			f2.delete();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void filecollections()
	{
		try
		{
			File f1 = new File ("F:\\sample\\Demo\\");
			File f[] = f1.listFiles();
			for (int i=0; i<f.length; i++)
			{
				if (f[i].isFile())
{
	String s=f[i].getPath();
	System.out.println(s);
}
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
