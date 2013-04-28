package microbenchmarks;

import org.openjdk.jmh.annotations.GenerateMicroBenchmark;

/**
 * @author: Artur Khalikov
 */
public class HelloWorld {

    @GenerateMicroBenchmark
    public void helloThere() {

    }

    @GenerateMicroBenchmark
    public double helloThere2() {
        return Math.log(Math.PI);
    }
}
