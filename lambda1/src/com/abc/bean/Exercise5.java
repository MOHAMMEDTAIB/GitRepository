package com.abc.bean;

import java.util.Scanner;
//import java.util.stream.LongStream;

import com.abc.services.ExerciseService5;


public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ExerciseService5 obj=(no)->{
			int fact=1;
			for(int i=no;i>=1;i--) {
				fact=fact*i;
			}
			
			return fact;
			
		};
		
		System.out.println("Enter num to find factorial:");
		int num=sc.nextInt();
		System.out.println(obj.findFacto(num));
		sc.close();

	}

}
