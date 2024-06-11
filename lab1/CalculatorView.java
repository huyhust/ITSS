package JavaFX;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CalculatorView extends VBox {
    private TextField num1Field;
    private TextField num2Field;
    private Button addButton;
    private TextField resultField;

    public CalculatorView() {
        setPadding(new Insets(10));
        setSpacing(5);

        HBox inputBox = new HBox(10);
        num1Field = new TextField();
        num1Field.setPromptText("Enter number 1");
        num2Field = new TextField();
        num2Field.setPromptText("Enter number 2");
        addButton = new Button("Add");
        resultField = new TextField();
        resultField.setEditable(false); // Không cho phép chỉnh sửa kết quả
        resultField.setPromptText("Result");

        inputBox.getChildren().addAll(num1Field, num2Field, addButton, resultField);

        getChildren().addAll(inputBox);
    }

    public int getNumber1() {
        return Integer.parseInt(num1Field.getText());
    }

    public int getNumber2() {
        return Integer.parseInt(num2Field.getText());
    }

    public void setResult(int result) {
        resultField.setText(Integer.toString(result));
    }

    public void addAddListener(Runnable listener) {
        addButton.setOnAction(e -> listener.run());
    }
}
