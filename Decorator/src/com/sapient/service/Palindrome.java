package com.sapient.service;

public class Palindrome {

	public void checkPalindrome(String str){
		StringBuffer sb = new StringBuffer(str);
		if(sb.reverse().toString().equals(str))
			System.out.println(str+" is palindrome");
		else 
			System.out.println(str+" is not palindrome");
	}
}
