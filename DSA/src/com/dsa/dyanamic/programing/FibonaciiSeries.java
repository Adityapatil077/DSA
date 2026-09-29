package com.dsa.dyanamic.programing;

import java.util.Arrays;

public class FibonaciiSeries {

	public int getFibonaciiNumber(int n) {
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		if(dp[n] != -1)
			return dp[n];
		else if(n<=1)
			return n;
		else 
			return getFibonaciiNumber(n-2)+getFibonaciiNumber(n-1);
	}
	
	public static void main(String[] args) {
		FibonaciiSeries fs = new FibonaciiSeries();
		System.out.println(fs.getFibonaciiNumber(10));
		
//		for(int i=0;i<=10;i++) {
//			System.out.println(fs.getFibonaciiNumber(i));
//		}
	}

}
