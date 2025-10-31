package h2;

public class H2_main {

	public static void main(String[] args) {		
		
		        int i = 15;
		        int j = 30;
		        int k = 10;
		        int min, max;

		        
		        if (i < j && i < k) {   // Minimum bestimmen
		            min = i;
		        } else if (j < i && j < k) {
		            min = j;
		        } else {
		            min = k;
		        }

		       
		        if (i > j && i > k) {  // Maximum bestimmen
		            max = i;
		        } else if (j > i && j > k) {
		            max = j;
		        } else {
		            max = k;
		        }

		        System.out.println("Minimum: " + min);
		        System.out.println("Maximum: " + max);
		    }

	}