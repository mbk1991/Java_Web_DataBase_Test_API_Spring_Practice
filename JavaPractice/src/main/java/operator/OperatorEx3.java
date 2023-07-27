package main.java.operator;

public class OperatorEx3 {
	public static void main(String[] args) {
		//and, or, xor의 활용.
		//or로 비트 덮어쓰기, and로 비트 추출, xor 로 간단한 암호화 ( xor를 다시 수행하면 원래의 값으로 돌아가는 성질 이용)
		
		int a = 10;
		int b = 0xF; // 1111
		System.out.println(~a+1);		//-10
		System.out.println(a>>1);		//5
		System.out.println(a<<1);		//20
		
		System.out.println(toBinaryInt(a));
		System.out.println(toBinaryInt(a>>1));
		System.out.println(toBinaryInt(a<<1));
		System.out.println();
		System.out.println(toBinaryInt(a & b));
		System.out.println(toBinaryInt(a | b));
		System.out.println(toBinaryInt(a ^ b));
		System.out.println(toBinaryInt(a ^ b ^ b));
		
	}
	
	public static String toBinaryInt(int dec) {
		String bin = "00000000000000000000000000000000";
		String tmp = bin + Integer.toBinaryString(dec);
		return tmp.substring(tmp.length()-32);
	}
}
