package com.sgtestingconstructorprograms;
class Prime
{
	Prime(int a)
	{
		{
			if ((a%2!=0) && (a%3!=0))
			{
			System.out.println(" the given number is prime number");
			}
			else
					{
						System.out.println("the given number is not prime number");
					}
				}
			}
		}


public class PrimeDemo {

	public static void main(String[] args) {
            
        Prime obj=new Prime(12);
        Prime obj2=new Prime(5);
      }

}
