package by.itclass.array.energy;

import java.util.ArrayList;

import by.itclass.array.energy.client.Client;
import by.itclass.array.energy.client.ClientHeating;
import by.itclass.array.energy.client.ClientPreferent;
import by.itclass.array.energy.client.ClientRegular;
import by.itclass.array.energy.client.ClientRegularLimit;


public class StartEnergy {
	public static void main(String[] args) {

		ArrayList<Client> clientArray = new ArrayList<>();

		ClientHeating Sacha = new ClientHeating("Nikita", "ClientHeating", Data.HEATING_CONSUMED_FIRST);
		ClientHeating Oleg = new ClientHeating("Oleg", "ClientHeating", Data.HEATING_CONSUMED_SECOND);
		ClientHeating Andrey = new ClientHeating("Andrey", "ClientHeating", Data.HEATING_CONSUMED_THIRD);
		ClientRegular  Misha = new ClientRegular("Misha", "ClientRegular", Data.REGULAR_CONSUMED_FIRST);
		ClientRegular Sergey = new ClientRegular("Sergey", "ClientRegular", Data.REGULAR_CONSUMED_SECOND);
		ClientRegular Nikita = new ClientRegular("Sacha", "ClientRegular", Data.REGULAR_CONSUMED_THIRD);
		ClientPreferent Vitya = new ClientPreferent("Vitya", "ClientPreferent", Data.PREFERENT_CONSUMED_FIRST);
		ClientPreferent Kolya = new ClientPreferent("Kolya", "ClientPreferent", Data.PREFERENT_CONSUMED_SECOND);
		ClientPreferent Igor = new ClientPreferent("Igor", "ClientPreferent", Data.PREFERENT_CONSUMED_THIRD);
		ClientRegularLimit Vanya = new ClientRegularLimit("Vanya", "ClientRegularLimit",
				Data.REGULAR_LIMIT_CONSUMED_FIRST);
		ClientRegularLimit Petya = new ClientRegularLimit("Petya", "ClientRegularLimit",
				Data.REGULAR_LIMIT_CONSUMED_SECOND);
		ClientRegularLimit Slava = new ClientRegularLimit("Slava", "ClientRegularLimit",
				Data.REGULAR_LIMIT_CONSUMED_THIRD);
		

		clientArray.add(Sacha);
		clientArray.add(Oleg);
		clientArray.add(Andrey);
		clientArray.add(Misha);
		clientArray.add(Sergey);
		clientArray.add(Nikita);
		clientArray.add(Vitya);
		clientArray.add(Kolya);
		clientArray.add(Igor);
		clientArray.add(Vanya);
		clientArray.add(Petya);
		clientArray.add(Slava);
		
		Company company = new Company(15, 2 / 3f, 1 / 3f, 1 / 15f, 250, clientArray);
	
		Menu.menuProgram(company);
		
		

	}
	

}
