package Abstraction;

public class Circle extends Shape {
	
	void draw() {
		System.out.println("a value is : " +a);
		System.out.println("Draw a Circle");
	}

	@Override
	void total() {
    System.out.println("total value(C) for Circle is :" +c);		
	}

	@Override
	void mult() {
    System.out.println("mult for Circle is :" +(a*b));		
	}

}
