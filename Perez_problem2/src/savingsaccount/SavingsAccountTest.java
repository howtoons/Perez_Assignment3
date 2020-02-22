package savingsaccount;

public class SavingsAccountTest {
	public static void main(String[] args) {
		SavingsAccount saver1= new SavingsAccount();
		SavingsAccount saver2= new SavingsAccount();
		
		saver1.savingsBalance=2000;
		saver2.savingsBalance=3000;
		
		saver1.modifyInterestRate(4);
		
		for(int i=1; i<13; i++ ) {
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.println("Saver 1 after month "+i+ ": $"+saver1.savingsBalance);
			System.out.println("Saver 2 after month " +i+ ": $"+saver2.savingsBalance);
			System.out.printf("\n\n");
		}
		
		saver1.modifyInterestRate(5);			
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		
		
		System.out.println("Saver 1 after month 13: $"+saver1.savingsBalance);
		System.out.println("Saver 2 after month 13: $"+saver2.savingsBalance);
	}
}
