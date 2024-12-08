package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private static Stage primaryStage; 

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/resources/login.fxml")); 
        stage.setScene(new Scene(root));
        stage.setTitle("Jay Listening Bar");
        stage.show();
    }

    public static void setRoot(String fxml) {
        try {
            Parent root = FXMLLoader.load(App.class.getResource("/" + fxml + ".fxml"));
            primaryStage.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(); 
    }
}
