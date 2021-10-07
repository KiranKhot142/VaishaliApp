package com.csi.core;

public class AutoBoxingConcept {
public static void main(String[] args) {
	
	//AutoBoxing- Convert primitive Datatype to wrapper class
	
	 int empId=121;
	 Integer employeeId =empId;
	System.out.println("\n Employee Id: "+employeeId);
	
	double productPrice=6576.23;
	Double prPrice = productPrice;
	System.out.println("\n Product price: "+prPrice);
}
}
