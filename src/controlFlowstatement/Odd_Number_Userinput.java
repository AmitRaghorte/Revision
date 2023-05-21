package controlFlowstatement;

import java.util.Scanner;

public class Odd_Number_Userinput {
	// Print odd number by giving user input

	// Answer : 1.odd number is number not divisible by 2.i.e means remiander is not 0 == (i%2 != 0)
	          // 2. Used scanner class 

	
    public void t2 () {

	Scanner sc = new Scanner (System.in) ;
	System.out.println ("Enter the number");
	int number = sc.nextInt ();

	if (number%2 != 0) {

	System.out.println ("Given number is odd number  : "+ number);
	}
	else {

	System.out.println ("Given number is not odd number : " + number);

	}
      sc.close();
	}

	public static void main (String [] args ){

		Odd_Number_Userinput i = new  Odd_Number_Userinput ();
	i.t2();
	}
	}

