package misc;

import java.util.Random;

/**
 * Created by akhalikov on 23.09.2015.
 */
class RandomFunction {

    static final Random RANDOM = new Random();

    public static void main(String[] args) {
        System.out.println(1|1);
    }

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
