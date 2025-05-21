public class CalculatorMain {
    public static void main(String[] args) {
        BMICalculator bmiCalculator = new BMICalculator();

        double weightInPounds = 154.0;
        double heightInPounds = 70.0;
        double bmiImperial = bmiCalculator.calculatebmiImperial
                (weightInPounds, heightInPounds);

        double weightInKilos = 70.0;
        double heightInMeters = 1.82;
        double bmiMetric = bmiCalculator.calculatebmiMetric
                (weightInKilos, heightInMeters);

        System.out.println("BMI in Imperial System: " + bmiImperial);
        System.out.println("BMI in Metric System: " + bmiMetric);
    }
}
