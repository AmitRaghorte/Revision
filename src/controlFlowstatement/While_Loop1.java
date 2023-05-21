
package controlFlowstatement;

public class While_Loop1 {
	
	// Print 50 to 18
	
	public void t1 () {
		int i = 50 ;
		while (i>=18) {
			System.out.println(i);
		}
		i-- ;
	}
	
	public static void main (String [] args) {
		While_Loop1 p= new While_Loop1 ();
		p.t1();
	}

}
