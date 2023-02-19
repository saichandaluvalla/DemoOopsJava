package Javapractice;

import java.util.Scanner;

public class Sample  {
	
//	public  void  samplemethod(int sample, int myconstant_value) {
//		//int sample=100000;  
//		int samplesum=myconstant_value+ sample;
//		System.out.println("Samplemethod is : " +samplesum);
//	} 
//	
//	
//	public static void main(String [] args) { 
//		Sample F=new Sample(); 
//		System.out.println("constant value is : " +myconstant_value); //10
//		//System.out.println("finalsum value is : " +finalsum(10,20));
//
//		F.finalsum(10, myconstant_value);  //20
//		System.out.println("finalmethod value is : " +  F.finalmethod(50, myconstant_value)); //60
//		System.out.println("finalmethod value is : " + F.finalmethod(1000, 2000)); //3000
//		
//		//System.out.println("samplemethod value is : " +F.samplemethod(111,121));
//		
//		
//		F.samplemethod(myconstant_value, 1000); //1010
//	



	   public static void main(String[] args) {
	     
//		  Scanner scan=new Scanner(System.in);
//		  System.out.println("Enter your String : ");
//		  String string=scan.nextLine(); 
//		  
		   String string= "Saichand";  
		  String reverse=""; 
		  
		  for ( int i = string.length()-1; i>=0; i--) {
			  reverse= reverse+ string.charAt(i);
		  }
		    System.out.println("Reverse string is : " +reverse);
		   
	   }
	   
}
	
	


