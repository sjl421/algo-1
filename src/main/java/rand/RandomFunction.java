package rand;

import java.util.Random;

/**
 * Function that works as a coin returning random result at each call.
 */
class RandomFunction {
  private static final Random RANDOM = new Random();

  static int frand4() {
    int x = frand();
    int y = frand();
    if (x == 0 && y == 0) return 0;
    else if (x == 0 && y == 1) return 1;
    else if (x == 1 && y == 0) return 2;
    else return 3;
  }

  static int frand3() {
    while (true) {
      int x = frand();
      int y = frand();
      if (x == 0 && y == 0) return 0;
      else if (x == 0 && y == 1) return 1;
      else if (x == 1 && y == 0) return 2;
      else {
        // skipping
      }
    }
  }

  static int frand() {
    return RANDOM.nextInt(2);
  }
}
