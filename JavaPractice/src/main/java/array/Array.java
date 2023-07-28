package main.java.array;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4,9,8,7,0};

//		copyArr(arr);
		findMax(arr);
	}
	
	public static void copyArr(int ... arr) {
		//배열의 복사
		
				int[] tmp = new int[arr.length]; 
				System.arraycopy(arr,1,tmp,1,5);
				
				System.out.println(Arrays.toString(tmp));
				//[0, 2, 1, 6, 5, 4, 0, 0, 0, 0]

	}
	
	public static void findMax(int[] arr) {
		int max= arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
