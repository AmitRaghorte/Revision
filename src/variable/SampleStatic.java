package variable;

public class SampleStatic {

	static int a = 100 ;
	static int b = 4 ;
	
	public void t4 () {
		System.out.println (a/b);
	}
	
	public static void main (String [] args ) {
		SampleStatic s = new SampleStatic ();
		s.t4 ();
	}
}
