package com.sgtesting.methodsprograms;
class DeccendingSort{
	public void sort (int a[]) {
		int tem=0;
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a.length; j++) {
				if(a[i]>a[j]) {
					tem=a[i];
					a[i]=a[j];
					a[j]=tem;
				}
			}

		}
		displayArray(a);
	}
	void displayArray(int a[]) {
		for (int i=0;i<a.length; i++) {
			System.out.println(a[i]+"");
		}
	}
}
public class Excrise7 {

	public static void main(String[] args) {
		int arr[] = {9,7,1,6,4,5,2};
		DeccendingSort obj = new DeccendingSort();
		obj.sort(arr);
		
	}

}
