package com;

public class Reverseofnumber {

	public static void main(String[] args) {
		int n=700, reversed=0;
		while (n!=0) {
			int digit = n%10;
			reversed = reversed*10+digit;
			n/=10;
		}
		System.out.println("Reversed number is:"+reversed);

	}

}
