package com.PractiseQues;

import java.util.Scanner;


public class ArraySum {
	void sum(int []a)
	{
		int sum=0;
		int sum1=0;
		int count=0;
		 for(int i=0;i<a.length;i++)
		  {
			  sum +=a[i];
		  }
		System.out.println("The sum using foreach loop is:");
		 for(int i: a)
		 {
			 sum1+=i;
			 
		 }
		 for(int j: a)
		 {
			 count++;
			 
		 }
		 System.out.println(sum1);
		 System.out.println("The sum is:"+sum);
		 //System.out.println("The count:"+count);
		 System.out.println("The average is:"+sum/a.length);
		 
		System.out.println("sum using count:"+sum/count);
	}

	
	public static void main(String[] args) {
	  int i,n;
	  int[] ar=new int[5];
	  ArraySum  ob=new ArraySum();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("How many numbers you want to enter:");
	  n=sc.nextInt();
	  System.out.println("Enter the Array:");
	  for(i=0;i<n;i++)
	  {
		  ar[i]=sc.nextInt();
	  }
	  ob.sum(ar);
	  

	}

}
