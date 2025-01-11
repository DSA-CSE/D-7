package com.mru.oops;

class Test1 implements Interface1{
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
	
}