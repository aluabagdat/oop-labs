package lab3;

public class Data {

    private double sum;
    private double max
    private int count;

    public Data() {
        sum = 0;
        count = 0;
        max = Double.NEGATIVE_INFINITY;
    }

    public void addValue(double value) {
        sum += value;
        count++;

        if (value > max) {
            max = value;
        }
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }


    public double getMaximum() {
        if (count == 0) {
            return 0;
        }
        return max;
    }
}
