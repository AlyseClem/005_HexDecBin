import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class BinPower {

	//Fixed scanner bug for float inputs
	Scanner input = new Scanner(System.in);
	
	/*
	 * String is capitalized because it is a Class
	 * All java classes are cap'd
	 * int is not cap'd because it is a "primitive" type, means not a Class
	 * Integer -- full name with cap'd is a Class
	 * double, lower case is also a "primitive" means no Class for it
	 */
	
	public BinPower() {
		
	}
	
	public void setBinary() {
		
		double exp; //exp is exponent
		double base;
		double answer;
		int ans = 0; //scope of these variables are method scope
		String name = "";
		String msg = "";
		
		//ans = 2**2;
		//2**2 does not work, differs from Python
		
		//ans = 2^2 
		//System.out.println("Answer is: " + ans);
		//doesn't work, yet know error msg
		
		
		//don't need, Math.myMath = new Math(); because it's static
		//static means just use it!
		
		//(int) is "Type Casting" -- pow requires double, which makes no sense in binary
		//so type cast to the correct answer
		//without (int) answer would be like 2.0 because its using double

		msg = "Hello Java student! What is your name?";
		name = JOptionPane.showInputDialog(msg);
		
		
		msg = "Thanks for using my most awesome program " + name;
		JOptionPane.showMessageDialog(null, msg);
		
		
		msg = name + " what base number do you want to enter?";
		JOptionPane.showInputDialog(msg);
		
		//Doesn't work after this lines ^
		
		base = input.nextDouble();
		msg = name + " you have entered: " + base;
		JOptionPane.showInputDialog(msg);
	
		System.out.println(name + " what binary exponent do you want to enter?");
		exp = input.nextDouble();
		System.out.println(name + " you have entered: " + exp);
			
		
		answer = Math.pow(base, exp); 
		System.out.println("Answer is: " + answer); 
		
		
	}

}
