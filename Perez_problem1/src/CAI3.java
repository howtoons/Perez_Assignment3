import java.security.SecureRandom;
import java.util.Scanner;

public class CAI3 {
private static int FirstNumber, SecondNumber, Answer;
	
	
	public static void main(String[] args) {
		do {
		quiz();
		}while(newSetPrompt()!=0);

	}
	
	
	private static int newSetPrompt() {
		
		 Scanner in= new Scanner(System.in);
		 
		 System.out.println("Do you want to do a new problem set? 1=yes, 0=no");
		 
		 return(in.nextInt());
	
	}


	private static void quiz() {
		float correctanswers=0;
		final float numquestions=10;
		
		for(int i=0;i<numquestions;i++)
		{
		setNumbers();
			
		askQuestion();
			
		readAnswer();
		
		if(isAnswerCorrect()) {
			correctanswers++;
			}
		
		}
		
		displayCompletionMessage(correctanswers, numquestions );
		
			
	}


	private static void displayCompletionMessage(float correctanswers, float numquestions) {
		
		float score=(correctanswers/numquestions)*100;
		if(score<75) {
			System.out.println("Please ask your teacher for extra help.");
		}
		else {
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		
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
