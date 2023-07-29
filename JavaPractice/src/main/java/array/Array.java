package main.java.array;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4,9,8,7,0};

//		copyArr(ar r);
//		findMax(arr);
		
		
		//Number 배열을 만들면 정수와 실수를 하나의 배열에 담을 수 있는데 사용할 일이 있을까.
		Number[] n = new Number[] {1,	1.1f,	1.123};
		System.out.println(Arrays.toString(n));
		//Object 배열을 만들면 어떤 타입이든 하나의 배열에 담을 수 있는데 사용할 일이 있을까?
		Object[] o = new Object[] {1, "가나다", 'A', 1.123, 1.1f};
		System.out.println(Arrays.toString(o));
		
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
