package controlFlowstatement;

public class While_Loop {

	 // print number from 1 to 10
	
	public void t1 () {
		int count = 0;
		int i = 1 ;
	    while (i<=10);
		{
			count ++ ;
			System.out.println (i);
			i++;
		}
	System.out.println ("Total count"+ count);
	}
	
	public static void main (String [] args ) {
		While_Loop l = new While_Loop ();
		l.t1 ();
	}
}
