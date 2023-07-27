package main.java.operator;

import java.util.*;

public class OperatorEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		
		
		while(true) {
			System.out.println("문자 하나 입력");
			String input = sc.nextLine();
			ch = input.charAt(0);
			
			if('0' <= ch && ch <= '9') {
				System.out.println("입력한 문자는 숫자");
			}
			
			if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
				System.out.println("입력한 문자는 알파벳");
			}
			
			if( ch == '!') {
				System.out.println("종료");
				break;
			}
		}
		
	}
}
