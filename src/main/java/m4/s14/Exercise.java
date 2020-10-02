package m4.s14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise {
	/**
	 * Extract from input the even values and return them in a List
	 * 
	 * @param data a bunch of integers
	 * @return even values from input
	 * 
	 *         example: in {2, 3, 4, 5} -> out {2, 4}
	 */
	public List<Integer> evens(int[] data) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (data == null) {
			throw new NullPointerException("Parameter data is null");
		}

		for (int value : data) {
			if (value % 2 == 0) {
				result.add(value);
			}
		}

		return result;
	}

	/**
	 * Extract non-duplicated values in input and return them in a list
	 * 
	 * @param data a bunch of integers
	 * @return only the non-duplicated values from input
	 * 
	 *         example: in {2, 3, 4, 4} -> out {2, 3}
	 * 
	 */
	public List<Integer> singles(int[] data) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (data == null) {
			throw new NullPointerException("Parameter data is null");
		}

		for (int value : data) {
			if (result.isEmpty()) {
				result.add(value);
				continue;
			}

			if (!result.contains(value)) {
				result.add(value);
			} else {
				result.remove(result.indexOf(value));
			}

		}

		return result;
	}

	public List<Integer> singles2(int[] data) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		boolean flag = true;

		if (data == null) {
			throw new NullPointerException("Parameter data is null");
		}

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i] == data[j] && i != j) {
					flag = false;
				}
			}
			if (flag == true) {
				result.add(data[i]);
			}
			flag = true;
		}

		return result;
	}

	/*
	 * sorting e poi controllo se è uguale a quello precedente O(n lg n)
	 * 
	 */
	public List<Integer> singlesSort(int[] data) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (data == null) {
			throw new NullPointerException("Parameter data is null");
		}

		Arrays.sort(data);
		int prev = data[0];
		int count = 1;
		for (int i = 1; i < data.length; i++) {
			int cur = data[i];
			if (data[i] != prev) {
				if (count == 1) {
					result.add(prev);
				}
				prev = data[i];
				count = 1;
			} else {
				count += 1;
			}

			if (count == 1) {
				result.add(prev);
			}

		}

		return result;
	}

	/**
	 * As above, but with a linear time algorithm complessità O(n) HashMap occupa
	 * memoria però O(1)
	 * 
	 * @param data
	 * @return
	 */
	public ArrayList<Integer> singlesLinear(int[] data) {
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<>();

		if (data == null) {
			throw new NullPointerException("Parameter data is null");
		}

		for (int key : data) {
			if (myMap.containsKey(key)) {
				Integer value = myMap.get(key);
				myMap.put(key, value + 1);
			} else {
				myMap.put(key, 1);
			}
		}

		for (var entry : myMap.entrySet()) {
			if (entry.getValue() == 1) {
				result.add(entry.getKey());
			}
		}

		return result;
	}

	public ArrayList<Integer> singlesLinear2(int[] data) {
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<>();

		if (data == null) {
			throw new NullPointerException("Parameter data is null");
		}

		for (int key : data) {
			Integer value = myMap.putIfAbsent(key, 1);
			if (value != null) {
				myMap.put(key, value + 1);
			}
		}

		for (var entry : myMap.entrySet()) {
			if (entry.getValue() == 1) {
				result.add(entry.getKey());
			}
		}

		return result;
	}
}
