package main.java.variable;

public class FloatingPoint {
	public static void main(String[] args) {
		int var1 = 1_000_000_000;
		float var2 = 1e9f;
		double var3 = 1e9;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f\n", f);
		System.out.printf("%X\n", i);
		
		int var4 = -2;
		byte var5 = -2;
		int var6 = (int) var5;
		
		System.out.println(Integer.toBinaryString(var4));
		System.out.println(Integer.toBinaryString(var6));
		
		float f2 = Float.MAX_VALUE;
		float f3 = Float.MIN_VALUE;
		System.out.println(f2);
		System.out.println(f3);
		
	}
	
}
