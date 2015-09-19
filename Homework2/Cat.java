/**
 * 
 * @author Heloisa Rosaria Bruno Carbone
 *
 * Cat is an animal.
 */
public class Cat extends Animal{

	/**
	 * Constructor
	 * @param name Cat name
	 * @param weight Cat weight 
	 * @param size Cat size
	 * @param gender Cat gender
	 */
	public Cat(String name, double weight, double size, String gender) {
		super(name, weight, size, gender);
	}
	
	/**
	 * Function that overrides the species from the animal
	 */
	@Override
	public String species() {
		return "Cat"; 
	}
	
	/**
	 * Function that overrides the sound from the animal
	 */
	@Override
	public void sound() {
		System.out.println ("Meow Meow Meow ....... Purr Purr");
	}
	
	/**
	 * Function that overrides the seeAnimal from the animal
	 */
	@Override
	public void seeAnimal(String gender) {
		if (gender.equals("male"))
			System.out.println(" /\\_/\\ \n(>’.'<) \n( U U )");
		else
			System.out.println("♥ \n. ♥／l、\n（ﾟ､ ｡ ７\n l、 ~ヽ\n じしf_, )ノ ");
	}
	
	/**
	 * Function that overrides the price from the animal
	 */
	@Override
	public double price() {
		return 3.0 * super.getSize();
	}

}
