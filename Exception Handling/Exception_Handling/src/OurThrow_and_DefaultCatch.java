
public class OurThrow_and_DefaultCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 5000;
		int withdraw = 3000;
		
		if(balance<withdraw)
			throw new ArithmeticException("Insufficent Balance");
		
		balance = balance-withdraw;
		System.out.println("Transcation Successfully Complete");
		System.out.println("Program Continue:");

	}

}
