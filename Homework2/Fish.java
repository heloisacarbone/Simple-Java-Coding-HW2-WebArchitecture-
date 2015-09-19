/**
 * 
 * @author Heloisa Rosaria Bruno Carbone
 *
 * Fish is an animal.
 */
public class Fish extends Animal{

	/**
	 * Constructor
	 * @param name Fish name
	 * @param weight Fish weight 
	 * @param size Fish size
	 * @param gender Fish gender
	 */
	public Fish(String name, double weight, double size, String gender) {
		super(name, weight, size, gender);
	}
	
	/**
	 * Function that overrides the species from the animal
	 */
	@Override
	public String species() {
		return "Fish"; 
	}
	
	/**
	 * Function that overrides the sound from the animal
	 */
	@Override
	public void sound() {
		System.out.println ("bloo bloo bloo");
	}
	
	/**
	 * Function that overrides the seeAnimal from the animal
	 */
	@Override
	public void seeAnimal(String gender) {
		if (gender.equals("male"))
			System.out.println("<><");
		else
			System.out.println("<*)))<");
	}
	
	/**
	 * Function that overrides the price from the animal
	 */
	@Override
	public double price() {
		return 10.0 * super.getSize();
	}

}
