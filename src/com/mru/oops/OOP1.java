package com.mru.oops;

class Parent1{
	int x = 200;
}

class Child1 extends Parent1{
	int y = 100;
}

public class OOP1 {

	public static void main(String[] args) {
		Child1 obj1 = new Child1();
		int num1 = obj1.x;
		int num2 = obj1.y;
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
