package com.sgtesting.methodsprograms;
class ResultArray{
	public void display (int a[], int b[]) {
		int c[] = new int [a.length+b.length];
		int index=0;
		for (int i=0; i<a.length; i++) {
			c[index]=a[i];
			index++;
		}
		for (int i=0; i<b.length;i++) {
			c[index]= b[i];
			index++;
		}
		displayArray(c);
		}
	void displayArray(int a[]) {
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]+" ");}
		}
		}

public class DisplayArray {

	public static void main(String[] args) {
	int a[] = {2,3,4,5};
	int b[] = {4,6,7};
	ResultArray obj = new ResultArray();
	obj.display(a, b);

	}

}
