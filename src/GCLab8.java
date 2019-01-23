import java.util.Scanner;


public class GCLab8 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int input = 0;
		boolean valid = true;
		String choice;
		String userWantsToPlay = "y";

		String[] names = { "Henry", "Sue", "Maria", "John", "Harry", "Jacky", "Brian" };
		String[] food = { "Hotdogs", "Gyros", "Popcorn", "Pasta", "Steak", "Rice", "Carrots" };
		String[] hometown = { "Troy", "Detroit", "Royal Oak", "Barnesville", "Chicago", "Blue City", "Greatsville" };

		while (userWantsToPlay.startsWith("y")) {

			do {
				String prompt = ("To learn a student's name, please enter a number (1-7): ");

				input = ValidatorTwo.getInt(scnr, prompt, 1, 7);

				System.out.println(valid ? "This student's name is: " + names[input - 1] : "");

			} while (!valid);

			System.out.println("What would you like to know about " + names[input - 1] + "?"
					+ " (enter \"hometown\" or \"favorite food\"):");

			choice = scnr.nextLine();

			if (choice.equalsIgnoreCase("hometown")) {
				System.out.println(names[input - 1] + " is from " + hometown[input - 1]);

			}

			if (choice.equalsIgnoreCase("favorite food")) {
				System.out.println(names[input - 1] + "'s favorite food is " + food[input - 1]);
			}
			System.out.println("Would you like to learn about another student? (y/n)");
			userWantsToPlay = scnr.nextLine();

			System.out.println("Bye!");
		}
	}

}