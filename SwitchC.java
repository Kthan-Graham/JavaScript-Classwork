import java.util.Scanner;

public class SwitchC {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);


	//Grabs the Grade and devides by 10
	System.out.println("Please enter grade: ");
	int grade = sc.nextInt();
	grade = grade/10;

	//Switch for figuring out the grade.
	switch (grade) {
		case 10:
			System.out.println("Excellent! You have a perfect score.");
			break;
		case 9:
			System.out.println("Your rocking it! Bravo!");
			break;
		case 8:
			System.out.println("Well done. Keep it up!");
			break;
		case 7:
			System.out.println("Good job. Be careful your grade does not begin to slip.");
			break;
		case 6:
			System.out.println("Tutoring services are available. Please schedule an appointment.");
			break;
		case 5:
 		case 4:
 		case 3:
 		case 2:
 		case 1:
	    	System.out.println("Not passing. Please see your advisor for support services.");
 		break;
 		
		default:
 		System.out.println( "Don't Understand. Please re-enter.");
 		break;
       		}
   	}
}