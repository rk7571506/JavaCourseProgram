class Pattern23 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(" ");
			}

			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=1;i<=4;i++)
		{
			
			System.out.print(" ");
			
			for(int j=1;j<=9;j++)
			{
				if((j>=1&&j<=3)||(j>=7 && j<=9))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
