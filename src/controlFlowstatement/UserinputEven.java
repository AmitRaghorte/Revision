package controlFlowstatement;

import java.util.Scanner;

public class UserinputEven {

	// Identify by giving user input no is even or not
	// logic (i%2==0)

    public void t1 () {
     
      Scanner sc = new Scanner (System.in) ;
      System.out.println ("Enter the number ");
	  int name = sc.nextInt ();
	  

	if (name%2 == 0) {

	System.out.println ("Given number is Even number : " + name);
	 
	}else 
	{

	System.out.println ("Given number is not even number : "+ name);
	}
       sc.close ();
	}

	public static void main (String [] args ){

	UserinputEven e = new UserinputEven ();
	e.t1();

	}
	}

