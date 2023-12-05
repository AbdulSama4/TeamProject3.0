package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class RegistrationSuccessfulController {

    @FXML
    private AnchorPane mainMenu;

    @FXML
    private Button returnToMenuButton;

    // Initializer method
    @FXML
    void initialize() {
        // Sets an action for the Return to Menu button
        returnToMenuButton.setOnAction(event -> {
            try {
                // Loads the mainMenu.fxml file
                AnchorPane mainMenuPane = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));

                // Replaces the current scene content with the mainMenu.fxml content
                mainMenu.getChildren().setAll(mainMenuPane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}