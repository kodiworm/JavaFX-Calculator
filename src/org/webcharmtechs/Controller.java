package org.webcharmtechs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label output;
    @FXML
    private Label display;

    private String operator = "";
    private long num1, num2;
    private Model model = new Model();



    public void handleButtonEvent(ActionEvent event){
        String btnValue = ((Button)event.getSource()).getText();

        switch (btnValue){
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                output.setText(output.getText() + btnValue);
                break;
            case "CL":
                output.setText("");
                display.setText("");
                break;
            case "+":
                operator = "+";
                num1 = Long.parseLong(output.getText());
                output.setText("");
                display.setText(String.valueOf(num1) + operator);
                break;
            case "-":
                operator = "-";
                num1 = Long.parseLong(output.getText());
                output.setText("");
                display.setText(String.valueOf(num1) + operator);
                break;
            case "*":
                operator = "*";
                num1 = Long.parseLong(output.getText());
                output.setText("");
                display.setText(String.valueOf(num1) + operator);
                break;
            case "/":
                operator = "/";
                num1 = Long.parseLong(output.getText());
                output.setText("");
                display.setText(String.valueOf(num1) + operator);
                break;
            case "=":
                if (output.getText().isEmpty()){
                    output.setText(String.valueOf(num1));
                }
                else{
                    switch (operator){
                        case "+":
                            add();
                            break;
                        case "-":
                            sub();
                            break;
                        case "*":
                            mult();
                            break;
                        case "/":
                            div();
                            break;
                        default:
                            break;
                    }
                }
                break;
            default:
                break;
        }
    }

    public void add(){
        num2 = Long.parseLong(output.getText());
        float result = model.addition(num1, num2);
        output.setText(String.valueOf(result));
        display.setText(display.getText() + String.valueOf(num2));
    }

    public void sub(){
        num2 = Long.parseLong(output.getText());
        float result = model.subtraction(num1, num2);
        output.setText(String.valueOf(result));
        display.setText(display.getText() + String.valueOf(num2));
    }

    public void mult(){
        num2 = Long.parseLong(output.getText());
        float result = model.multiplication(num1, num2);
        output.setText(String.valueOf(result));
        display.setText(display.getText() + String.valueOf(num2));
    }

    public void div(){
        num2 = Long.parseLong(output.getText());
        float result = model.division(num1, num2);
        output.setText(String.valueOf(result));
        display.setText(display.getText() + String.valueOf(num2));
    }
}
