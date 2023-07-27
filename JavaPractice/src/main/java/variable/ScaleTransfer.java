package main.java.variable;

import java.util.*;

public class ScaleTransfer {
	public static void main(String[] args) {
		
		int input = 125;
		
		String strBinary = toBinary(input);
		System.out.println("십진수 "+input+"을 2진수로 변환 " + strBinary);
		
		String strOct = toOct(input);
		System.out.println("십진수 "+input+"을 8진수로 변환 " + strOct);
		
		String strHex = toHex(input);
		System.out.println("십진수 "+input+"을 16진수로 변환 " + strHex);
		
	}
	
	
	//10진수 입력을 2진수 문자열로 반환하는 메소드
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
	
	//10진수 입력을 8진수 문자열로 반환하는 메소드
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
	
	//10진수 입력을 16진수 문자열로 반환하는 메소드
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
