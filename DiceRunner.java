public class DiceRunner
{
	public static void main(String[] args)
	{
		//test 1
		Die die1=new Die();
		Die die2=new Die();
		int count=0;
		while (count>-1)
		{
			die1.roll();
			die2.roll();
			die1.toString();
			die2.toString();
			if (die1.getValue()==die2.getValue())
			{
				System.out.println("Snake eyes!");
				count--;
			}
		}
	}
}