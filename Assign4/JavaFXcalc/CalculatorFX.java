import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorFX extends Application {
    private TextField display;
    private String operator = "";
    private double firstNumber = 0;

    @Override
    public void start(Stage stage) {
        display = new TextField();
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setPrefHeight(50);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        int row = 0;
        int col = 0;
        for (String text : buttons) {
            Button btn = new Button(text);
            btn.setPrefSize(60, 60);
            btn.setOnAction(e -> buttonClicked(text));
            grid.add(btn, col, row);
            col++;
            if (col == 4) {
                col = 0;
                row++;
            }
        }

        VBox root = new VBox(10, display, grid);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 280, 350);
        stage.setTitle("JavaFX Calculator");
        stage.setScene(scene);
        stage.show();
    }

    private void buttonClicked(String text) {
        switch (text) {
            case "C":
                display.clear();
                operator = "";
                firstNumber = 0;
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                firstNumber = Double.parseDouble(display.getText());
                operator = text;
                display.clear();
                break;
            case "=":
                double secondNumber = Double.parseDouble(display.getText());
                double result = 0;
                switch (operator) {
                    case "+": result = firstNumber + secondNumber; break;
                    case "-": result = firstNumber - secondNumber; break;
                    case "*": result = firstNumber * secondNumber; break;
                    case "/": 
                        result = (secondNumber != 0) ? firstNumber / secondNumber : 0;
                        break;
                }
                display.setText(String.valueOf(result));
                operator = "";
                break;
            default:
                display.appendText(text);
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
