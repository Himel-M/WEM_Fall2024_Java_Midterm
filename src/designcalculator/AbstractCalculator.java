package designcalculator;

public abstract class AbstractCalculator implements Calculator {
    /*Explain here why we are implementating Interface here
    Explain why we can use both concrete and abstract methdos here
    *
    * Add more methods same as or modifying the existing method
    * Think about how you could implement that in other classes
    * */
    public double add(double a, double b) {
        return a + b;
    }

    public abstract double multiply(double a, double b);
}
