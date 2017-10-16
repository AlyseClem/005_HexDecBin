import java.util.Scanner;

public class HexDecBin {
	
	/*
	 * FIX FAULTS!! COMPLETE MISSING CODE!
	 */

	Scanner kbd = new Scanner(System.in);
	String name = "";
	String hex = "";
	int num;
	
public HexDecBin() {
		//Scanner for float is now working
		System.out.println("Welcome to my Hexadecimal, Decimal, or Binary conversion program");
		System.out.println("What is your name?");
		name = kbd.nextLine();
		System.out.println("Very nice to meet you " + name  + " let's begin: \n");
	}
	
	public void setHexNumber() {
		
		
		
		System.out.println("\nEnter the hex number :");
		hex = kbd.nextLine();
		// mouse over parseInt to read pop up guide
		num = Integer.parseInt(hex, 16);
		System.out.println("You have enetered hex " + hex);
		System.out.println("Decimal value is: " + num +  "(remember 0-" + num + " has " + (num+1) + " values)");
	}
	
	void convert() {
		
		String binary = Integer.toBinaryString(num);
		System.out.println("Binary value is: " + binary);
		System.out.println("Number of bits is " + binary.length());
		System.out.println("Number of whole nibbles (4 bits) is x" + " with y bits left over");
		System.out.println("Number of whole bytes (8 bits) is x" + " with y bits remaining");
	}
}
