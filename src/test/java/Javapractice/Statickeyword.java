package Javapractice;

public class Statickeyword { 
	
	//Static keyword is mainly used to declare the static methods and its variable
	//No need to create class instance in the main method
	
	//static variable can be accessed by the all the public methods 
	
	static int c=30;
	public int X=100; 
	public static int mystaticmethod(int a, int b) {
		//a=1;  b=2; 
		return a+b; 
	}

	public void sum(int a, int c) {
		int totalvalue = a+c; 
		System.out.println("total value in the void method : " +totalvalue);
	}
	public static void main(String [] args) {   
		//Statickeyword S=new Statickeyword(); 
		int total = Statickeyword.mystaticmethod(1,2);    
		System.out.println("Total value is : " +total); 
		
		Statickeyword S=new Statickeyword();
		S.sum(100,200); 
		
		
	}
	
}
