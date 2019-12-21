import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOError;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class MainMenu {
    @FXML private Button closeButton;
    CreationForm[] childElements;

    public void startSimulation(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("CreationForm.fxml"));
            Stage stage = new Stage();
            stage.setTitle("My New Stage Title");
            stage.setScene(new Scene(root, 871, 544));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void stopSimulation() {

    }

    public void exit(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
