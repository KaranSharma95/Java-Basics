package com;

import java.util.Scanner;
/*
public class StdInfo {
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter THe Details of Student:");
		System.out.println("Name:");
		String name=sc.nextLine();
		System.out.println("Roll No:");
		int rollno=sc.nextInt();
		System.out.println("Percentage:");
		float per=sc.nextFloat();
		System.out.println("Fees:");
		double fees=sc.nextDouble();
		System.out.println("Gender (M/F):");
		char gen=sc.next().charAt(0);
	}
	void DisplayInput()
	{
		System.out.println("Details of Student:-");
		System.out.println("Name:\n"+name);
		System.out.println("Roll No:-\n"+rollno);
		System.out.println("Percentage:-"+per);
		System.out.println("Paid Fees:-\n"+fees);
		System.out.println("Gender:\n"+gen);
	}

	public static void main(String[] args) {
		StdInfo ob=new StdInfo();
		ob.input();
		ob.DisplayInput();

	}

}
*/
public class StdInfo {
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter THe Details of Student:");
		System.out.println("Name:");
		String name=sc.nextLine();
		System.out.println("Roll No:");
		int rollno=sc.nextInt();
		System.out.println("Percentage:");
		float per=sc.nextFloat();
		System.out.println("Fees:");
		double fees=sc.nextDouble();
		System.out.println("Gender (M/F):");
		char gen=sc.next().charAt(0);
		
		System.out.println("Details of Student:-");
		System.out.println("Name:"+name);
		System.out.println("Roll No:-"+rollno);
		System.out.println("Percentage:-"+per);
		System.out.println("Paid Fees:-"+fees);
		System.out.println("Gender:-"+gen);
	}
	
	public static void main(String[] args) {
		StdInfo ob=new StdInfo();
		ob.input();

	}

}