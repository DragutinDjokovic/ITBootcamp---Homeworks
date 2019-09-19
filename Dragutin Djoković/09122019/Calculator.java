package zadatak_1_09122019;

public class Calculator {

	private double value;

	

	public Calculator add(double a) {
		value += a;

		return this;
	}

	public Calculator div(double a) {
		value /= a;

		return this;
	}

	public Calculator sub(double a) {
		value -= a;

		return this;
	}

	public Calculator mul(double a) {
		value *= a;

		return this;
	}
	public double value() {
		return value;
	}
}
