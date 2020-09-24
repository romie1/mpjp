package m1ex;

public class S03 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		if (value < 0) {
			return "negative";
		} else if (value > 0) {
			return "positive";
		} else {
			return "zero";
		}
	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		return (value % 2) != 0 ? true : false;
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		switch (value) {
		case 0:
			return "zero";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		default:
			return "other";
		}

	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50 F <= 50, E in
	 * (50, 60], D in (60, 70], C in (70, 80], B in (80, 90], A > 90
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 * @throws Exception 
	 */
	public static char vote(double percentile) {

		if (percentile <= 50) {
			return 'F';
		} else if (percentile <= 60) {
			return 'E';
		} else if (percentile <= 70) {
			return 'D';
		} else if (percentile <= 80) {
			return 'C';
		} else if (percentile <= 90) {
			return 'B';
		} else {
			return 'A';
		}

	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		boolean isLeapYear;
		isLeapYear = (year % 4 == 0);
		isLeapYear = isLeapYear && (year % 100 != 0);
		isLeapYear = isLeapYear || (year % 400 == 0);
		return isLeapYear;
	}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = new int[3];
		int first = a, middle = b, last = c;
		int tmp = 0;
		
		if (middle < first) {
			tmp = middle;
			first = middle;
			middle = tmp;
		}
		if (middle > last) {
			tmp = last;
			last = middle;
			middle = tmp;
		}
		if (middle < first) {
			tmp = middle;
			middle = first;
			first = middle;
		}

		result[0] = first;
		result[1] = middle;
		result[2] = last;

		return result;
	}
}
