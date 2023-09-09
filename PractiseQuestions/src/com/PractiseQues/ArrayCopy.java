package com.PractiseQues;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2=new int[arr1.length];
		
		arr2=arr1;
		System.out.println("Original Array:");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\nElements of copied array:");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}
}