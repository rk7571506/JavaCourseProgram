
public class OurThrow_and_DefaultCatch_1 {

	public static void main(String[] args) {
		int balance = 5000;
		int withdraw = 6000;
		
		if(balance<withdraw)
			throw new ArithmeticException("Insufficent Balance");
		
		balance = balance-withdraw;
		System.out.println("Transcation Successfully Complete");
		System.out.println("Program Continue:");

	}

}
