package com.PractiseQues;

import java.util.Scanner;

public class ArrayReturn {
	static int [] input()
	{
		int i,n;
		int[] arr=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	void display(int []a)
	{
		System.out.println("Entered Array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		ArrayReturn ob=new ArrayReturn();
		ob.display(input());

	}

}
