package menon.cs5050.assignment3;

public class PolynomialClient {

	public static void main(String[] args) {
		
		try {
			
			double[] polynomial1Array = new double[]{1.0, 2.0, 3.0, 4.0};
			double[] polynomial2Array = new double[]{5.0, 6.0, 7.0, 8.0};
			
			Polynomial multiplicand = new Polynomial(polynomial1Array);
			Polynomial multipliplier = new Polynomial(polynomial2Array);
			
			System.out.println("Muliplicand: " + multiplicand.toString());
			System.out.println("Muliplier: " + multipliplier.toString());
			
			Polynomial product = multiplicand.naiveMultiply(multipliplier);
			System.out.print("The product with the naive algorithm is ");
			System.out.println(product.toString());
			
			product = multiplicand.karatsubaMultiply(multipliplier);
			System.out.print("The product with the Karatsuba algorithm is ");
			System.out.println(product.toString());
			
		} catch (Exception e) {
			System.err.println("Exception thrown when constructing Polynomial.");
			e.printStackTrace();
		}

	}

}
