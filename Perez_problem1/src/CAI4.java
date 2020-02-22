import java.security.SecureRandom;
import java.util.Scanner;

public class CAI4 {
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
		int level = power(10, setDifficulty()) ;
		
		for(int i=0;i<numquestions;i++)
		{
		setNumbers(level);
			
		askQuestion();
			
		readAnswer();
		
		if(isAnswerCorrect()) {
			correctanswers++;
			}
		
		}
		
		displayCompletionMessage(correctanswers, numquestions );
		
			
	}


	private static int power(int base, int pow ) {
		if(pow>0) {
			return(base*power(base,pow-1));
		}
		else
			return 1;
	}


	private static int setDifficulty() {
		 Scanner in= new Scanner(System.in);
		 int level=-999;
		 
		 do {
		 System.out.println("Choose a level of difficulty 1-4 ");
		 
		 	try {
		 		level=in.nextInt();
		 	}
		 
		 	catch(java.util.InputMismatchException e) {
		 		System.out.println("Make sure you enter a digit between 1 and 4") ;
		 	}
		 
		 
		 }while((level<1)||(level>4));
		 
		
		 return(level);
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


	private static void setNumbers(int level ) {
		
		
		
		FirstNumber = generateQuestionArgument(level);
		
		SecondNumber = generateQuestionArgument(level);

		
	}


	private static int generateQuestionArgument(int level) {
		SecureRandom random= new SecureRandom();
		 
		return(random.nextInt(level));
	}


	private static void readAnswer() {
		int flag=0;
		do {
			try {
				Scanner in = new Scanner(System.in);
				Answer=in.nextInt();
				flag=1;
				}
			
			catch(java.util.InputMismatchException e) {
			System.out.println("Answer should be an integer, please try again ");
			}
			
		}while(flag==0);
		
	
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
