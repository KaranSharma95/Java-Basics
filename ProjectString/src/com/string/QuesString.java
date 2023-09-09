package com.string;
//takes a string from user and converts it into array of string:
import java.util.Scanner;

public class QuesString {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the string:");
		str=sc.nextLine();
		
		String []s=str.split(" ");
		for(String i:s)
		{
			System.out.println(i);
			
		}
		
	}
}