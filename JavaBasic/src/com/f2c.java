package com;

import java.util.Scanner;

public class f2c {
 public static void main(String []args)
 {
	 float c,f;
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter the celcius:");
	 c=sc.nextFloat();
	 
	 f=c*9/5+32;
	 System.out.println(f+"fahrenheit");
 }
}
