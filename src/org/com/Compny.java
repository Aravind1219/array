package org.com;

public class Compny {

	public static void main(String[] args) {
		
		
		int x[] = new int[6];
		
		x[0]=100;
		x[1]=200;
		x[2]=300;
		x[3]=400;
		x[4]=500;
		x[5]=600;
	
		for (int a = 0; a < 6; a++) {
			
			System.out.println(x[a]);
		
		}
		System.out.println("another set");
		for (int a : x) {
			System.out.println(a);
		}
	}
	
}
