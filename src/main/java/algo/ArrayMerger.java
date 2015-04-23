package algo;

/**
 * Given two sorted arrays of numbers.
 * Merge them into one sorted array.
 */
class ArrayMerger {

	static int[] merge(int[] arr1, int[] arr2) {
		int i = 0, j = 0, n = arr1.length + arr2.length;
		int res[] = new int[n];
		for (int k = 0; k < n; k++) {
			if (i >= arr1.length)
				res[k] = arr2[j++];
			else if (j >= arr2.length)
				res[k] = arr1[i++];
			else if (arr1[i] < arr2[j])
				res[k] = arr1[i++];
			else
				res[k] = arr2[j++];
		}
		return res;
	}
}