package com.practice.hackerrank;

public class Test {

	
	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int left = 0,right = 0;
		for(int i=0, j=arr.length-1; i<arr.length; i++, j--) {
			left += arr[i][i];
			right += arr[i][j];
		}
		System.out.println("Right :: "+right + "   left :: "+left);
		
	}
}
