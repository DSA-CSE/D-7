package com.mru.oops;

class Parent12{
	public void dbConn() {
		System.out.println("Data from Oracle..");
	}
}

class Child12 extends Parent12{
	public void dbConn() {
		System.out.println("Data from MongoDB...");
	}
}

public class OOP5 {

	public static void main(String[] args) {
		Child12 obj = new Child12();
		obj.dbConn();
		
		Parent12 obj1 = new Parent12();
		obj1.dbConn();

	}

}
