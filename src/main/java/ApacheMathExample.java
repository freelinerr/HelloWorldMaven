public class ApacheMathExample {

    public static void main(String[] args) {

        double[] values = new double[]{65, 51, 16, 11, 6519, 191, 0, 98, 19854, 1, 32};
        double sum = 0;

        for (double value : values) {
            sum = sum + value;
        }

        double mean = sum / values.length;

        System.out.println(mean);
    }
}
