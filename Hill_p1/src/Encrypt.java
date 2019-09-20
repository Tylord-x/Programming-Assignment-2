import java.util.Scanner;
public class Encrypt {

	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int val1;
	      int val2;
	      int val3;
	      int val4;
	      int encVal1;
	      int encVal2;
	      int encVal3;
	      int encVal4;
	      
	      System.out.print("Please enter 4 single digit integers with spaces in between each: ");
	      
	      val1 = scnr.nextInt();
	      val2 = scnr.nextInt();
	      val3 = scnr.nextInt();
	      val4 = scnr.nextInt();
	      
	      System.out.println("Your initial value is: " + val1 + val2 + val3 + val4);
	      
	      val1 = (val1 + 7) % 10;
	      val2 = (val2 + 7) % 10;
	      val3 = (val3 + 7) % 10;
	      val4 = (val4 + 7) % 10;
	      
	      encVal1 = val3;
	      encVal2 = val4;
	      encVal3 = val1;
	      encVal4 = val2;
	      
	      System.out.println("Your encrypted value is: " + encVal1 + encVal2 + encVal3 + encVal4);

	}

}
