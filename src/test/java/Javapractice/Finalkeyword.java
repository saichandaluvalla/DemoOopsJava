package Javapractice;

public class Finalkeyword {
	//final keyword is contant value
	//It can be used in public methods and main method
	
	//final method is also we can use in all the cases(methods and main) 
	public final static int myconstant_value=10;  
	
	public void finalsum(int a, int myconstant_value) {
		int sumvalue=a+myconstant_value;
		System.out.println("sumvalue is : " +sumvalue); 
		
	} 
	
	public final int finalmethod(int sai, int a) {
		return a+sai;
		//System.out.println("finalmethod value is : " +);
		
	}   
  
  
	
}
