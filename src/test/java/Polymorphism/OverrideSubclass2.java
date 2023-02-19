package Polymorphism;

public class OverrideSubclass2 extends OverrideSubclass1 {


	public char method(char Saichand, char a) {
		return (char) (Saichand+a);  
	}

	public static void main(String [] args) {
		OverrideSubclass1 OS=new OverrideSubclass1();
		OS.method("Sai","Chand");
		OS.method(10,20); 
		OS.method('S' , 'A');

		System.out.println("String values : " + 		OS.method("Sai","Chand"));
		System.out.println("String values : " + 		OS.method(10,20));
		System.out.println("String values : " + 		OS.method('S','A'));



	}
}
