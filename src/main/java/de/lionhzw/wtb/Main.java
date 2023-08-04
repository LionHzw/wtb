package de.lionhzw.wtb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("wtbclient.fxml"));
        Parent root = fxmlLoader.load();
        Controller controller = fxmlLoader.getController();
        controller.startClient();

        Scene scene = new Scene(root);
        stage.setTitle("WTB");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.setOnCloseRequest(event -> controller.windowClosed());
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        stage.show();

        LoggerUtil.configureDefaultLogger();
    }

    public static void main(String[] args) {
        launch();
    }
}