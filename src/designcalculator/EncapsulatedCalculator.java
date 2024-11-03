package designcalculator;

public class EncapsulatedCalculator {
    private Calculator calculator;

    public EncapsulatedCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    /*Here are few examples
    * Explain how these are implemented here
    * add more functions/methods related to your calculator*/
    public double add(double a, double b) {
        return calculator.add(a, b);
    }
    public double multiply(double a, double b) {
        return calculator.subtract(a, b);
    }

    public double abs(double a) {
        return ((AdvancedCalculator) calculator).abs(a);
    }

    public double sqrt(double a) {
        return ((AdvancedCalculator) calculator).sqrt(a);
    }
}
