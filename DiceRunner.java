public class DiceRunner
{
	public static void main(String[] args)
	{
		//test 1
		Die die1=new Die();
		Die die2=new Die();
		int count=0;
		int count2=1;
		while (count>-1)
		{
			die1.roll();
			die2.roll();
			System.out.println("roll "+count2);
			System.out.println(die1.toString());
			System.out.println(die2.toString());
			if (die1.getValue()==1&&die2.getValue()==1)
			{
				System.out.println();
				System.out.println("Snake eyes!");
				System.out.println("die 1 has "+die1.getSides()+" sides");
				System.out.println("die 2 has "+die2.getSides()+" sides");
				count--;
			}
			count2++;
		}
	}
}