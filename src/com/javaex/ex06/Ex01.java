package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		
		Integer result = i01 + i02;
		
		
		System.out.println(result);
		
		int i10 = 7;
		//박싱
		Integer i11 =10;    // Intger i11 =new Integer(10) 같은말
		
		Integer i100 = 15;
		//언박싱
		int i101 = i100;
		
	System.out.println("===문자열 --> 정수");
		
		Integer i999 = new Integer(111); // 필요없음 스태틱에 기본으로Integer.parseInt가 있기떄문
		//Integer i999 = 999; 
		int num =Integer.parseInt("12345");  // int num 으로 받아야함 
		System.out.println(num);
		
		
		//바로 응용 실제에로 이렇게 많이 씀
		int num2 = Integer.parseInt("12345");
		System.out.println(num2);
		
		
		
		//정수 -- > 문자열로 바꾸라
		String str = new String("hi"); // 메모리 잡으려구 hi 넣음 
		String strResult = str.valueOf(123456);
		
		System.out.println(strResult);
		
		String result1 = str.valueOf(123456);
		System.out.println(result1);
		
		
		//정수 --> 문장열로 많이 사용
		String result2 = ""+9876;
		System.out.println(result2);
		
		
		String yn = "y"; //사용자가 입력한 값
		String retry = "y";
		
		
		if(yn.equals("y")) {
			System.out.println("게임 다시시작");
		}
		
		 // equals () 사용 팁 --> 널 포인트 상황이 발생하지않는다.
		
		if("y".equals(yn)) {
			System.out.println("게임다시시작");
		}
		
		
		
	}
}
