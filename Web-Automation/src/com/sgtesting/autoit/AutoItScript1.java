package com.sgtesting.autoit;

public class AutoItScript1 {

	public static void main(String[] args) {
		excuteautoit();
	}
	private static void excuteautoit()
	{
		try
		{
           Runtime.getRuntime().exec("D:\\ExampleAutomation\\Autoit\\ExampleAutoitScript.exe");
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}



