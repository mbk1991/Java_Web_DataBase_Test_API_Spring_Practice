package main.java.variable;

import java.util.*;

public class ScaleTransfer {
	public static void main(String[] args) {
		
		int input = 125;
		
		String strBinary = toBinary(input);
		System.out.println("������ "+input+"�� 2������ ��ȯ " + strBinary);
		
		String strOct = toOct(input);
		System.out.println("������ "+input+"�� 8������ ��ȯ " + strOct);
		
		String strHex = toHex(input);
		System.out.println("������ "+input+"�� 16������ ��ȯ " + strHex);
		
	}
	
	
	//10���� �Է��� 2���� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public static String toBinary(int dec) {
		StringBuilder sb = new StringBuilder();
		while(dec>1) {
			sb.append(dec % 2 + "");
			dec /= 2;
		}
		if(dec != 0) {
			sb.append(dec + "");
		}
		return sb.reverse().toString();
	}
	
	//10���� �Է��� 8���� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public static String toOct(int dec) {
		StringBuilder sb = new StringBuilder();
		while(dec>1) {
			sb.append(dec % 8 + "");
			dec /= 8;
		}
		if(dec != 0) {
			sb.append(dec + "");
		}
		return sb.reverse().toString();
	}
	
	//10���� �Է��� 16���� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public static String toHex(int dec) {
		StringBuilder sb = new StringBuilder();
		while(dec>1) {
			String tmp = (dec % 16 > 9)? (char)(dec % 16 + 55)+"" : dec % 16 + "";
			sb.append(tmp);
			dec /= 16;
		}
		if(dec != 0) {
			String tmp = (dec > 9)? (char)(dec + 55) + "": dec + "";
			sb.append(tmp);
		}
		return sb.reverse().toString();
		}
	
}
