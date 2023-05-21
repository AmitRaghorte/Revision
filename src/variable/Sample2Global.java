package variable;

public class Sample2Global {

	int a = 100 ;
	int b = 25 ;
	public void t3 () {
		System.out.println (a*b);
	}
	
	public static void main (String [] args) {
		Sample2Global t = new Sample2Global ();
		t.t3 ();
	}
}
