package com.sgtesting.methodsprograms;
class TwoDTo1D{
	public void convert (int a[][]) {
		int b[]= new int [a.length*a[0].length];
		int index=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				b[index]=a[i][j];
				index++;
			}
		}
		displayArray(b);
	}
	void displayArray(int a[]) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+" ");}
		}
	}

public class Two1 {

	public static void main(String[] args) {
		int a[][] = {{2,7,8},{2,6,4}};
		TwoDTo1D obj = new TwoDTo1D();
		obj.convert(a);

	}

}
