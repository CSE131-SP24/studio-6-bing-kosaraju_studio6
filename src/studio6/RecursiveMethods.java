package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
		double total= 0.0;
			if (n==0) {
				return 0;
			} else {
				return 1/(Math.pow(2, n))+geometricSum(n-1);
			}
			
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		//array to store the reversed version
		int [] reversedarray= new int[array.length];
		//0 to start at beginning index
		helpermethod(array, reversedarray, 0);	
		return reversedarray;
			
			
		
	}
	public static int[] helpermethod (int []array, int reversedarray[], int index) {
		//base case: stop if we are more than halfway through the array
		if(index>reversedarray.length/2) {
			return reversedarray;
		} else {
			//get the last index on the other array so we can move it to first index of reversed
			int mirrorIndex = array.length - 1;
			//we are switching indexes, copying values from the original to the reversed
			reversedarray[mirrorIndex] = array[index];
			reversedarray[index] = reversedarray[mirrorIndex];
			return helpermethod(array, reversedarray, index + 1);
			
		}
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		if (radius>=radiusMinimumDrawingThreshold) {
			StdDraw.circle(xCenter, yCenter, radius);
			double oldRadius=radius;
			radius=oldRadius/3.0;
			circlesUponCircles(xCenter, yCenter+oldRadius, radius,radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter-oldRadius, yCenter, radius,radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter-oldRadius, radius,radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter+oldRadius, yCenter, radius,radiusMinimumDrawingThreshold);
			return;
			
			
		}
		
		
		
		// FIXME
	}

}
