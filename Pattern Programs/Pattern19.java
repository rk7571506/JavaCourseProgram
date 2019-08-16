class Pattern19
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(" ");
			}

			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
			
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}

			for(int k=1;k<=(11-2*i);k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}

	}
}
