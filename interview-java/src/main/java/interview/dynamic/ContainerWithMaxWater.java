package interview.dynamic;


class ContainerWithMaxWater {

  /**
   * Brute force algorithm to check all possible permutations of heights
   */
  static int bruteForce(int[] heights) {
    int maxArea = 0;
    for (int i = 0; i < heights.length; i++) {
      for (int j = i + 1; j < heights.length; j++) {
        maxArea = Math.max(maxArea, Math.min(heights[i], heights[j]) * (j - i));
      }
    }
    return maxArea;
  }

  /**
   * One pass algorithm that converges from both ends
   */
  static int linearTime(int[] heights) {
    int maxArea = 0;
    int i = 0, j = heights.length-1;
    while (i < j) {
      maxArea = Math.max(maxArea, Math.min(heights[i], heights[j]) * (j - i));
      if (heights[i] < heights[j]) {
        j--;
      } else {
        i++;
      }
    }
    return maxArea;
  }
}
