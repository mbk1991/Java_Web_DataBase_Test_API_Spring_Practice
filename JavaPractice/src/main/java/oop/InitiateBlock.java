package main.java.oop;

public class InitiateBlock {
	
	public static void main(String[] args) {
		System.out.println(StaticClass.getA());
		
		StaticClass sc = new StaticClass();
		System.out.println(sc.getB());
	}
}


class StaticClass{
	private static int a;
	private int b;
	/*
	 * Ŭ���� �ʱ�ȭ ��ϰ� �ν��Ͻ� �ʱ�ȭ ���
	 */
	
	static {
		a = 123;
	}
	{
		b = 321;
	}
	
	public StaticClass() {
		
	}
	
	public static int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
}
