package com.sorting;

import java.util.Stack;

public class InsertionSort {

	public static void main(String[] args) {


		/**
		 * @InsertionSort 
		 * 
		 * 
		 * Insertion sort is like sorting the playing cards on your hand. We insert the numbers one by
		 * one in sorted manner.
		 * 
		 * Algorithm : Given an array of size n : like int a[n]
		 *               
		 *             We iterate from i=1 to n and compare a[i] in a[0]..a[i]
		 *             if a[i....n] < a[0...i]
		 *             swap (a[i..n], a[0..i])
		 *             till the smallest number is reached at its right position.
		 * 
		 * Time Complexity: O(n*n) 
		 * Auxiliary Space: O(1)
		 * 
		 * Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted 
		 * in reverse order. And it takes minimum time (Order of n) when elements are already sorted.

			Algorithmic Paradigm: Incremental Approach

			Sorting In Place: Yes

			Stable: Yes

			Online: Yes

			Uses: Insertion sort is used when number of elements is small. 
			It can also be useful when input array is almost sorted, 
			only few elements are misplaced in complete big array.
			
		 */
		
		int[] a = {5,1,4,7,2,3,6,89,-2,-25,0,0,5,6,10,15};
		
		for (int i=1; i<a.length ; i++) {
			int j = i-1;
			while (j>=0 && a[i] < a[j]) {
				int k = a[j];
				a[j] = a[i];
				a[i] = k;
				j--;
				i--;
			}
			
		}
		
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
