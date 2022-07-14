package by.itclass.array.energy;

public class Switch {

	public static void menu(Company company, int itemMenu) {

		switch (itemMenu) {

		case 1:
			company.setClientCompany(CompanyLogic.sortID(company.getClientCompany()));
			Print.print(company.clientArrayType(), "List clients");
			break;

		case 2:
			company.setClientCompany(CompanyLogic.sortPrice(company.clientArrayType()));
			Print.print(company.clientArrayType(), "List of clients sorted by price");
			break;

		case 3:
			company.setClientCompany(CompanyLogic.sortType(company.getClientCompany(), "ClientRegular",
					"ClientRegularLimit", "ClientPreferent", "ClientHeating"));
			Print.print(company.clientArrayType(), "List of clients sorted by type");
			break;

		case 4:
			company.setClientCompany(CompanyLogic.sortConsumedEnergy(company.getClientCompany()));
			Print.print(company.clientArrayType(), "List of clients sorted by energy consumed ");
			break;

		case 5:
			Print.print(company.totalPrice(), "Total price");
			break;

		case 6:

			Print.print(company.totalPreferent(), "Total preferent");
			break;

		case 7:

			Print.print(CompanyLogic.addClient(company));

			break;

		case 8:

			Print.print(CompanyLogic.removeClient(company));

			break;

		case 9:
			Print.print("Programm end");
			break;
		}

	}

}
