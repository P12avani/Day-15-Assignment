package com.codegnan.arrays;

public class MaximumEnd {
	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3};
	        makeMaxEnd(arr1);
	        printArray(arr1);

	        int[] arr2 = {11, 5, 9};
	        makeMaxEnd(arr2);
	        printArray(arr2);

	        int[] arr3 = {2, 11, 20};
	        makeMaxEnd(arr3);
	        printArray(arr3);
	    }

	    public static void makeMaxEnd(int[] arr) {
	        int first = arr[0]; // first test mark
	        int last = arr[arr.length - 1]; // last test mark

	        // find maximum of first and last
	        int max;
	        if (first > last) {
	            max = first;
	        } else {
	            max = last;
	        }

	        // make all elements equal to max
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = max;
	        }
	    }

	    public static void printArray(int[] arr) {
	        System.out.print("[");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i]);
	            if (i < arr.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }
	}

