package main.java.variable;

public class VariableEx {
	
	/**
	 * 자바독 html 파일이 생성되는지 확인
	 * @param args
	 */
	public static void main(String[] args) {
		
		//2진수 리터럴의 접두어 0b
//		int a = 0b100100;
//		System.out.println(a);
		
		//2진수 리터럴 문자열을 parseInt 시 NumberFormatException 발생
//		String s = "0b100100";
//		System.out.println(Integer.parseInt(s));
		
		//실수형을 16진 지수형태로 표현할 수 있다.
//		double d = 0x0.2p-1;
//		System.out.println(d); //0.0625

		//정수형에 리터럴에  '_'를 구분자로 사용하는 것이 가능하다.
//		int i = 1_000_000_000;
//		System.out.println(i);
		
		System.out.println("Hello World!");
	}
}
