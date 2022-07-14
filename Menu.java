package by.itclass.array.energy;

public class Menu {

	public static void menuProgram(Company company) {

		int itemMenu;
		do {

			Print.menuProgram("Meny items");

			itemMenu = Enter.enterSwitchMenu("Selec menu item ");

			Switch.menu(company, itemMenu);

		} while (itemMenu != 9);
	}
	
	public static int menuClient() {
		
		int itemMenu;
		
		Print.menuClient("Client type list");
		
		itemMenu = Enter.enterSwitchClient("Enter the client type number from the list ");
		
		return itemMenu;
	}
}
