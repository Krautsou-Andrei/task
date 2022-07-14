package by.itclass.array.energy.client;

public class ClientPreferent extends Client {

	private double coefficient;

	public ClientPreferent() {

	}

	public ClientPreferent(String name, String type, final double consumedEnergy) {
		super(name, type, consumedEnergy);

	}

	public double getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;

	}

	@Override
	public double price() {
		double price = super.getConsumedEnergy() * super.getTarif() * coefficient;
		return price;
	}

}
