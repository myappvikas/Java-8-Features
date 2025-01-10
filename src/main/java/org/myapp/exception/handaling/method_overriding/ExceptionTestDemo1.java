package org.myapp.exception.handaling.method_overriding;

public class ExceptionTestDemo1 {
	
	public static void main(String[] args) {
		
		Parent1 p1 = new Child1();
		//Parent1 p1 = new Parent1();
		p1.msg();
	}

}
class Parent1{
	void msg() {
		System.out.println("Parennt class method executed");
	}
}
class Child1 extends Parent1{
	void msg()throws ArithmeticException {
		System.out.println("Child class method executed");
	}
}
