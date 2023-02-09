package dev.achilles.passwordgenfx;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;


public class HelloController {
    public CheckBox checkBoxUpperCase;
    public CheckBox checkBoxLowerCase;
    public CheckBox checkBoxNumbers;
    public CheckBox checkBoxSymbols;
    public TextField passwordLength;
    public Label labelCopied;


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
        boolean includeUpperCase = false, includeLowerCase = false, includeNumbers = false, includeSymbols = false;

        if (checkBoxUpperCase.isSelected()) includeUpperCase = true;

        if (checkBoxLowerCase.isSelected()) includeLowerCase = true;

        if (checkBoxNumbers.isSelected()) includeNumbers = true;

        if (checkBoxSymbols.isSelected()) includeSymbols = true;

        Generator generator = new Generator(includeUpperCase, includeLowerCase, includeNumbers, includeSymbols);

        int length = Integer.parseInt(passwordLength.getText());

        String password = generator.generatePassword(length);


        StringSelection stringSelection = new StringSelection(password);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        welcomeText.setText(password);
        labelCopied.setText("Text copied to your clipboard");


    }
}