package com.codegnan.arrays;

public class BusRoutes {
	public static boolean busRoutes(int[] a,int[] b) {
		if(a[0]==b[0]||a[a.length-1]==b[b.length-1]) {
			return true;	
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {7,3};
		System.out.println(busRoutes(a,b));
		 int[] a1 = {1, 2, 3}; 
		 int[] b1 = {7, 3, 2};
		 System.out.println(busRoutes(a1,b1));
		 int[] a2 = {1, 2, 3};
		 int[] b2 = {1, 3};
		 System.out.println(busRoutes(a2,b2));
			

	}

}
