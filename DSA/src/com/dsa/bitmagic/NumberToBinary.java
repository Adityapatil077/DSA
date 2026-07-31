package com.dsa.bitmagic;

public class NumberToBinary {

	public static void main(String[] args) {
		
		// InBuild Method provided By Java
		System.out.println(Integer.toBinaryString(6));
		
		StringBuilder result = new StringBuilder();
		int num = 6;
		int rem = num;
		while(rem != 0) {
			 result.insert(0, rem%2);
			 rem = rem / 2;
		}
		
		System.out.println(result.toString());

		/*
		 * 
		 
		StringBuilder result = new StringBuilder();
		int num = 7;
		int rem = num;
		while(rem != 0) {
			 result.append(rem%2);
			 rem = rem / 2;
		}
		
		System.out.println(result.reverse().toString());
		
		 *
		 */
	}

}
