public class Forecaster {

    public static double forecastValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }

        return forecastValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }
}
