package com.mru.oops;

/*interface Interface{
/*public void addition();
public int Subtraction(int num1, int num2);
public void Multiplication(int num1, int num2);
public int Division ();*/

/*class Test1 implements Interface1{
@Override
public void addition() {
    int num1 = 100;
    int num2  = 50;
    int res = num1+num2;
    System.out.println("Addition : "+res);
}

@Override
public int Subtraction(int num1, int num2) {
	int res = num1 - num2;
	return res;
}

@Override
public void Multiplication(int num1, int num2) {
      int result = num1 * num2;
      System.out.println("Multipilcation : "+result);
}

@Override
public int Division() {
	int num1 = 100;
	int num2 = 50;
	int res = num1/num2;
	return res;
}

}*/
public class Demo1 {

public static void main(String[] args) {
	Test1 obj = new Test1();
	obj.addition();
	int res1 = obj.Subtraction(100, 50);
	System.out.println("Subtraction : "+res1);
    obj.Multiplication(100, 50);
    int res2 = obj.Division();
    System.out.println("Division : "+res2);
    }

}