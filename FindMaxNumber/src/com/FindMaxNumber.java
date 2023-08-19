package com;

public class FindMaxNumber {
public static void main(String[] args) {
	int arr[]= {3,4,2,5,9,7};
	int max=0;
	for(int i=0;i<arr.length;i++)
	{
		max=arr[i]<max?max:arr[i];
		
	}
	System.out.println("Max number is "+max);
}
}
