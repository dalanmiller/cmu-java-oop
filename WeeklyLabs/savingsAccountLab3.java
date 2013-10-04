public class savingsAccountLab3 {

	public static void main(String[] args) {
		

		SavingsAccount saver1 = new SavingsAccount(0.04, 2000.00);
		SavingsAccount saver2 = new SavingsAccount(0.04, 3000.00);

		System.out.println(saver1.toString());
		System.out.println();
		System.out.println(saver2.toString());

		System.out.println();
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.println(saver1.toString());
		System.out.println();
		System.out.println(saver2.toString());

		System.out.println();
		saver1.modifyInterestRate(0.05);
		saver2.modifyInterestRate(0.05);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.println(saver1.toString());
		System.out.println();
		System.out.println(saver2.toString());

	}
	
}


class SavingsAccount {

	private double annualInterestRate;
	private double savingsBalance;

	SavingsAccount(double a, double b){
		annualInterestRate = a;
		savingsBalance = b;
	}

	public void calculateMonthlyInterest(){
		savingsBalance += (annualInterestRate * savingsBalance) / 12;
	}

	public void modifyInterestRate(double newRate){
		annualInterestRate = newRate;
	}

	@Override
	public String toString(){
		return "AIR: "+annualInterestRate + "\nBalance: "+savingsBalance;
	}
	
}