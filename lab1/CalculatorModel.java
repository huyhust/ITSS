package JavaFX;

public class CalculatorModel {
    private int number1;
    private int number2;
    private int result;

    public void setNumbers(int num1, int num2) {
        number1 = num1;
        number2 = num2;
    }

    public void add() {
        result = number1 + number2;
    }

    public int getResult() {
        return result;
    }
}
