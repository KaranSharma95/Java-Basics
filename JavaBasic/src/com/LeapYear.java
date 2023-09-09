package com;

import java.util.Scanner;

public class LeapYear {
	void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println(year+"This is leap year:");
			}
			else
			{
				System.out.println(year+"Is not leap year:");
			}
		}
		else
		{
			if(year%4==0)
			{
				System.out.println(year+"Is leap year:");
			}
			else
			{
				System.out.println(year+"IS not leap year:");
			}
		}
	}
	public static void main(String args[])
	{
		LeapYear ob=new LeapYear();
		ob.display();
	}

}
