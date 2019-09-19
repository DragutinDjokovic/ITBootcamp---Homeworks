package zadatak_1_09122019;

public class GlavniCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double result = calc.add(12).div(2).sub(2).mul(20.5).add(-5).value();
		System.out.println(result);

	}

}
