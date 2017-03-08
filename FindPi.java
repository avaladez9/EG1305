
public class FindPi {
	
	public static void main(String[] args){
		
		double PI = 0;
		int counter = 0;
		long startTime = System.nanoTime();
		for (int i = 2500000; i > 0; i--) {
			
		   PI += Math.pow(-1, i + 1) / (2 * i - 1); // Calculate series in parenthesis
		     counter ++;
		   if (i == 1) { // When at last number in series, multiply by 4
		        
		    	  PI *= 4;    
		        
		        System.out.println("PI = " + PI + " after " + counter + " iterations."); // Print result
		    	
		      }  
	}
		long finalTime = System.nanoTime();
    	long difference = finalTime - startTime;
    	double seconds = difference / 1000000000.0;
    	System.out.println("It took " + seconds + " seconds to complete this operation.");

	
}
}