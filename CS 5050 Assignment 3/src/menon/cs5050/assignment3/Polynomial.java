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
	 */
	public Polynomial naiveMultiply(Polynomial multipleWith) {
		return null;
	}
	
	/**
	 * Multiply using Karatsuba algorithm
	 * @param multipleWith
	 * @return a polynomial representing the product of this one and the parameter
	 */
	public Polynomial karatsubaMultiply(Polynomial multipleWith) {
		return null;
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
