import java.util.Scanner;
import java.util.Random;
class Guesser
{
	int guessNum;

	public int guessNumber()
	{
		Random ran = new Random(); // Computer generated guessNum
		int upperbound = 10;
		System.out.println("Guesser guess number ");
		guessNum = ran.nextInt(upperbound);
		System.out.println(guessNum);
		return guessNum;
	}
}


class Player
{
	int guessNum;

	public int guessNumber()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Player guess number ");
		guessNum = scan.nextInt();
		return guessNum;
	}

	
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
	}

	public void collectNumFromPlayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		numFromPlayer1 = p1.guessNumber();
		numFromPlayer2 = p2.guessNumber();
		numFromPlayer3 = p3.guessNumber();
	}

	void compare()
	{
		
		if(numFromGuesser == numFromPlayer1)
		{
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
			{
				System.out.println("Game tied!! All three players won the game!");
			}
			else if(numFromGuesser == numFromPlayer2)
			{
				System.out.println("Player1 and Player2 won the game!");
			}
			else if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("Player1 and Player3 won the game!");
			}
			else
			{
				System.out.println("Player1 won the game!");
			}
		}
		else if(numFromGuesser == numFromPlayer2)
		{
			if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("Player2 and Player3 won the game!");
			}
			else
			{
				System.out.println("Player2 won the game");
			}
		}
		else if(numFromGuesser == numFromPlayer3)
		{
			System.out.println("Player3 won the game");
		}
		else 
		{
			System.out.println("You lost the game");
		}

			
		
	}
	public void startGame() // Enhanced 3 chances to play the game
	{
		int count = 0;
		while(count < 3)
		{
			collectNumFromGuesser();
			collectNumFromPlayer();
			compare();
			count++;
		}
	}
}

public class EnhancedGame
{
	public static void main(String [] args)
	{
		Umpire u = new Umpire();
		u.startGame();
	}
}