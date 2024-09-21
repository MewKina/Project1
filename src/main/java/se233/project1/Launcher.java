package se233.project1;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }
public void start(Stage stage) throws Exception{
        primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("PaneP1.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        primaryStage.setTitle("Picture Manipulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
