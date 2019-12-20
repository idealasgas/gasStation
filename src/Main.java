import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    MainMenu uInterface = new MainMenu();

    public static void main(String[] args) {
	// write your code here
        launch(args);
        int  i=4;
        while (i==4) {

            System.out.println("говной воняешь");
        }

    }

    public void start(Stage primaryStage) throws Exception{
        GasStationCreator stationCreator = new GasStationCreator();
        CreationForm creationForm = new CreationForm();
        AutomobileCreator automobileCreator = new AutomobileCreator();
        DriverCreator driverCreator = new DriverCreator();
        Simulation simulation = new Simulation();
        ProductCreator productCreator = new ProductCreator();
        OperatorCreator operatorCreator = new OperatorCreator();

        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));

        primaryStage.setTitle("АЗС симуляция");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
