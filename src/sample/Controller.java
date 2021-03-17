package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    TextArea mainTextArea;

    @FXML
    TextField msgSend;

    public void clickSendBtn(){
        if (!msgSend.getText().isEmpty()) {
            mainTextArea.appendText(msgSend.getText() + "\n");
            msgSend.clear();
        }

    }
}
