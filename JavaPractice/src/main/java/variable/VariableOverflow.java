package main.java.variable;

public class VariableOverflow {

	public static void main(String[] args) {
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		
		//�ִ밪 + 1 �� �ּҰ�, �ּҰ� -1�� �ִ밪�� �Ǵ� ���� ������ ����
		System.out.println(maxInt + 1);
		System.out.println(minInt);
		
		System.out.println(maxInt);
		System.out.println(minInt - 1);
		
		

	}

}
