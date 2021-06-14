package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {
		
		Object obj01 = new Object();
		System.out.println( obj01.hashCode());
		System.out.println(obj01.getClass());
		System.out.println(obj01.toString());
		System.out.println( obj01.equals(obj01));
		
		
		
		//getClass --> 클래스 정보
		System.out.println("obj.getClass()======");
		System.out.println(obj01.getClass());
		System.out.println("obj.getClass()======");
		
		
		//hashCode --> 주소값 ( 실제 주소값은 아님 ) 
		System.out.println("obj01.hashCode()======");
		System.out.println( obj01.hashCode());
		System.out.println("obj01.hashCode()======");
		
		
		
		Object o01 =new Object();
		Object o02 =new Object();
		Object o03 =new Object();
		
		System.out.println( o01.hashCode());
		System.out.println( o02.hashCode());
		System.out.println( o03.hashCode());
		
		
		//toString() -- >  객체의 값 정보
		System.out.println("===========to String=====");
		System.out.println(obj01.toString());
		System.out.println("================");
		
		
		//equals() --> 객체가 같은지 비교
		System.out.println("===========equals=====");
		System.out.println( obj01.equals(obj01));
		System.out.println("===========equals=====");
		
		
		
		
		/*
		Point p01 = new Point(1,1);
		System.out.println( p01.toString());
		*/
	}

}
