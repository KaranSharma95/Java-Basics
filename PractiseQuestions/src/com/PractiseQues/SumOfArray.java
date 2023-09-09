package com.PractiseQues;

import java.util.Scanner;

public class SumOfArray {
	void sum(int a, int b)
	{
		Scanner sc=new Scanner(System.in);
		int []arr1=new int[10];
		int []arr2=new int[10];
		int []arr3=new int[arr1.length];
		System.out.println("Enter the elements of first array:");
		for(int i=0;i<a;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter rhe elements of second array:");
		for(int i=0;i<a;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<a;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		System.out.println("The result");
		for(int i=0;i<a;i++)
		{
		System.out.print(arr3[i]+" ");
		}
	}

	public static void main(String[] args) {
		SumOfArray ob=new SumOfArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of the two array:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b)
		{
			ob.sum(a,b);
		}
		else 
		{
			System.out.println("Enter the same array range");
		}

		
	}

}
