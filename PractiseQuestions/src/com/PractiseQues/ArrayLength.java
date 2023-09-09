package com.PractiseQues;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array:");
		for(int i=0;i<a.length;i++)
		 {
			a[i]=sc.nextInt();
		 }
		System.out.println("Entered elements");
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		System.out.println("Count are:"+a.length);
	}

}
