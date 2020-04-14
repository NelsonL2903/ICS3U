package classexample;

//A class for alien space ships

public class Ship {

	String name;
	Boolean lightSpeed; // true if the ship can travel faster than light

	// constructor
	public Ship(String name, Boolean lightSpeed) {
		super();

		// this refers to the instance of the class
		this.name = name;
		this.lightSpeed = lightSpeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getLightSpeed() {
		return lightSpeed;
	}

	public void setLightSpeed(Boolean lightSpeed) {
		this.lightSpeed = lightSpeed;
	}

}
