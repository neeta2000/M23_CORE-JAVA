package com.cg.array;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		int arr[][][]= {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
		System.out.println(arr[0][0][0]);
		System.out.println(arr[1][0][2]);
		System.out.println(arr[1][1][1]);
		System.out.println(arr[0][1][1]);

	}

}
