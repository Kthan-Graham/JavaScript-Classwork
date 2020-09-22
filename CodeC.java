import java.util.Scanner;

public class CodeC {
     public static void main (String [] args) {
         // all my variables
		 double hoursWorked = 0;
		 double OT = 0;
		 double OTP = 0;
		 double overall =0;
		 double amount = 0;
		 double payRate = 0;
		 		 
		 Scanner Enter = new Scanner(System.in);

		 
		 System.out.println("Please enter payrate: ");
		 payRate = Enter.nextInt();
		
		
		 System.out.println("Please enter Hours worked: "); //uses scanner to ask for hours then read hours
		 hoursWorked = Enter.nextInt();
		 
		 // section is for the if else statment
		 if (hoursWorked > 40) {
			OT = hoursWorked - 40;
			}
		else {
			amount = hoursWorked * payRate;
			}
		// total math being done for OT OTP OVERALL AND AMOUNT
		 OTP = (OT * (payRate*1.5));
		 amount = hoursWorked * payRate;
		 overall = amount + OTP;
		 
		 System.out.println("Regular pay is: " +amount+ ". and overtime pay is: " +OTP+ ".");
		 System.out.println("Gross pay, including overtime pay is: " +overall+ ".");
	}
}