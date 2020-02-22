import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
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
		System.out.println("No. Please try again.");		
	}


	private static void displayCorrectResponse() {
		
		System.out.println("Very good!");
	}


	private static void askQuestion() {
	
		System.out.println("What is " + FirstNumber + " Times " + SecondNumber);
		
	}

}
