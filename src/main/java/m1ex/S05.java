package m1ex;

public class S05 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		int len = s.length();

		StringBuilder newString = new StringBuilder();
		for (int i = len - 1; i >= 0; i--) {
			newString.append(s.charAt(i));
		}

		return newString.toString();
	}

	/**
	 * Check if the parameter is a palindrome abba
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		/*
		 * for(int i = 0; i < s.length()/2; i++) { if(s.charAt(i) !=
		 * s.charAt(s.length()-1-i)) { return false; } } return true;
		 */
		String reverseS = reverse(s);
		return reverseS.contentEquals(s) ? true : false;
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {

		StringBuilder newString = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (!checkVowels(s.charAt(i))) {
				newString.append(s.charAt(i));
			}
		}
		return newString.toString();
	}

	public static boolean checkVowels(char c) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < vowels.length; i++) {
			if (c == vowels[i]) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		// [1][0][0][0][1]
		// 1001 --> 1*2^3 + 0*2^2+ 0*2^1 + 1*2^0 = 9
		// 43_210
		// 2
		/*
		 * int result = 0 for(int i = s.length()-1; i>= 0; i--){ result +=
		 * (Integer.parseInt(String.valueOf(s.charAt(i))))*Math.pow(2,s.length()-1-i;
		 */
		int sum = 0;
		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				sum += Math.pow(2, j);
			}
			j++;
		}
		return sum;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int n = data.length;
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = data[n - 1 - i];
		}

		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum / data.length;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		int max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}
}
