package com;
// coprime are thos whose hcf is 1.
public class TestCoPrime {

	public static void main(String[] args) {
		int num1=1,num2=15;
		int hcf=0;
		for(int i=1;i<=num1 && i<=num2;i++)
		{
			if((num1%i==0) && (num2%i==0))
			{
				hcf=i;
			}
		}
		if(hcf==1)
		{
			System.out.println(hcf+"The number is coPrime:");
		
		}
		else 
		{
			System.out.println(hcf+"The number is not coPrime:");
		}

	}

}
