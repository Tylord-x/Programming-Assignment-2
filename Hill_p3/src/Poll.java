import java.util.Scanner;

public class Poll {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int maxInt = 0, minInt = 0;
		
		String[] topic = new String[5];
		topic[0] = "Video Games";
		topic[1] = "Anime";
		topic[2] = "Ramen";
		topic[3] = "Pizza";
		topic[4] = "Basketball";
		
		int[][] responses = new int[5][10];
		double[] total = new double[5];
		total[0] = 0;
		total[1] = 0;
		total[2] = 0;
		total[3] = 0;
		total[4] = 0;
		
		
		double average=0;
		
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 5; j++){
				System.out.println("Give a Rating between 1 and 10 for the topic\n" + (j+1) +"."+topic[j]);
		        responses[j][i]=scnr.nextInt();
			}
		}
		
		System.out.println("Responses");
		
		for(int i = 0; i < 5; i++){
			System.out.print("\n " + (i+1) + "." + topic[i]);
		    for(int j=0; j < 10; j++){
		    	System.out.print("\t" + responses[i][j] + "\t" );
		        total[i] = total[i] + responses[i][j];
		       }
		       average= total[i] / 10;
		       System.out.print("\tAverage = "+ average);
		}
		double max = total[0], min = total[0];
		   for(int i = 0; i < 5; i++){
		       if(max < total [i]){
		           max = total[i];
		           maxInt=i;
		       }
		       if(min > total[0]){
		           min = total[0];
		           minInt = i;
		       }
		   }
		System.out.println("\n\nHighest total rated topic: "+ topic[maxInt] + "\tTotal Rating: " + max);
		System.out.println("\nLowest total rated topic: "+ topic[minInt] + "\tTotal Rating: " + min);
	}

}
