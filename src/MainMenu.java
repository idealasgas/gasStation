import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class MainMenu {
    @FXML private Label counterOfTime;
    @FXML private Button closeButton;
    private int counter;

    public void startSimulation(ActionEvent event) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        counterOfTime.setText("Прошло времени с момента запуска: " + counter++ + " сек.");
                    }
                });
            }
        }, 0, 1000);

    }

    public void stopSimulation() {

    }

    public void exit(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
