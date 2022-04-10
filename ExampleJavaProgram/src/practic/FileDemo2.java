package practic;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
		//createfolder();
		//createNestedfolder();
		renameFolder();
		//deleteFolder();
	}
	private static void createfolder()
	{
		File f1=new File("F:\\gouli\\sunil\\rahul");
		f1.mkdir();
	}
private static void createNestedfolder()
{
	File f1=new File("F:\\gouli\\sunil\\rahul\\ram\\sham\\bham\\google\\netflix\\om");
	f1.mkdirs();
}
private static void renameFolder()
{
	File f1=new File("F:\\gouli\\sunil");
	File f2=new File("F:\\gouli\\microsoft");
	f1.renameTo(f2);
}
private static void deleteFolder()
{
	File f2=new File("F:\\gouli\\kashinath");
	f2.delete();
}
}




