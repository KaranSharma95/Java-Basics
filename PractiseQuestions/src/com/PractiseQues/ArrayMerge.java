package com.PractiseQues;

import java.lang.reflect.Array;

public class ArrayMerge {
	public static void merge(int[] arr1,int[] arr2,int[] arr3,int n1,int n2)
	{
		int i=0,j=0;
		int k = 0;
		/*while(i<n1)
		{
			arr3[k++]=arr1[i++];
		}
		
		while(i<n2)
		{
			arr3[k++]=arr2[i++];
		}
		*/
		
		for(i=0;i<n1;i++)
		{
			arr3[k]=arr1[i];
			k++;
		}
		
		for(j=0;j<n2;j++)
		{
			arr3[k]=arr2[j];
			
		}
		//Array.sort(arr3);
	}

	public static void main(String[] args) {
		
		int [] arr1= {1,2,3,4,5};
		int[] arr2= {4,5,7,3,9};
		int n1=arr1.length;
		int n2=arr2.length;
		int[] arr3=new int[n1+n2];
		merge(arr1,arr2,arr2,n1,n2);
		for(int i=0;i<n1;i++)
		{
		  System.out.println("first Array: "+arr1[i]);
		}
		
		for(int i=0;i<n2;i++)
		{
		  System.out.println("Second Array: "+arr2[i]);
		}
		for(int i=0;i<n1+n2;i++)
		{
		  System.out.println("Merged Array: "+arr3[i]);
		}
	}

}
