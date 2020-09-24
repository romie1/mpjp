package m1ex;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		long result = 0;
		if(last < first) {
			for(int i = last; i >= first; i--) {
				result -= i;
			}
		}else {
			for(int i = first; i <= last; i++) {
				result += i;
			}
		}
		return result;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		long result = 0;
		if(last < first) {
			for(int i = last; i >= first; i--) {
				if(i%2 == 0) result -= i;
			}
		}else {
			for(int i = first; i <= last; i++) {
				if(i%2 == 0) result += i;
			}
		}
		return result;
	}

	/**
	 * Square root using Newton method
	 * Epsilon should be set to 0.001
	 *  x = x/2 + value/(2x)
	 * @param value
	 * @return calculated square root
	 */
	public static double sqrt(double value) {
	    double epsilon = 0.001;
	    double res = 1;
	    double buf = 1.1;

	    while(Math.abs(res-buf) > epsilon) {
	    	buf = res;
	    	res = (res/2)+(value/(2*res));

	    }
	    
	    return res;
	}

	/**
     * Square root using Newton method
     * 
	 * @param value
	 * @param epsilon stop iterating when gain is less than this value
	 * @return calculated square root
	 */
    public static double sqrt(double value, double epsilon) {
        // TODO
        return 0.0;
    }
	
	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {	
		if (value > 0) {
			long result = 1;
			for(int i = 2; i <= value; i++) {
				result *= value;
			}
			return result;
		}else if( value == 0) {
			return 1;
		}else {
			return 0;
		}
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8)
	 * Metodo ricorsivo
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		if(value == 0) {
			return 0;
		} else if(value == 1) {
			return 1;
		} else {
			long f1 = fibonacci(value -1);
			long f2 = fibonacci(value -2);
			return f1 + f2;
		}
	}
	
	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8)
	 * Metodo iterativo
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci2(int value) {
		return 0;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value][value];

		for(int i =0; i < value; i++) {
			for(int j = 0; j< value;j++) {
				result[i][j] = (i+1)*(j+1);
			}
		}

		return result;
	}
}
