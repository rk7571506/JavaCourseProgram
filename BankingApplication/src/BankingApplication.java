/**
 * @author Ravi_Ranjan
 * Date:29/12/2018.
 * MINI PROJECT : BANK_APPLICATION
 */
import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {

		BankAccount obj1 = new BankAccount("Ravi_Ranjan", "CI078678");
		obj1.showMenu();
	}
}

class BankAccount {
	int balance;
	int previousTranscation;
	String customerName;
	String customerId;

	BankAccount(String cname, String cid) {
		customerName = cname;
		customerId = cid;
	}

	void deposite(int amount) {
		if (amount != 0) {
			balance += amount;
			previousTranscation = amount;
		}
	}

	void withdraw(int amount) {
		if (amount != 0) {
			balance -= amount;
			previousTranscation = amount;
		}
	}

	void getPreviousTransaction() {
		if (previousTranscation > 0) {
			System.out.println("Deposited: " + previousTranscation);
		} else if (previousTranscation < 0) {
			System.out.println("Withdraw: " + Math.abs(previousTranscation));
		} else {
			System.out.println("No Transcation Occured");
		}
	}

	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome:" + customerName);
		System.out.println("Your ID is:" + customerId);
		System.out.println("\n");
		System.out.println("A.Check Balance");
		System.out.println("B.Deposite");
		System.out.println("C.withdraw Transcation");
		System.out.println("D:Previous Transcation");
		System.out.println("E.Exit");
		do {
			System.out.println("*************************************************");
			System.out.println("Enter an Option:");
			System.out.println("*************************************************");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			switch (option) {
			case 'A':
				System.out.println("------------------------------------------------");
				System.out.println("Balance=" + balance);
				System.out.println("------------------------------------------------");
				System.out.println("\n");
				break;

			case 'B':
				System.out.println("------------------------------------------------");
				System.out.println("Enter an amount to deposite:");
				System.out.println("------------------------------------------------");
				int amount = scanner.nextInt();
				deposite(amount);
				System.out.println("\n");
				break;
			case 'C':
				System.out.println("------------------------------------------------");
				System.out.println("Enter an amount to withdraw:");
				System.out.println("------------------------------------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
			case 'D':
				System.out.println("------------------------------------------------");
				getPreviousTransaction();
				System.out.println("------------------------------------------------");
				System.out.println("\n");
				break;
			case 'E':
				System.out.println("------------------------------------------------");
				break;
			default:
				System.out.println("Invalid Option!Please enter again");
				break;
			}
		} while (option != 'E');

		System.out.println("Thank You Using Our Services:");
	}
}