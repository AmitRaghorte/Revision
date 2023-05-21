package controlFlowstatement;

public class Even_No_SeriesforLoop {
	
	// Print and count only even no from 1 to 50 series 
	//Answer : start = 1
	// End = 50 ;
	// i++
	//Even no means no divide by 2 and remainder is 0
	
	public void t1 () {
		
	int count = 0;
	int i = 1;
	
	for (i=1; i <=50 ; i++) {
		count++ ;
		
		if (i%2==0) {
			System.out.println (i);
		}
		System.out.println (count);
	}
	System.out.println ("-------------------"+"\n"+"Total No count is "+count);

	}
	public static void main (String [] args) {
		Even_No_SeriesforLoop k = new Even_No_SeriesforLoop ();
		k.t1();
	}
}
