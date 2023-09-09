package com;

import java.util.Scanner;

public class c2f {
 public static void main(String []args)
 {
	 float c,f;
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter the fahrenheit:");
	 f=sc.nextFloat();
	 
	 c=((f-32)*5)/9;
	 System.out.println(c+"celcius");
 }
}

/*c=((f-32)*5)/9; "fahrenheit to celcius"
  f=(c*9/5)+32; // f=c*9/5+32; "celcius to fahrenhite"*/
