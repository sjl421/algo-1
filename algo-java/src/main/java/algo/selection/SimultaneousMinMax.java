package algo.selection;

/**
 * Find min and max for the given number array
 */
class SimultaneousMinMax {
  /**
   * Simple implementation
   * Number of comparisons: n*2
   */
  static MinMax findMinMax(int[] arr) {
    int min = arr[0], max = min, comp = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min)
        min = arr[i];
      if (arr[i] > max)
        max = arr[i];

      comp += 2; // 2 comparisons for each iteration
    }

    MinMax p = new MinMax(min, max);
    p.comparisonsNum = comp;
    return p;
  }

  /**
   * Number of comparisons: n*3 / 2
   */
  static MinMax findMinMax2(int[] arr) {
    int min = arr[0], max = min, comp = 0;
    for (int i = 1; i < arr.length - 1; i+=2) {
      int first = arr[i], second = arr[i+1];
      if (first < second) {
        if (first < min)
          min = first;
        if (second > max)
          max = second;
      } else {
        if (first > max)
          max = first;
        if (second < min)
          min = second;
      }
      comp += 3;
    }
    MinMax p = new MinMax(min, max);
    p.comparisonsNum = comp;
    return p;
  }

  static class MinMax {
    int min;
    int max;

    int comparisonsNum;

    MinMax(int min, int max) {
      this.min = min;
      this.max = max;
    }
  }
}
