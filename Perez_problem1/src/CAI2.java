import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {
private static int FirstNumber, SecondNumber, Answer;
	
	
	public static void main(String[] args) {
		quiz();

	}
	
	
	public static void quiz() {
		
		setNumbers();
		
		do {
						
			askQuestion();
			
			readAnswer();
		}while(!isAnswerCorrect());
			
	}


	private static void setNumbers() {
		
		SecureRandom random= new SecureRandom();
		
		FirstNumber = random.nextInt(10);
		
		SecondNumber = random.nextInt(10);

		
	}


	private static void readAnswer() {
		
		Scanner in = new Scanner(System.in);
		Answer=in.nextInt();
		
		
	}


	private static boolean isAnswerCorrect() {
		if(FirstNumber*SecondNumber==Answer) {
			displayCorrectResponse();
			return true;
		}
		displayInorrectResponse();
		return false;
	}


	private static void displayInorrectResponse() {
		
		 
		switch((new SecureRandom()).nextInt(4)) {
		
		case(0):{
		System.out.println("No. Please try again.");
		break;}
		
		case(1):{
			System.out.println("Wrong. Try once more.");
			break;}
		
		case(2):{
			System.out.println("Don't give up!");
			break;}
		
		case(3):{
			System.out.println("No. Keep Trying.");
			break;}
		};
		
				
	}


	private static void displayCorrectResponse() {
		
		switch((new SecureRandom()).nextInt(4)) {
		
		case(0):{
		System.out.println("Very good!");
		break;}
		
		case(1):{
			System.out.println("Excelent!");
			break;}
		
		case(2):{
			System.out.println("Nice work!");
			break;}
		
		case(3):{
			System.out.println("Keep up the good work!");
			break;}
		};
	}


	private static void askQuestion() {
	
		System.out.println("What is " + FirstNumber + " Times " + SecondNumber);
		
	}

}
