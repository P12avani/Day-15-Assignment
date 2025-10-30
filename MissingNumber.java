package com.codegnan.arrays;

public class MissingNumber {
	    public static int missingNumber(int[] arr) {
	        int firstNumber = arr[0];
	        int lastNumber = arr[arr.length - 1];
	        int n = arr.length + 1;

	        int expectedSum = (n * (firstNumber + lastNumber) / 2);
	        int actualSum = 0;

	        // calculate the actual sum of elements in array
	        for (int num : arr) {
	            actualSum += num;
	        }

	        int missingNumber = expectedSum - actualSum;
	        return missingNumber;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 4, 5};
	        System.out.println("Missing number: " + missingNumber(arr1));
	        int[] arr2= {2,3,5,6};
	        System.out.println("Missing number: " + missingNumber(arr2));
	        int[] arr3= {10,11,13,14};
	        System.out.println("Missing number: " + missingNumber(arr3));
	    }
	}


