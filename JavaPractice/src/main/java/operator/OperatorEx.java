package main.java.operator;

public class OperatorEx {

	public static void main(String[] args) {
//		System.out.println(3.0/0); //infinity
		
		byte a = 1;
		byte b = 2;
//		byte c = a+b; //compile ���� �߻�, short, byte�� int�� ��ȯ �� ���Ǳ� ����.
		
		float f = 3.123456f;
		//�Ҽ� 4��° �ڸ��� ��ȯ�ϱ�
		float f2 = (int)(f * 10_000) / 10_000f;
		System.out.println(f2);
		
		//�Ҽ� 4��° �ڸ����� �ݿø��ϱ�
		double d3 = (int)(f * 10_000 + 0.5) / 10_000.0;
		System.out.println(d3);
		
		double d4 = Math.round(f * 10_000) / 10_000.0;
		System.out.println(d4);
		
		//������ ������ ����
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
