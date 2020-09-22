/*

import java.util.Scanner;

public class loopchallenge {
	public static void main(String [] args){
		int number = 0;
		int numberT=0;
		int count = 0;
		int limit =0;
		
	Scanner numbersc = new Scanner(System.in);
	Scanner limitsc = new Scanner(System.in);
	
	System.out.println("\nPlease enter number: ");
		number = numbersc.nextInt();
	System.out.println("\nPlease enter limit: ");
		limit = limitsc.nextInt();
	System.out.println("\n------------------------------------------");

	numberT=number;
	while (number != limit) {
		System.out.print("\t"+number);
		number = number+numberT;
		count++;
		
		if (count == 5){
			System.out.println(" ");
			count = 0;
		}
		}
	}
}
*/



import java.util.Scanner;

public class loopchallenge {
	public static void main(String [] args){
		int number = 0;
		int numberT=0;
		int count = 0;
		int limit =0;
		int multipule=1;
		
	Scanner numbersc = new Scanner(System.in);
	Scanner limitsc = new Scanner(System.in);
	
	System.out.println("\nPlease enter number: ");
		number = numbersc.nextInt();
	System.out.println("\nPlease enter limit: ");
		limit = limitsc.nextInt();
	System.out.println("\n------------------------------------------");

	numberT=number;
	while (number != limit) {
		System.out.print("\t"+number);
		multipule++
		number = numberT*multipule;
		count++;
		
		if (count == 5){
			System.out.println(" ");
			count = 0;
		}
		}
	}
}
	