package main.java.control;

public class ControlEx {
	public static void main(String[] args) {

		int count = 5;
		while (count-- > 0) {
			for (long i = 0; i < 2_100_000_000; i++) {
			}
			System.out.println(count+1);
		}
		
		//for문의 반복이 int의 최대값을 초과하자 에러가 발생한다.
		//i를 long타입으로 선언하여도 마찬가지인데 왜 그런걸까?
	}
}
