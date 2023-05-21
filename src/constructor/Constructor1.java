package constructor;

public class Constructor1 {

	int a ;
	int b ;
		
	public Constructor1 ()
	    {
			 a = 100 ;
			b = 25 ;
		}
	public void t1 () {
		System.out.println (a/b);
	}
	
	public static void main (String [] args) {
		 Constructor1 k = new  Constructor1 ();
		 k.t1();
	}
}
