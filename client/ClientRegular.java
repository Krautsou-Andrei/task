package by.itclass.array.energy.client;

public class ClientRegular extends Client {

	public ClientRegular() {

	}

	public ClientRegular(String name, String type, final double consumedEnergy) {
		super(name, type, consumedEnergy);

	}

	@Override
	public double price() {

		double price = super.getConsumedEnergy() * super.getTarif();
		return price;
	}

}
