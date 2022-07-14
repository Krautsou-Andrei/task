package by.itclass.array.energy.client;

import java.util.Objects;

public abstract class Client {

	public static int counter = 1;

	private int ID;
	private String name;
	private String type;
	private double tarif;
	private double consumedEnergy;

	public Client() {
		this.ID = counter++;

	}

	public Client(String name, String type, double consumedEnergy) {

		this.ID = counter++;
		this.name = name;
		this.type = type;
		this.consumedEnergy = consumedEnergy;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public double getConsumedEnergy() {
		return consumedEnergy;
	}

	public void setConsumedEnergy(double consumedEnergy) {
		this.consumedEnergy = consumedEnergy;
	}

	public double getPrice() {
		return price();
	}

	public abstract double price();

	@Override
	public int hashCode() {
		return Objects.hash(ID, type, tarif, consumedEnergy);
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
		Client other = (Client) obj;
		return ID == other.ID && Objects.equals(name, other.name) && Objects.equals(type, other.type)
				&& tarif == other.tarif && consumedEnergy == other.consumedEnergy;
	}

	@Override
	public String toString() {
		return String.format("ID - %2d |", ID) + String.format("%10s ", name) + "| " + String.format("%20s ", type)
				+ "| " + "tarif " + tarif + " | " + "consumedEnergy = " + consumedEnergy + " | " + "price = "
				+ String.format("%.2f ", price());
	}

}
