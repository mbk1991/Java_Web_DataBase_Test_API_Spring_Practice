package main.java.variable;

public class VariableOverflow {

	public static void main(String[] args) {
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		
		//최대값 + 1 은 최소값, 최소값 -1은 최대값이 되는 무한 굴레의 구조
		System.out.println(maxInt + 1);
		System.out.println(minInt);
		
		System.out.println(maxInt);
		System.out.println(minInt - 1);
		
		

	}

}
