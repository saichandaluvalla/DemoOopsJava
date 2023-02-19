package Abstraction;

public class TestAbstraction {

	public static void main(String[] args) {
		
		Shape ST= new Circle();
		ST.draw();
		ST.total();
		ST.mult();
		
		Rectangle R=new ReactangleNext();
		R.total();
		R.mult();
		R.draw();
		
		
		

		

	}

}
