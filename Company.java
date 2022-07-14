package by.itclass.array.energy;

import java.util.ArrayList;
import java.util.Objects;

import by.itclass.array.energy.client.Client;
import by.itclass.array.energy.client.ClientHeating;
import by.itclass.array.energy.client.ClientPreferent;
import by.itclass.array.energy.client.ClientRegularLimit;
import by.itclass.array.energy.implement.AddAndRemove;
import by.itclass.array.energy.implement.ClientArrayType;
import by.itclass.array.energy.implement.TotalPreferent;
import by.itclass.array.energy.implement.TotalPrice;

public class Company implements ClientArrayType, TotalPrice, TotalPreferent, AddAndRemove {

	private ArrayList<Client> clientCompany = new ArrayList<>();
	private double tarif;
	private double coefficientPreferent;
	private double coefficientLimit;
	private double coefficientHeating;
	private double limit;

	public Company() {

	}

	public Company(double tarif, double coefficientPreferent, double coefficientLimit, double coefficientHeating,
			double limit, ArrayList<Client> clientArray) {
		this.tarif = tarif;
		this.coefficientPreferent = coefficientPreferent;
		this.coefficientLimit = coefficientLimit;
		this.coefficientHeating = coefficientHeating;
		this.limit = limit;
		this.clientCompany = clientArray;

	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(int tarif) {
		this.tarif = tarif;

	}

	public double getCoefficientPreferent() {
		return coefficientPreferent;
	}

	public void setCoefficientPreferent(int coefficientPreferent) {
		this.coefficientPreferent = coefficientPreferent;

	}

	public double getCoefficientLimit() {
		return coefficientLimit;
	}

	public void setCoefficientLimit(int coefficientLimit) {
		this.coefficientLimit = coefficientLimit;

	}

	public double getCoefficientHeating() {
		return coefficientHeating;
	}

	public void setCoefficientHeiting(int coefficientHeating) {
		this.coefficientHeating = coefficientHeating;

	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;

	}

	public ArrayList<Client> getClientCompany() {
		return clientCompany;
	}

	public void setClientCompany(ArrayList<Client> clientArray) {
		this.clientCompany = clientArray;
	}

	@Override
	public void setAddClientCompany(Client client) {
		this.clientCompany.add(client);
	}

	@Override
	public void setRemoveClientCompany(Client client) {
		this.clientCompany.remove(client);
	}

	@Override
	public ArrayList<Client> clientArrayType() {

		for (Client client : clientCompany) {

			client.setTarif(tarif);
			if (client.getType().equals("ClientHeating")) {

				((ClientHeating) client).setCoefficient(coefficientHeating);

			} else if (client.getType().equals("ClientPreferent")) {

				((ClientPreferent) client).setCoefficient(coefficientPreferent);

			} else if (client.getType().equals("ClientRegularLimit")) {

				((ClientRegularLimit) client).setCoefficient(coefficientLimit);
				((ClientRegularLimit) client).setLimit(limit);
			}
		}

		return clientCompany;

	}

	@Override
	public double totalPrice() {

		double totalPrice = 0;

		for (int i = 0; i < clientCompany.size(); i++) {

			totalPrice = totalPrice + clientCompany.get(i).getPrice();

		}

		return totalPrice;

	}

	@Override
	public double totalPreferent() {
		double totalPreferent = 0;

		double totalPrice = totalPrice();

		for (int i = 0; i < clientCompany.size(); i++) {
			totalPreferent = totalPreferent + (clientCompany.get(i).getConsumedEnergy() * tarif);
		}

		totalPreferent = totalPreferent - totalPrice;

		return totalPreferent;

	}

	@Override
	public int hashCode() {
		return Objects.hash(clientCompany, tarif, coefficientPreferent, coefficientLimit, coefficientHeating, limit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Company other = (Company) obj;

		return Objects.equals(clientCompany, other.clientCompany) && tarif == other.tarif
				&& coefficientPreferent == other.coefficientPreferent && coefficientLimit == other.coefficientLimit
				&& limit == other.limit;
	}

	@Override
	public String toString() {
		return "Company [clientCompany=" + clientCompany + ", tarif=" + tarif + ", coefficientPreferent="
				+ coefficientPreferent + ", coefficientLimit=" + coefficientLimit + ", coefficientHeating="
				+ coefficientHeating + ", limit=" + limit + "]";
	}
}
