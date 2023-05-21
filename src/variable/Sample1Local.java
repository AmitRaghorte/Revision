package variable;

public class Sample1Local {
	
	public void t1 () {
		
		int a = 10 ;
		int b = 20 ;
		System.out.println (a*b);
	}
	
	public static void main (String [] args) {
		
		Sample1Local s = new Sample1Local ();
		s.t1 ();
	}

}
