package m1ex;

import java.util.logging.Logger;

public class S02 {
	private static final Logger LOG = Logger.getGlobal();

	/**
	 * Average speed
	 * 
	 * @param distance in meters
	 * @param time     in seconds
	 * @return speed in meters per second
	 */
	public static double speed(double distance, double time) {
		LOG.info(String.format("distance is %.3f and time is %.2f", distance, time));
		try {
			if (time < 0) throw new IllegalArgumentException("No negative values expected");
		} catch (IllegalArgumentException e) {

		}

		return distance / time;
	}

	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0 first point x
	 * @param y0 first point y
	 * @param x1 second point x
	 * @param y1 second point y
	 * @return distance
	 */
	public static double distance(double x0, double y0, double x1, double y1) {
		return Math.sqrt((y1 - y0) * (y1 - y0) + (x1 - x0) * (x1 - x0));
	}

	/**
	 * Engine capacity 
	 * capacity = ((bore/2)^2 * Math.PI * stroke)*nr
	 * capacity2 = capacity/1000
	 * @param bore   in mm
	 * @param stroke in mm
	 * @param nr     number of cylinders
	 * @return the engine capacity in cm^3
	 */
	public static double engineCapacity(double bore, double stroke, int nr) {
		return ((Math.pow((bore/ 2),2) * Math.PI * stroke) * nr)/1000;
	}

	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 */
	public static int digitSum(int value) {
		int sum = 0;

		while (value != 0) {
			sum += value % 10;
			value /= 10;
		}

		return sum < 0 ? sum *= -1 : sum;
	}

	/**
	 * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
	 *
	 * @param x
	 * @param y
	 *
	 * @return
	 */
	public static int score(double x, double y) {

		double dist = distance(0, 0, x, y);

		int score = 0;

		if (dist < 1) {
			score = 10;
		
		} else if (dist >= 1 && dist < 5) { 	//else if (dist < 5)
			score = 5;
		} else if (dist >= 5 && dist < 10) {
			score = 1;
		} else {
			score = 0;
		}

		return score;
	}
}
