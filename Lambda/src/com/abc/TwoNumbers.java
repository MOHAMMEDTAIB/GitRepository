package com.abc;

import java.util.Scanner;

import com.abc.service.PowerFinder;


public class TwoNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		PowerFinder powers=(x,y)->{
			return Math.pow(x, y);
		};
	
		System.out.println("Enter two numbers:");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		System.out.println("Power of "+x1+ " raised to "+y1 +" is: "+ powers.power(x1,y1));
		sc.close();
	}


}
