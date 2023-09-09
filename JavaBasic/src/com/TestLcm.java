package com;

public class TestLcm {

	public static void main(String[] args) {
		int num1=10,num2=62,lcm;
		int max=num1>num2?num1:num2;
		while(true)
		{
			if(max%num1==0 && max%num2==0)
			{
				lcm=max;
				break;
			}
			max++;
		}
		System.out.println("maximum number is:"+max);

	}

}
