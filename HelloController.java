package org.example.tarea1;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class HelloController implements Initializable {
    @FXML
    private TextField txt_result;
    String op ="";
    long number1;
    long numer2;
    public void Number(ActionEvent ae ){
        String no = ((Button)ae.getSource()).getText();
        txt_result.setText(txt_result.getText()+no);
    }

    public void Operation (ActionEvent ae) {
        String operation = ((Button) ae.getSource()).getText();
        if (!operation.equals("=")){
            if (!op.equals("")) {
                return;


            }
            op=operation;
            number1=Long.parseLong(txt_result.getText());
            txt_result.setText("");
        }
        else {
            if (op.equals((""))){
                return;
            }
            numer2 =Long.parseLong(txt_result.getText());}
        calculate(number1,numer2,op);
        op="";
    }



    public void calculate(long n1, long n2, String op) {
        switch (op) {
            case "+": txt_result.setText(n1 + n2 + "");break;
            case "-": txt_result.setText(n1 - n2 + "");break;
            case "*": txt_result.setText(n1 * n2 + "");break;
            case "/":
                if (n2==0){
                    txt_result.setText("0");break;

                }
                txt_result.setText(n1/n2+"");break;

        }
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
}
}