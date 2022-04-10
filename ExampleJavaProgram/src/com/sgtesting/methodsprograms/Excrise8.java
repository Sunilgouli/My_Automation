package com.sgtesting.methodsprograms;
class Prime{
	public void  print(){
		int res=0;
		for(int i=2; i<=50; i++){
		for (int j=2; j<i; j++){
		if(i%j==0){ 
		res=1;
		}
		
		}
			if (res==0){
			System.out.println(i);
			}
			res=0;
		}
	    }
	
}

public class Excrise8 {

	public static void main(String[] args) {
		Prime obj = new Prime();
		obj.print();
		
		

	}

}
