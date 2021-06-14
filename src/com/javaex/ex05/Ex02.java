package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		
		String a = new String (" abcd");
		String b = new String (",efg ");

		System.out.println( a.concat(b)); // a + b 합쳐라 
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("===============================");
		
		a = a.concat(b); //  합쳐라 a  + b  그리고 a에  저장해
		System.out.println(a);
		
		
		a = a.trim();		// 공백을 없애줌 
		System.out.println(a);
		System.out.println("-----"+a+"--------");
		System.out.println(a);
		
		a = a.replace("ab", "12");  //문자열 ab 를 --> 12 로 바꾸겠다.
		System.out.println(a);
		
		System.out.println("===============================");
		
		String[] sArray = a.split(","); // 콤마 기준으로 배열로 나눠서 표기
		for(int i= 0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println("===============================");
		
		String str = "Hello java!"; // 배열 숫자로 문자열 출력
		
		System.out.println(str.charAt(6));   // 6 자리 출력
		
		System.out.println("===============================");
		String result = str.substring(3);      //3자리 부터 시작
		System.out.println(result);
		
		String result2 = str.substring(3,8);   //3자리 부터시작 7까지 출력
		System.out.println(result2);
		
	}

}
