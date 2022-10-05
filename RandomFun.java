import java.util.Random;
class RandomFun
{

static int guessNum;

	public static int guessNumber()
	{
		Random ran = new Random();
		int upperbound = 10;
		System.out.println("Guesser guess number ");
		guessNum = ran.nextInt(upperbound);
		return guessNum;
	}

    public static void main( String args[] )
    {
      Random rand = new Random(); //instance of random class
      int upperbound = 25;
        //generate random values from 0-24
      int int_random = rand.nextInt(upperbound); 
      double double_random=rand.nextDouble();
      float float_random=rand.nextFloat();
      
      System.out.println("Random integer value from 0 to" + (upperbound-1) + " : "+ int_random);
      System.out.println("Random float value between 0.0 and 1.0 : "+float_random);
      System.out.println("Random double value between 0.0 and 1.0 : "+double_random);

	System.out.println(guessNumber());



	
    }
}