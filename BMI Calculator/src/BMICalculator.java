public class BMICalculator {
    public double calculatebmiImperial(double weightInPounds, double heightInInches) {
        return weightInPounds / (heightInInches * heightInInches) * 703;
    }
    public double calculatebmiMetric(double weightInKilos, double heightInMeters) {
        return weightInKilos / (heightInMeters * heightInMeters);
    }
}
