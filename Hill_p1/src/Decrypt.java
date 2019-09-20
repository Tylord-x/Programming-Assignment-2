import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		int val1;
	    int val2;
	    int val3;
	    int val4;
	    int decVal1;
	    int decVal2;
	    int decVal3;
	    int decVal4;
	      
	    System.out.print("Please enter 4 single digit integers with spaces in between each: ");
	      
	    decVal1 = scnr.nextInt();
	    decVal2 = scnr.nextInt();
	    decVal3 = scnr.nextInt();
	    decVal4 = scnr.nextInt();
	      
	    System.out.println("Your decrypted value is: " + decVal1 + decVal2 + decVal3 + decVal4);
	    
	    val1 = decVal3;
	    val2 = decVal4;
	    val3 = decVal1;
	    val4 = decVal2;
	    
	    val1 = (val1 + 3) % 10;
	    val2 = (val2 + 3) % 10;
	    val3 = (val3 + 3) % 10;
	    val4 = (val4 + 3) % 10;
	    
	      
	    System.out.println("Your original value is: " + val1 + val2 + val3 + val4);

	}

}
