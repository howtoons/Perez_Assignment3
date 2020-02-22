package savingsaccount;

public class SavingsAccount {
	private static double annualInterestRate;
	protected double savingsBalance;
	
	protected void calculateMonthlyInterest() {
		savingsBalance += (savingsBalance*annualInterestRate)/12;
		
	}
	
	protected void modifyInterestRate( double newInterestRate) {
		annualInterestRate=newInterestRate/100;
	}
}
