package menon.cs5050.assignment3;

public class PolynomialClient {

	public static void main(String[] args) {
		
		try {
			Polynomial polynomial = new Polynomial(new double[]{1.0, 2.0});
			System.out.println(polynomial.toString());
		} catch (Exception e) {
			System.err.println("Exception thrown when constructing Polynomial.");
			e.printStackTrace();
		}

	}

}
