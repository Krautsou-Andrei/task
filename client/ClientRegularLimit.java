package by.itclass.array.energy.client;

public class ClientRegularLimit extends ClientPreferent {

	private double limit;

	public ClientRegularLimit() {

	}

	public ClientRegularLimit(String name, String type, final double consumedEnergy) {
		super(name, type, consumedEnergy);

	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;

	}

	@Override
	public double price() {
		double price;
		if (this.getConsumedEnergy() > limit) {
			price = limit * super.getTarif()
					+ (super.getConsumedEnergy() - limit) * super.getTarif() * super.getCoefficient();

		} else {
			price = super.getConsumedEnergy() * super.getTarif();

		}

		return price;

	}

	

}
