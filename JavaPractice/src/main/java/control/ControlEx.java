package main.java.control;

public class ControlEx {
	public static void main(String[] args) {

		int count = 5;
		while (count-- > 0) {
			for (long i = 0; i < 2_100_000_000; i++) {
			}
			System.out.println(count+1);
		}
		
		//for���� �ݺ��� int�� �ִ밪�� �ʰ����� ������ �߻��Ѵ�.
		//i�� longŸ������ �����Ͽ��� ���������ε� �� �׷��ɱ�?
	}
}
