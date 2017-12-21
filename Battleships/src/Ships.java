
public abstract class Ships {

	// Values each ship must return
	int length;
	String name;
	char shipCharacter;
	int healthPoints;

	// Ship getters and setters
	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public char getShipCharacter() {
		return shipCharacter;
	}

	public void setShipCharacter(char shipCharacter) {
		this.shipCharacter = shipCharacter;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Abstract classes
	public abstract int length();

	public abstract String name();

	public abstract char shipCharacter();

	public abstract int healthPoints();

}
