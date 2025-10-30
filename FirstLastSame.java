package com.codegnan.arrays;

public class FirstLastSame {
public static boolean firstLastSame(int[] arr) {
	if(arr.length>=0 && arr[0]==arr[arr.length-1]) {
		return true;
	}else {
		return false;
	}
}
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,1};
		System.out.println(firstLastSame(arr1));
		int[] arr2= {2,3,4,5,6};
		System.out.println(firstLastSame(arr2));

	}

}
