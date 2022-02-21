package com.abc.bean;

import java.util.Scanner;

import com.abc.services.Exercise2Services;
public class Exercise2 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Exercise2Services strObj=(str)->{
			String str2="";
			for(int i=0;i<str.length();i++) {
				str2=str2+str.charAt(i)+" ";
			}

			return str2;
			};

		System.out.println("Enter string:");
		String s=sc.nextLine();
		System.out.println("String after spaces is:"+strObj.spaceStr(s));
	}

}

