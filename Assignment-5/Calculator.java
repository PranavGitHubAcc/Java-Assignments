class StatisticCalculator {
    private int arr[] = {10, 200, 90, 12, 34, 58, 90, 26, 39};

    public int minimum() {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int maximum() {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { // Corrected this condition
                max = arr[i];
            }
        }
        return max;
    }

    public double avg() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public double sd() {
        double mean = avg();
        double sumSquaredDiff = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sumSquaredDiff += Math.pow(arr[i] - mean, 2);
        }
        double variance = sumSquaredDiff / arr.length;
        return Math.sqrt(variance);
    }
}

public class Calculator {
    public static void main(String[] args) {
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        System.out.println("Maximum: " + statisticCalculator.maximum());
        System.out.println("Minimum: " + statisticCalculator.minimum());
        System.out.println("Average: " + statisticCalculator.avg());
        System.out.println("Standard Deviation: " + statisticCalculator.sd());
    }
}
