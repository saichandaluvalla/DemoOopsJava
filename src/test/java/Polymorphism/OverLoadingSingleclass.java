package Polymorphism;

public class OverLoadingSingleclass {
	
	public String  method(String Saichand, String a) {
		return Saichand+a;
		
	}
	
	
	public int method(int Saichand, int a) {
		return Saichand+a;
	}

	
	public double method(double Saichand, double a) {
		return Saichand+a;
	}
	  
	public char method(char s, char a) {
		return  (char) (s+a); 
	}  



public static void main (String [] args) {
	OverLoadingSingleclass o=new OverLoadingSingleclass();
	o.method("Saichand","a");
	o.method(10,20);
	
	System.out.println("String values are : "  +o.method("Saichand","a"));
	System.out.println("String values are : "  +o.method(10,20));

}
}