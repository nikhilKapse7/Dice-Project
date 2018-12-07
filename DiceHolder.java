import java.util.ArrayList;
public class DiceHolder {
	private ArrayList<Die> container;

	public DiceHolder(){
		for(int i = 0; i < 6; i++){
			container.add(new Die());
		}
	}


	public int addDie(Die die) {
		//adds die
		if(container.size() >= 6)
			return -1;

		else if( container.size() < 6)
			container.add(die);
			return 1;

	}


	public void shake() {
		//shakes up dice in container
		for(int i = 0; i < container.size(); i++) {
			container.get(i).roll();
		}
	}


	public String toString() {
		//prints out all dice
		String allDice = "";
		for(int i = 0; i < container.size(); i++) {
				allDice += container.get(i) + "\n";
		}
		return allDice;
	}
}