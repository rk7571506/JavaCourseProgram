import java.util.Scanner;
class Guesser
{
	int gnum;

	int guessNum()
	{
		System.out.println("Kindly Guesser,Guess The Number:");
		Scanner sc = new Scanner(System.in);
		gnum = sc.nextInt();

		return gnum;
	}
}
class Player
{
	int pnum;
 
	int guessNum()
	{
		System.out.println("Player,Guess The Number:");
		Scanner sc = new Scanner(System.in);
		pnum = sc.nextInt();
		return pnum;
	}
}
class Umpire
{
	int numfromguesser,numfromplayer1,numfromplayer2,numfromplayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numfromguesser =  g.guessNum();
	}
	void collectNumFromPlayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numfromplayer1 = p1.guessNum();
		numfromplayer2 = p2.guessNum();
		numfromplayer3 = p3.guessNum();
		
	}

	void compare()
	{
		if(numfromguesser==numfromplayer1)
		{
			System.out.println("Player1,Win :)");
		}else if(numfromguesser==numfromplayer2)
		{
			System.out.println("Player2,Win :)");
		}else if(numfromguesser==numfromplayer3)
		{
			System.out.println("Player3,Win :)");
		}else
		{
			System.out.println("Game Lost,Try Again :(");
		}
	}
}
class GuesserGame
{
	public static void main(String[] args) 
	{
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
	}
}
