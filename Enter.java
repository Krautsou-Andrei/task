package by.itclass.array.energy;

import java.util.Scanner;

public final class Enter {
	
	public static int enterSwitchMenu(String str) {
		
		int n;

		do {
			n = enter(str);

			if (n > 9 || n < 1) {
				System.out.printf("This item is not on the menu. %s", str);
			}

		} while (n > 9 || n < 1);
		
		return n;
		
	}
	
public static int enterSwitchClient(String str) {
		
		int n;

		do {
			n = enter(str);

			if (n > 4 || n < 1) {
				System.out.printf("This item is not on the menu. %s", str);
			}

		} while (n > 4 || n < 1);
		
		return n;
		
	}

	public static int enter(String str) {

		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		
			System.out.printf("%25s", str);

			while (!sc.hasNextInt()) {
				System.out.printf("It is not integer. %s", str);
				sc.next();
			}

			n = sc.nextInt();

			

		return n;
	}
	
	public static String enterString(String str) {
		
		String temp;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s", str);
		while (! sc.hasNextLine()) {
			System.out.printf("%s",str);
			sc.next();
		}
		
		temp = sc.nextLine().replaceAll("[^a-zA-Z\s]", "");
		
		return temp;
	}
	
	public static double enterDouble(String str) {
		
		double temp;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s", str);
		while (!sc.hasNextDouble()) {
			System.out.printf("It is not double. %s", str);
			sc.next();
		}
		
		temp = sc.nextDouble();
		
		return temp;
	}

}
