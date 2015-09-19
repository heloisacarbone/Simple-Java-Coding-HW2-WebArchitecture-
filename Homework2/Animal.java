/**
 * 
 * @author Heloisa Rosaria Bruno Carbone
 * 
 * Animal is an object that has general characteristics and do some general actions, 
 * it is the class that is inherited by other classes.
 *
 */
public class Animal {

	/**
	 * Animal name, chosen by the user 
	 */
	private String name;
	
	/**
	 * Animal weight, randomly generated
	 */
	private double weight;
	
	/**
	 * Animal size, randomly generated
	 */
	private double size;
	
	/**
	 * Animal genter, randomly generated
	 */
	private String gender;
	
	/**
	 * Constructor method
	 * @param name Animal name
	 * @param weight Animal weight
	 * @param size Animal size
	 * @param gender Animal gender
	 */
	public Animal(String name, double weight, double size, String gender) {
		this.setName(name);
		this.setWeight(weight);
		this.setSize(size);
		this.setGender(gender);
		
	}
	
	/**
	 * Name of the species that the animal belongs.
	 * @return
	 */
	public String species() {
		System.out.println("I am just a general animal");
		return null;
	}
	
	/**
	 * The sound that the animal emits
	 */
	public void sound() {
		System.out.println("I am just a general animal, I don't have a sound. :'(");
	}

	/**
	 * A "picture" of the animal
	 */
	public void seeAnimal(String gender) {
		System.out.println("I am just a general animal, I don't have a form. :'(");
	}
	
	/**
	 * The price that the animal costs
	 * @return
	 */
	public double price() {
		System.out.println("I am worthless");
		return 0.0;
	}
	
	/**
	 * Returns the name of the animal
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Edits the name of the animal
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the weight of the animal
	 * @return
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Edits the weight of the animal
	 * @param weight New weight of the animal
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Returns the size of the animal
	 * @return
	 */
	public double getSize() {
		return size;
	}

	/** Edits the size of the animal
	 * 
	 * @param size
	 */
	public void setSize(double size) {
		this.size = size;
	}

	/**
	 * Returns the gender of the animal
	 * @return
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Edits the gender of the animal
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
