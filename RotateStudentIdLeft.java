package com.codegnan.arrays;

public class RotateStudentIdLeft {
	    public static void rotateStudentIdLeft(int[] arr) {
	        // check if array has at least 1 element
	        if (arr == null || arr.length == 0) {
	            return;
	        }

	        int first = arr[0]; // store first element

	        // shift all elements to left
	        for (int i = 0; i < arr.length - 1; i++) {
	            arr[i] = arr[i + 1];
	        }

	        // place the first element at last
	        arr[arr.length - 1] = first;
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

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3};
	        rotateStudentIdLeft(arr1);
	        printArray(arr1); // [2, 3, 1]

	        int[] arr2 = {5, 11, 9};
	        rotateStudentIdLeft(arr2);
	        printArray(arr2); // [11, 9, 5]

	        int[] arr3 = {7, 0, 0};
	        rotateStudentIdLeft(arr3);
	        printArray(arr3); // [0, 0, 7]
	    }
	}

	


