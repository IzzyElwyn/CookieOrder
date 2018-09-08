package cookies;

import java.util.Scanner;

public class OrderApp {

	public static void main(String[] args) {

		MasterOrder masterOrder = new MasterOrder();

		Scanner input = new Scanner(System.in);
		String variety;
		int numBoxes;
		int userChoice;

		do {
			System.out.println(
					"\nMenu \nPress 1 to add an order\nPress 2 to remove an order\nPress 3 to show a list of your orders\nPress 4 to exit");
			userChoice = input.nextInt();
			input.nextLine();

			switch (userChoice) {
			case 1:
				System.out.println("What type of cookie would you like to order?");
				variety = input.nextLine();
				System.out.println("And how many boxes of that type of cookie would you like?");
				numBoxes = input.nextInt();

				CookieOrder cookieOrder = new CookieOrder(variety, numBoxes);
				masterOrder.addOrder(cookieOrder);

				System.out.println("You have ordered " + masterOrder.getTotalBoxes() + " boxes");
				break;
			case 2:
				System.out.println("What would you like to remove? (specify a variety or none)");
				variety = input.nextLine();
				if (!variety.equalsIgnoreCase("none")) {
					masterOrder.removeVariety(variety);
				} else {
					continue;
				}
				break;
			case 3:
				masterOrder.showOrder();
				break;
			default:
				System.out.println(" ");
			}
		} while (userChoice != 4);

		input.close();

	}
}
