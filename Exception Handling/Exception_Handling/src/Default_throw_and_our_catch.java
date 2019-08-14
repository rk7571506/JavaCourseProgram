
public class Default_throw_and_our_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println(3/0);
			System.out.println("In try");
		}catch(ArithmeticException e){
			System.out.println("Exception: "+e.getMessage());
		}
		System.out.println("Hello");

	}

}
