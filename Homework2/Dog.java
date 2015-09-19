/**
 * 
 * @author Heloisa Rosaria Bruno Carbone
 *
 * Dog is an animal.
 */
public class Dog extends Animal{

	/**
	 * Constructor
	 * @param name Dog name
	 * @param weight Dog weight 
	 * @param size Dog size
	 * @param gender Dog gender
	 */
	public Dog(String name, double weight, double size, String gender) {
		super(name, weight, size, gender);
	}

	/**
	 * Function that overrides the species from the animal
	 */
	@Override
	public String species() {
		return "Dog"; 
	}
	
	/**
	 * Function that overrides the sound from the animal
	 */
	@Override
	public void sound() {
		System.out.println ("Woof Woof Woof");
	}
	
	/**
	 * Function that overrides the seeAnimal from the animal
	 */
	@Override
	public void seeAnimal(String gender) {
		if (gender.equals("female"))
			System.out.println("/( '.' )\\\n ( UU )/");
		else
			System.out.println("^︵^\n(˚ᴥ˚)");
	}
	
	/**
	 * Function that overrides the price from the animal
	 */
	@Override
	public double price() {
		return 4.0 * super.getSize();
	}

}
