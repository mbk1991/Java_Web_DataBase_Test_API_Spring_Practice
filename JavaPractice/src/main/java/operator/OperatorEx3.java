package main.java.operator;

public class OperatorEx3 {
	public static void main(String[] args) {
		//and, or, xor�� Ȱ��.
		//or�� ��Ʈ �����, and�� ��Ʈ ����, xor �� ������ ��ȣȭ ( xor�� �ٽ� �����ϸ� ������ ������ ���ư��� ���� �̿�)
		
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
