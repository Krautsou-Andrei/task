package by.itclass.array.energy;

import java.util.ArrayList;
import java.util.Comparator;

import by.itclass.array.energy.client.Client;
import by.itclass.array.energy.client.ClientHeating;
import by.itclass.array.energy.client.ClientPreferent;
import by.itclass.array.energy.client.ClientRegular;
import by.itclass.array.energy.client.ClientRegularLimit;

public class CompanyLogic {

	public static String addClient(Company company) {

		String name = Enter.enterString("Enter name ");

		int itemMenu = Menu.menuClient();

		String type = switchType(itemMenu);

		double consumedEnergy = Enter.enterDouble("Enter consumed energy ");

		if (type.equals("ClientRegular")) {
			company.setAddClientCompany(new ClientRegular(name, type, consumedEnergy));

		} else if (type.equals("ClientHeating")) {
			company.setAddClientCompany(new ClientHeating(name, type, consumedEnergy));

		} else if (type.equals("ClientPreferent")) {
			company.setAddClientCompany(new ClientPreferent(name, type, consumedEnergy));

		} else if (type.equals("ClientRegularLimit")) {
			company.setAddClientCompany(new ClientRegularLimit(name, type, consumedEnergy));
		}

		String temp = "Client added";
		return temp;
	}

	public static String removeClient(Company company) {

		String temp = "";

		Print.print(company.clientArrayType(), "List clients");

		int IDClient = Enter.enter("Enter client ID ");

		for (Client client : company.getClientCompany()) {
			if (client.getID() == IDClient) {

				company.setRemoveClientCompany(client);
				temp = "Client deleted";
				break;

			} else {
				temp = "This client nor found";
			}
		}

		return temp;

	}

	private static String switchType(int itemMenu) {

		String type = "";

		switch (itemMenu) {

		case 1:
			type = "ClientRegular";

			break;

		case 2:
			type = "ClientPreferent";

			break;

		case 3:
			type = "ClientHeating";

			break;

		case 4:
			type = "ClientRegularLimit";

			break;
		}

		return type;

	}
	
	public static ArrayList<Client> sortType(ArrayList<Client> clientArray, String name1, String name2, String name3,
			String name4) {

		ArrayList<Client> typeClient = new ArrayList<>();
		ArrayList<Client> temp;

		temp = sort(clientArray, name1);
		typeClient.addAll(temp);

		temp = sort(clientArray, name2);
		typeClient.addAll(temp);

		temp = sort(clientArray, name3);
		typeClient.addAll(temp);

		temp = sort(clientArray, name4);
		typeClient.addAll(temp);

		return typeClient;

	}

	private static ArrayList<Client> sort(ArrayList<Client> clientArray, String name) {
		ArrayList<Client> typeClient = new ArrayList<>();

		for (Client client : clientArray) {

			if (client.getType().equals(name)) {
				typeClient.add(client);

			}
		}

		typeClient.sort(Comparator.comparing(Client::getName));

		return typeClient;
	}
	
	public static ArrayList<Client> sortID(ArrayList<Client> clientArray){
		
		clientArray.sort(Comparator.comparing(Client::getID));
		
		return clientArray;
	}

	public static ArrayList<Client> sortPrice(ArrayList<Client> clientArray) {

		clientArray.sort(Comparator.comparing(Client::getPrice).thenComparing(Client::getName));

		return clientArray;
	}

	public static ArrayList<Client> sortConsumedEnergy(ArrayList<Client> clientArray) {

		clientArray.sort(Comparator.comparing(Client::getConsumedEnergy).thenComparing(Client::getName));

		return clientArray;
	}

}
