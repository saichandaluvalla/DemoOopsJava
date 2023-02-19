package Encapsulation;

public class BankAccount {
	
	private int number1;
	private int number2;
	
	/*
	 * public int getnumber1() { return number1;
	 * 
	 * }
	 * 
	 * public void Setnumber1(int number1) { this.number1=number1; }
	 * 
	 * 
	 * public int getnumber2() { return number2; }
	 * 
	 * 
	 * public void Setnumber2(int number2) { this.number2=number2; }
	 * 
	 * 
	 * 
	 * public static void main(String [] args) { BankAccount ba=new BankAccount();
	 * ba.Setnumber1(20); ba.Setnumber2(10);
	 * 
	 * System.out.println("number1 value is :" +ba.getnumber1());
	 * System.out.println("number2 value is :" +ba.getnumber2());
	 * 
	 * }
	 */
	
	//Add two numbers using Encapsulation in Java
	
	public void addnumbers(int number1, int number2) {
		this.number1=number1;
		this.number2=number2;
		}
	public int sum(int number1, int number2) {
		return number1+number2;
	}
	
	public int mult(int number1, int number2) {
		return number1*number2;
	}
	
	
	public static void main(String[] args) {
		BankAccount B=new BankAccount();
		B.sum(10,20);
		B.mult(2,5);
		
		System.out.println("sum of the numbers is : " +B.sum(10,20));
		System.out.println("mult of the numbers is : " +B.mult(2,5));

	}
}
