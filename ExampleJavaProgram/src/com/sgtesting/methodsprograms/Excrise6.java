
package com.sgtesting.methodsprograms;
class Fibonacci{
	public void findfibonacci() {
		int n1=0,n2=1,res;
		System.out.println(n1);
		System.out.println(n2);
		for (int i=3; i<=10; i++) {
			res=n1+n2;
			System.out.println(res);
			n1=n2;
			n2=res;

		}
	}
}

public class Excrise6 {

	public static void main(String[] args) {
		Fibonacci fs = new Fibonacci();
		fs.findfibonacci();

	}

}
