package main.java.operator;

import java.util.*;

public class OperatorEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		
		
		while(true) {
			System.out.println("���� �ϳ� �Է�");
			String input = sc.nextLine();
			ch = input.charAt(0);
			
			if('0' <= ch && ch <= '9') {
				System.out.println("�Է��� ���ڴ� ����");
			}
			
			if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
				System.out.println("�Է��� ���ڴ� ���ĺ�");
			}
			
			if( ch == '!') {
				System.out.println("����");
				break;
			}
		}
		
	}
}
