package com.codegnan.arrays;

public class SecondHighestScore {

	    public static int secondHighestScore(int[] arr) {
	        int first = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;

	        for (int score : arr) { // loop through all elements
	            if (score > first) {
	                second = first;
	                first = score;
	            } else if (score > second && score < first) {
	                second = score;
	            }
	        }

	        return second;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {50, 75, 100, 25};
	        System.out.println("Second highest score: " + secondHighestScore(arr1));
	        int[] arr2 = {120, 80, 90, 60};
	        System.out.println("Second highest score: " + secondHighestScore(arr2));
	        int[] arr3 = {33, 45, 67, 67, 21};
	        System.out.println("Second highest score: " + secondHighestScore(arr3));
	    }
	}



