package com.sgtesting.methodsprograms;
class MulMatrix{
	void multiplication (int a[][],int b[][]) {
		int c[][]= new int [3][3];
		
		for(int i=0; i<3; i++) {
        for(int j=0; j<3; j++) {
        	c[i][j]=0;
        	for(int k=0; k<3; k++)
        	{
        		
        c[i][j]=a[i][k]*b[k][j];
        }
	    }
        }
         displayMatrix(c);
        }
      public void displayMatrix (int a[][]) {
	  for(int i=0; i<a.length; i++) {
	  for(int j=0; j<a[i].length; j++) {
	   System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
		
}
public class Multy {

	public static void main(String[] args) {
	int a[][] = {{2,2,2,},{3,3,3},{1,1,1}};
	int b[][] = {{2,2,2,},{1,1,1},{3,3,3}};
	MulMatrix obj = new MulMatrix();
	obj.multiplication(a,b);

	}

}
