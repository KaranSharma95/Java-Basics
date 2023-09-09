package com.PractiseQues;

import java.util.Scanner;

public class MergeArray {
	int [] input()
	{
		int n;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	int [] sort(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			
		return a;
	}
	
	
	void merge(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		 c[i]=a[i];
		for(int i=0;i<b.length;i++)
			 c[a.length+i]=b[i];
		for(int i=0;i<c.length;i++)
			 System.out.println(c[i]);
		
		
	}
public static void main(String[] args) {
		MergeArray t=new MergeArray();
		int []a=t.input();
		int []b=t.input();
		int []d=t.sort(a);
		int []e=t.sort(d);
		t.merge(a, b);

	}
