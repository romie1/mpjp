package m4.s16;

import java.util.HashSet;
import java.util.Set;

public class Exercise {
    /**
     * Generate an array that contains only once each value (possibly duplicated) in
     * the input array
     * 
     * <pre>
     * Example: { 12, 53, 12, 35 } -> { 12, 53, 35 }
     * 
     * Note: Result is not expected in any specific order
     * </pre>
     * 
     * @param data an array with duplicates
     * @return a stripped copy of the original array
     */
    public Integer[] singles(int[] left) {
    	Set<Integer> result = new HashSet<Integer>();
    	for(int value : left) {
    		result.add(value);
    	}

    	return result.toArray(new Integer[result.size()]);
    }
    
    
}
