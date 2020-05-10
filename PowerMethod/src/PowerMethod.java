
public class PowerMethod {
	
	public static void main(String[] args) {
		
		// Plug in the values for your matrix A here in the format
		//    topLeft, topRight, bottomLeft, bottomRight
		Matrix2x2 A = new Matrix2x2(0.38, 0.18, -0.48, 1.22);
		
		// Plug in your guess vector here in the format
		//    top, bottom
		Matrix2x1 guess = new Matrix2x1(-1, 1);
		
		Matrix2x1 product = A.multiplyByVector(guess);
		double lastLargerValue;
		do {
			lastLargerValue = product.largerValue();
			guess.setTop(product.getTop()/lastLargerValue);
			guess.setBottom(product.getBottom()/lastLargerValue);
			product = A.multiplyByVector(guess);
		} while (Math.abs(product.largerValue()-lastLargerValue) > 0.00001);
		
		System.out.printf("Largest eigenvalue: %.3f %n", product.largerValue());
		System.out.printf("Corresponding eigenvector: <%.3f, %.3f> %n", guess.getTop(), guess.getBottom());
	}
}
