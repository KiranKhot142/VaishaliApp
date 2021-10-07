package com.csi.core;				

public class TypeCastAdvance {
	public static void main(String[] args) {
	
		//NumberFormatException
		int empCode =12345;				//int to String
		String employeeCode=String.valueOf(empCode);
		System.out.println("\n Employee Code: "+employeeCode);
		
		String productCode="AABB22";		//String to int 
		int prCode=Integer.parseInt(productCode);
		System.out.println("\n product Code: "+ prCode);
		
	}
}
