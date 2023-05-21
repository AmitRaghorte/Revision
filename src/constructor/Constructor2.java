package constructor;

 public class Constructor2 {
	
	int a ;
	int b;

 public Constructor2 () 
 {
	a= 5;
	b = 60 ;
 }
 
 public void billu () {
	 
	 System.out.println (b*a);
 }
 
 public static void main (String [] args ) {
	 Constructor2 k = new Constructor2 ();
	 k.billu ();
 }

}
