import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
	// write your code here
        launch(args);
        int  i=4;
        while (i==4) {

            System.out.println("говной воняешь");
        }

    }

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));

        primaryStage.setTitle("АЗС симуляция");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
