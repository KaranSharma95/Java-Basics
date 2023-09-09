//write a prog to find sum of two numners using java class concept:
package com;

import java.util.Scanner;

public class TestSum {
  int num1,num2;
   void input()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the two number:");
	   num1=sc.nextInt();
	   num2=sc.nextInt();
   }
   int Sum()
   {
	   int sum=num1+num2;
	   System.out.println("the sum is:"+sum);
	   return sum;
   }
   int sub()
   {
	   int sub=num1-num2;
	   System.out.println("the sub is:"+sub);
	   return sub;
   }
   int Mul()
   {
	   int mul=num1*num2;
	   System.out.println("the mul is:"+mul);
	   return mul;
   }
   int Div()
   {
	   int div=num1/num2;
	   System.out.println("the div is:"+div);
	   return div;
   }
	public static void main(String[] args) {
		TestSum t=new TestSum();
		//int s,su,m,d;
		t.input();
		t.Sum();
		t.sub();
		t.Mul();
		t.Div();
		
		/*System.out.println("the sum is:"+s);
		System.out.println("the sub is:"+su);
		System.out.println("the mul is:"+m);
		System.out.println("the div is:"+d);*/
	}

}
//a class can contain data members and member method
//functin is a block of code which execute independently.
//method is called using a variable.