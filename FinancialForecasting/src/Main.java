public class Main {
    public static void main(String[] args) {
        double initialValue = 10000.0;
        double growthRate = 0.08;
        int years = 5;

        double futureValue = Forecaster.forecastValue(initialValue, growthRate, years);

        System.out.printf("Future value after %d years: ₹%.2f\n", years, futureValue);
    }
}
