
public class Battleship extends Ships {
	
	//Values for ship
	
	int length = 3;
	String name = "Patrol Boat";
	char shipCharacter = 'B';
	int healthPoints = 3;

	//Constructors for ships
	public int length() {

		return length;
	}

	public String name() {

		return name;
	}

	public char shipCharacter() {
		return shipCharacter;
	}

	public int healthPoints() {

		return healthPoints;
	}

}
