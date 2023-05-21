package controlFlowstatement;

public class Oddnumberseries { // print odd number from 33 to 89  and count prited number
	                           // start = 33 ,
	                          //  end = 89 ;
	                         // i++
	
	public  void t1 () {
		
		int count = 0 ;
	    int i = 33 ;
		for (i=33 ; i<=89 ;i++) 
	{
			count ++ ;
		    if (i%2 != 0) {
			System.out.println (i);
			
	}
		
    }
		System.out.println ("---------------"+"\n"+"Total number of print count :"+count);
	}
	
	public static void main (String [] args) {
		Oddnumberseries o = new Oddnumberseries ();
		o.t1 ();
		
	}

}
