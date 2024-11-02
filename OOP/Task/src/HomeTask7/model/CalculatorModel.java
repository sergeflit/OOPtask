package HomeTask7.model;

public class CalculatorModel {
    private double result;

    public void add(double num1, double num2) {
        result = num1 + num2;
    }

    public void multiply(double num1, double num2) {
        result = num1 * num2;
    }

    public void divide(double num1, double num2) {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            throw new ArithmeticException("Делить на ноль нельзя!");
        }
    }

    public double getResult() {
        return result;
    }
}


