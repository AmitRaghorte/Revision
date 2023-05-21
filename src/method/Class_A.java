package method;

public class Class_A {

	public void t1 () {
		
		String name = "admin";
		String password = "password";
		
		System.out.println (name +"\n"+password);
	}
	
	public static void main (String [] args) {
		Class_A a = new Class_A ();
		a.t1 ();
	}
}
