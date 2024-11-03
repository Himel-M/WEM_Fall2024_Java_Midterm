package designcalculator;

public enum Operators {
    ADDITION("+"), SUBTRACTION("-"), MULTIPLICATION("*"), DIVISION("/");

    private final String symbol;

    Operators(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

}
