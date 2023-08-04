package de.lionhzw.wtb;

import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    private static final Logger logger = LoggerUtil.getLogger();
    @FXML
    private Label welcomeText;

    public void startClient() {
        logger.severe("This is a severe message.");
        logger.warning("This is a warning message.");
        logger.info("This is an info message.");
    }

    public void windowClosed() {
        System.exit(1);
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


}