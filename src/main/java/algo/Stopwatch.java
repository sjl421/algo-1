package algo;

/**
 * @author Artur Khalikov
 */
public class Stopwatch {

    private final static double NANO_FACTOR = 1000.0 * 1000 * 1000;
    private static long start;
    private static long stop;

    public static void start() {
        start = System.nanoTime();
    }

    public static void stop(int input) {
        stop = System.nanoTime();
        double interval = (stop - start) / NANO_FACTOR;
        System.out.println("Execution time for input (" + input + "): " + interval);
    }

    public static void stop(String label) {
        stop = System.nanoTime();
        double interval = (stop - start) / NANO_FACTOR;
        System.out.println(label + ": " + interval);
    }
}
