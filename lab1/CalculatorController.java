package JavaFX;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        this.view.addAddListener(this::addNumbers);
    }

    private void addNumbers() {
        int num1 = view.getNumber1();
        int num2 = view.getNumber2();

        model.setNumbers(num1, num2);
        model.add();

        view.setResult(model.getResult());
    }
}
