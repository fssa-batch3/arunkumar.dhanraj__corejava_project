package day05.practice.question1;

public class AxisATM extends Account implements ATM {

	// deposit method
	public boolean deposit(Account account, double amount) {

		System.out.println("You have deposited Rs." + amount);
		account.balance += amount;
		return true;
	}

//	 withdraw method
	public boolean withdraw(Account account, double amount) throws Exception {

		System.out.println("You are trying to withdraw Rs." + amount);
		account.balance -= amount;

		if (account.balance < 5000.0) {
			System.out.println("The minimum amount in the account must be Rs.5000 ");
			throw new Exception("Balance is low");
		} else {
			return true;
		}

	}

//	 get balance method
	public double getBalance(Account account) {

		return account.balance;
	}

	public static void main(String[] args) throws Exception {
		Account acc1 = new Account("1442", 6000.0);

		AxisATM axis1 = new AxisATM();

		System.out.println("The balance for account " + acc1.accNo + " is Rs." + acc1.balance);

		axis1.deposit(acc1, 500.0);

		System.out.println("After the deposit the balance is Rs." + acc1.balance);

		axis1.withdraw(acc1, 200.0);

		System.out.println("After the withdraw the balance is " + axis1.getBalance(acc1));

	}
}
