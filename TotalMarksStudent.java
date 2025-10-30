package com.codegnan.arrays;

public class TotalMarksStudent {
	
  public static int totalMarksStudent(int[] arr){
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];	
	}
	 return sum;
	
}
	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		System.out.println(totalMarksStudent(arr1));
		int[] arr2= {5,11,2};
		System.out.println(totalMarksStudent(arr2));
		int[] arr3= {7,0,0};
		System.out.println(totalMarksStudent(arr3));

	}

}
