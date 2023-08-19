package com;

public class FindSecoundMaxNumber {
public static void main(String[] args) {
	int arr[]= {2,3,7,4,1};
	int firstMax=0,secondMax=0;
	for(int i=0;i<arr.length;i++)
	{
		firstMax=arr[i]<firstMax?firstMax:arr[i];
		secondMax=secondMax>arr[i]&& secondMax<firstMax?secondMax:arr[i];
	}
	System.out.println(firstMax);
	System.out.println(secondMax);
}
}
