package com.abc.bean;

import java.util.Scanner;

import com.abc.services.Exercise3Services;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Exercise3Services obj=(username,password)->{
			if(username.equals("admin") &&
					password.equals("a123")) {
				return true;
			}
			return false;
		};
		
		System.out.println("Enter username and password:");
		String uname=sc.nextLine();
		String pass=sc.nextLine();
		System.out.println(obj.validate(uname, pass));
	}

}