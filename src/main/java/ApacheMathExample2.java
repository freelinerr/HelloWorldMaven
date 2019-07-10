import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class ApacheMathExample2 {

    public static void main(String[] args) {

        double[] values = new double[]{65, 51, 16, 11, 6519, 191, 0, 98, 19854, 1, 32};

        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();

        for (double value : values) {
            descriptiveStatistics.addValue(value);
        }

        double newMean = descriptiveStatistics.getMean();

        System.out.println(newMean);
    }
}
