package by.itclass.array.energy;

import java.util.ArrayList;

import by.itclass.array.energy.client.Client;

public class Print {

	public static void print(ArrayList<Client> array, String str) {

		System.out.println();
		System.out.printf("%40s \n", str);

		for (Client client : array) {
			
			System.out.println(client);
		}

		System.out.println();
	}

	public static void print(double value, String str) {

		System.out.println();
		System.out.printf("%40s  = %.2f \n", str, value);
		System.out.println();
	}

	public static void menuProgram(String str) {

		System.out.printf("%20s \n", str);

		System.out.println("1 - Customer information");
		System.out.println("2 - Sorting customer by price");
		System.out.println("3 - Sorting customer by type");
		System.out.println("4 - Sorting customer by cunsumed energy");
		System.out.println("5 - Show total price");
		System.out.println("6 - Show total preferent");
		System.out.println("7 - Add client");
		System.out.println("8 - Remove client");
		System.out.println("9 - Exit");

	}

	public static void menuClient(String str) {

		System.out.println();
		System.out.printf("%20s \n", str);

		System.out.println("1 - ClientRegular");
		System.out.println("2 - ClientPreferent");
		System.out.println("3 - ClientHeating");
		System.out.println("4 - ClientRegularLimit");
		System.out.println();

	}

	public static void print(String str) {

		System.out.println();
		System.out.printf("%40s", str);
		System.out.println();
	}

}
