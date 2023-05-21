package variable;

public class Variables {
	
	public void t1 () {
	
		
	// Declaration of varibales	
	    int a ;          
		String name ;
		char d ;
		
	// 2. Initiallisation of variables	
		a = 100 ;
		name = "Amit";
		d = '@';
	// Usage of variables
		System.out.println (a +"\n"+name+"\n"+d);
		
		}
	public static void main (String [] args ) {
		
		Variables v = new Variables ();
		v.t1 ();
	}

}
