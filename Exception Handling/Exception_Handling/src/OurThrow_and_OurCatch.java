
public class OurThrow_and_OurCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int  balance = 8000;
		   int withdraw = 6000; 
		*/
		int balance =5000;
		int withdraw = 6000;
		
		try
		{
			if(balance<withdraw)
			  throw new ArithmeticException("Insufficient Balance:");
			
			balance-=withdraw;
			System.out.println("Transcation Sucessfully!");
		}catch(ArithmeticException e)
		{
			System.out.println("Exception:"+e.getMessage());
		}finally{
		System.out.println("Program Continue:");
		}
	}

}
