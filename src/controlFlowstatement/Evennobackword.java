package controlFlowstatement;

public class Evennobackword {

		// Que : Tell me the count and even number from 159 to 114 
		// Logic : we will used for loop as the iteration is fixed from 159 to 114
		// Logic for even number : no divisible by 2 is even number and remainder is 0 so (i%2==0)
		// to count total even number from 159 to114 we will used "int count"
		
		public void t1 () {
			int count = 0 ;
			int a = 159 ;
			
			for (a=159 ; a>=114;a--) {
				count--;
				if (a%2==0) {
				System.out.println (a);
				}
			}
			System.out.println ("--------------"+"\n"+"Total count : "+ count);
		}
		
		public void main (String [] args ) {
			Evennobackword k = new Evennobackword ();
			k.t1 ();
			
		}

}
