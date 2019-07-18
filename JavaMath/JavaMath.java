class JavaMath 
{
	public static void main(String[] args) 
	{
			System.out.println(0.0/0.0); //Nan
			System.out.println(0/0.0); //NaN
//			System.out.println(0/0); //ArithmeticException / by zero
			System.out.println(Math.sqrt(-2)); // NaN
			System.out.println(Math.sqrt(4)); //double value return  2.0
			System.out.println((int)(Math.random()*5)); //return the double value random 0.0>= random <1 
			System.out.println(Math.round(21.4999)); //21L
			System.out.println(Math.round(21.5)); //22L
			System.out.println(Math.round(21.1)); //21L
			System.out.println(Math.round(21.0)); //21L
			System.out.println(Math.round(21.55f)); //22 (int)
			System.out.println(Math.ceil(21.55)); //22.0
			System.out.println(Math.ceil(21.1)); //22.0
			System.out.println(Math.floor(21.55));//21.0
			System.out.println(Math.floor(21.3));//21.0
			System.out.println(Math.max(21,67)); //67
			System.out.println(Math.max(21.0,76.0)); //76.0
			System.out.println(Math.min(21,67.0)); //21.0

			System.out.println(Math.pow(2,3)); //8.0
			System.out.println(Math.log(2));//0.6931471805599453
			System.out.println(Math.log10(2)); //0.3010299956639812
			System.out.println(Math.log1p(1)); //return the log of x+1 , log(2) //0.6931471805599453
			
			System.out.println(Math.exp(1)); //2.71.....

			System.out.println(Math.abs(-56)); //56
			System.out.println(Math.abs(56)); //56
			System.out.println(Math.cbrt(8.0)); //2.0
			System.out.println(Math.signum(-9)); //-1.0
			System.out.println(Math.signum(9)); //1.0
			System.out.println(Math.signum(0)); //1.0





	}
}
