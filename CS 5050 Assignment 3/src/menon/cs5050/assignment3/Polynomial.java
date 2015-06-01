package menon.cs5050.assignment3;

public class Polynomial {

	private double[] coefficients;
	
	public Polynomial(double[] coefficients) throws Exception {
		
		if (!isPowerOfTwo(coefficients.length)) {
			throw new Exception("Polynomial should have number of coefficients equal to integral power of 2.");
		}
		this.coefficients = coefficients;
	}
	
	/**
	 * Multiply using naive algorithm
	 * @param multipleWith
	 * @return a polynomial representing the product of this one and the parameter
	 * @throws Exception 
	 */
	public Polynomial naiveMultiply(Polynomial multiplier) throws Exception {
		
		if (this.coefficients.length != multiplier.length()) {
			throw new Exception("Can only multiply a polynomial with " + this.coefficients.length + " coefficients.");
		}
		
		double[] product = new double[2 * this.coefficients.length];
		
		//Multiply the two polynomials
		for (int multiplicandIndex = 0; multiplicandIndex < this.coefficients.length; ++multiplicandIndex) {
			for (int multiplierIndex = 0; multiplierIndex < multiplier.length(); ++multiplierIndex) {
				product[multiplicandIndex + multiplierIndex] += this.coefficients[multiplicandIndex] * multiplier.at(multiplierIndex);
			}
		}
		
		return new Polynomial(product);
	}
	
	/**
	 * Multiply using Karatsuba algorithm
	 * @param multipleWith
	 * @return a polynomial representing the product of this one and the parameter
	 * @throws Exception 
	 */
	public Polynomial karatsubaMultiply(Polynomial multiplier) throws Exception {
		
		if (this.coefficients.length != multiplier.length()) {
			throw new Exception("Can only multiply a polynomial with " + this.coefficients.length + " coefficients.");
		}
		
		double[] product = new double[2 * this.coefficients.length];
		
		
		
		
		
		
		return new Polynomial(product);
	}
	
	public double at(int index) throws Exception {
		
		if (index >= this.coefficients.length) {
			throw new Exception("Index " + index + " is outside the coefficients for " + this.toString() + ".");
		}
		
		return this.coefficients[index];
	}
	
	/**
	 * @return the number of coefficients
	 */
	public int length() {
		return this.coefficients.length;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * Returns a String representation of the Polynomial
	 */
	public String toString() {
		
		StringBuffer returnValue = new StringBuffer();
		boolean firstTime = true;
		
		returnValue.append("\n[");		
		for (double coefficient : this.coefficients) {
			if (firstTime) {
				firstTime = false;
			} else {
				returnValue.append(", ");
			}
			returnValue.append(coefficient);
		}	
		returnValue.append("]\n");

		return returnValue.toString();
	}
	
	/**
	 * @param Number of coefficients
	 * @return true if input is an integral power of 2
	 */
	private boolean isPowerOfTwo(int numberOfCoefficients) {
		
		double numberOfCoefficientsLg = Math.log10(numberOfCoefficients)/Math.log10(2.0);
		int numberOfCoefficientsLgInt = Double.valueOf(numberOfCoefficientsLg).intValue();
		
		if (numberOfCoefficientsLgInt == numberOfCoefficientsLg) {
			return true;
		} else {
			return false;
		}

	}
}
