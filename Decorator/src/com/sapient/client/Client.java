package com.sapient.client;

import com.sapient.service.Palindrome;
import com.sapient.service.PalindromeBuffer;

public class Client {

	public static void main(String[] args){
		String[] arr = {"amar", "nitin", "maytas", "mom"};
		PalindromeBuffer buff = new PalindromeBuffer(new Palindrome());
		buff.checkPalindrome(arr);
	}
}
