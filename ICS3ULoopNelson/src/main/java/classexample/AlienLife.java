package classexample;

/*
 * Class to store basic data on an alien.
 */

public class AlienLife {

	// These are all member variables, and visible to all methods
	// in the class.
	private Boolean eatsHumans; // true if alien eats humans
	private String species; // alien's species
	private Ship ship; // alien's ship
	private int heads;
	private int teeth;

	/*
	 * This is the main method. This method is special because it is the one that is
	 * called when the program is run. Although the main method is within the
	 * PersonData class, since main is static, the member variables are not visible
	 * within the main method.
	 */
	public static void main(String[] args) {

		// create an instance of a AlienLife class and initialize
		AlienLife sandersRevenge = new AlienLife(true, "octochicken", "flesh train");

		// create an instance of a AlienLife class and initialize
		AlienLife itchyBurn = new AlienLife(true, "dynoworm", "destructo wagon");

		// call the print method on the sandersRevenge instance of AlienLife
		sandersRevenge.print();

		// call the print method on the itchyBurn instance of AlienLife
		itchyBurn.print();

	}

	// Methods are below
	/*
	 * create a person and set class variables
	 */
	public AlienLife(Boolean eatsHumans, String species, String shipName) {
		this.eatsHumans = eatsHumans;
		this.species = species;

		// create an instance of ship for this alien,
		// set the name of the ship and
		// set lightspeed to the default, false
		ship = new Ship(shipName, false);

	}

	private void print() {
		System.out.println(species);
		System.out.println(ship);

		// a class method can call other class methods.
		Boolean eats = getEatsHumans();

		if (eats) {
			System.out.println(species + " eats humans");
		} else {
			System.out.println(species + " does not eat humans");
		}
	}

	// the following methods are called setters and getters
	// these methods allow other classes to set and get
	// the member variables of a class.
	// Eclipse can auto generate setters and getters
	public Boolean getEatsHumans() {
		return eatsHumans;
	}

	public void setEatsHumans(Boolean eatsHumans) {
		this.eatsHumans = eatsHumans;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	public int getHeads() {
		return heads;
	}

	public void setHeads(int heads) {
		this.heads = heads;
	}

	public int getTeeth() {
		return teeth;
	}

	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}

}
