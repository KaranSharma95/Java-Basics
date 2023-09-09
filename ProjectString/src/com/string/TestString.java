package com.string;
import  java.lang.String;
import java.util.StringTokenizer;
// by literal
//by new keyword

public class TestString {

	public static void main(String[] args) {
		
		String name="Karan";//String literal(directly stores in SCP(String contast pool))
		String name1=new String("Arjun");
		char ch[]= {'t','h','a','k','u','r'};
				String name2=new String(ch);//it stores in heap
		System.out.println(name+" "+name1+" "+name2+" ");
		
		String s1="hello";
		String s2=new String("Hello");
		if(s1.equals(s2))
		
			System.out.println("equals:");
		else
			System.out.println("not equals:");
		
		System.out.println(s1==s2);
		
		
		if(s1.equalsIgnoreCase(s2))
			System.out.println("equals");
		else
			System.out.println("Not equals");
		

		String st1="apple";
		String st2="banana";
		System.out.println(st1.compareTo(st2));
		
		String st3="karan "+"Sharma ";
		st3=st3.concat("Sysboisys");
		System.out.println(st3);
		
		
		System.out.println(30+40+"karan sharma"+40+50);
		//first it will add the numbers and print the string and convert the numbers into string.
		
		System.out.println(st1.substring(2));
		System.out.println(st1.substring(0,2));
		
		System.out.println(st3.toLowerCase());
		System.out.println(st3.toUpperCase());
		
		//to remove space in string
		String st=" karan ";
		System.out.println(st.trim());
		
		//Finding length of string:
		
		String name3[]= {"karan","Arjun","Thakur"};
		for(int i=0;i<name3.length;i++)//it shows array's property
		System.out.println(name3[i].length());//with () it is method
		
		//using INTERN
		//intern uses for managing the memory(if there is a string in SCP, intern return the string...otherwise it add a string object in SCP and return)
		String stn=new String("SCP");
		String sti=stn.intern();
		System.out.println(sti);
		
		//Using Value of
		int a=5;
		String s=String.valueOf(a);
		System.out.println(s+20);
		
		//Using replace method
		String rep="Thakur mai aa raha hu";
		System.out.println("before replace:"+rep);
		String repstr=rep.replace("Thakur","Gabbar");
		System.out.println("After replace:"+repstr);
		
		//Using indexof
		System.out.println("Using index of");
		String indof="KaranSharma";
		System.out.println(indof.indexOf('a'));
		System.out.println(indof.indexOf('a',3));
		String substr="Sha";
		System.out.println(indof.indexOf(substr));
		System.out.println(indof.indexOf(substr,7));
		
		
				StringBuffer sb=new StringBuffer("helli");
				sb.append(123);
				System.out.println(sb);
				
				StringTokenizer stz=new StringTokenizer("My name,is,karan",",");	
				while(stz.hasMoreTokens())
				System.out.println(stz.nextToken());

				
	}
	
}
	
				