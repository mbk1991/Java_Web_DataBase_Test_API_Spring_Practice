package main.java.operator;

public class OperatorEx {

	public static void main(String[] args) {
//		System.out.println(3.0/0); //infinity
		
		byte a = 1;
		byte b = 2;
//		byte c = a+b; //compile 에러 발생, short, byte는 int로 변환 후 계산되기 때문.
		
		float f = 3.123456f;
		//소수 4번째 자리로 변환하기
		float f2 = (int)(f * 10_000) / 10_000f;
		System.out.println(f2);
		
		//소수 4번째 자리에서 반올림하기
		double d3 = (int)(f * 10_000 + 0.5) / 10_000.0;
		System.out.println(d3);
		
		double d4 = Math.round(f * 10_000) / 10_000.0;
		System.out.println(d4);
		
		//음수의 나머지 연산
		System.out.println(10%7);
		System.out.println(-10%7);
		System.out.println(10%-7);
		System.out.println(-10%-7);
		
		int x = 0;
		char ch = ' ';
		
		x = 6;
		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6!=0 = %b%n",x,x%2==0||x%3==0 && x%6 !=0);
		
		

	}

}
