import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Heloisa Rosaria Bruno Carbone
 * 
 * The project process the data informed by the user to buy animals, it is a simple demonstration. 
 * The user select what species would like to buy, and then choose if want a female or male animal and then give a name for it. The animal is created and is associated 
 * to a weight, a size, a gender and has a price that is associated with his size. In the end of the transaction a receipt is 
 * shown to the user with all the animals bought and the total price for it.
 *
 */
public class Main {

	/**
	 * Main method 
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> availableAnimals = new ArrayList<String>();
		availableAnimals.add("dog");
		availableAnimals.add("cat");
		availableAnimals.add("fish");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Welcome to Animal Store!\n"
				+ "What kind of animal are you interested? \n");
		printAvailableAnimals(availableAnimals);
		
		ArrayList<Animal> boughtAnimals = new ArrayList<Animal>(); 
		boolean wantMoreAnimals = true;
		
		// Condition to allow the user to buy more then one animalin a time
		while (wantMoreAnimals) {
			String animal = scanner.nextLine();
			
			Boolean validAnimal = availableAnimals.contains(animal);	
			
			while (!validAnimal) { 
				
				System.out.printf("This animal do not exist, please try one of the available in the store. \n");
				printAvailableAnimals(availableAnimals);
				animal = scanner.nextLine();
				validAnimal = availableAnimals.contains(animal);	
				
			}
			
			Animal newAnimal;
			
			System.out.println("Do you want a male or female " + animal + "?");
			boolean validGender = false;
			String animalGender = "";
			
			while (!validGender) {
				 animalGender = scanner.nextLine();
				if (!animalGender.equals("female") && !animalGender.equals("male")) {
					System.out.println("Please, just write female or male in the slot.");
				} else {
					validGender = true;
				}
			}

			System.out.println("What name do you want to give it?");
			String animalName = scanner.nextLine();
			
			/* Try/Catch is used here to guarantee that an animal will be created without problems, and if there is a problem, do not
			 destroy the program without displaying the exception */
			try {
				
				// Create the animal that the user chose
				switch (animal) {
					case "dog":
						newAnimal = new Dog(animalName, randomDouble(3.0, 6.0), randomDouble(50.0,100.0), animalGender);
						newAnimal.sound();
						newAnimal.seeAnimal(animalGender);
						boughtAnimals.add(newAnimal);
						break;
					case "cat":
						newAnimal = new Cat(animalName, randomDouble(1.0, 4.0), randomDouble(20.0, 50.0), animalGender);
						newAnimal.sound();
						newAnimal.seeAnimal(animalGender);
						boughtAnimals.add(newAnimal);
						break;
					case "fish":
						newAnimal = new Fish(animalName, randomDouble(0, 0.2), randomDouble(2.0, 10.0), animalGender);
						newAnimal.sound();
						newAnimal.seeAnimal(animalGender);
						boughtAnimals.add(newAnimal);
						break;
					default:
						break;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// Check if user want to buy more animals
			boolean writeok = false;
			while (!writeok) {
				writeok = true;
				System.out.println("Do you want any more animals? (y/n)");
				
				String condition = scanner.nextLine().toLowerCase();
				
				if (condition.equals("n")) {
					wantMoreAnimals = false;
				} else if (condition.equals("y")) {
					System.out.println("Which one would you like?\n");
					printAvailableAnimals(availableAnimals);
				} else {
					writeok = false;
					System.out.println("Please, just write y for yes and n for no");
				}
			}
			
		}
		
		closePurchase(boughtAnimals);
		scanner.close();
		
	}
	
	/**
	 * Sends receipt
	 * @param boughtAnimals Array of the animals that the person chose to buy
	 */
	private static void closePurchase(ArrayList<Animal> boughtAnimals) {
		System.out.println("____________Receipt____________");
		Iterator<Animal> it = boughtAnimals.iterator();
		double total = 0.0;
		DecimalFormat df = new DecimalFormat("####0.00");
		
		while (it.hasNext()) {
			Animal a =  it.next();
			total += a.price();
			
			System.out.println(a.species() + " U$" + df.format(a.price()) + " - " + a.getName() + "\n"
					+ "       kg:" + df.format(a.getWeight()) + " cm:" + df.format(a.getSize()) + " gender:" + a.getGender() );
			System.out.println("-----------------------");
		}
		System.out.println("Total: U$" + df.format(total));
		System.out.println("________________________________");
		System.out.println("Thank you for your time, you're all set.\n");
		
	}
	
	/**
	 * Returns a random number between two values 
	 * @param min Minimum number
	 * @param max Maximum number
	 */
	public static double randomDouble (double min, double max) {
		Random r = new Random();
		double randomValue = min + (max - min) * r.nextDouble();
		return randomValue;
	}
	
	/**
	 * Prints the species of animals that are available in the store
	 * @param animals Array with the species
	 */
	public static void printAvailableAnimals(ArrayList<String> animals) {
		int numElements = animals.size();
		System.out.printf("[");
		for (int i = 0; i < numElements; i++) {
			System.out.printf(animals.get(i) + " ");
			
		}
		System.out.printf("]\n");
	}

}
