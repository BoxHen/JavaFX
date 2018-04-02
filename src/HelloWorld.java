import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application { //The main class extends the javafx.application.Application
    public static void main(String[] args) { /*The main() method is ignored in correctly deployed JavaFX application.
                                               main() serves only as fallback in case the application can not be
                                               launched through deployment artifacts, e.g., in IDEs with limited FX
                                               support.*/
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) { //start() method is the main entry point for all JavaFX application
        primaryStage.setTitle("Hello World!"); // The stage class is the top level stage class
        Button btn = new Button();
        Button btn2 = new Button();
        btn.setText("Say 'Hello World'");
        btn2.setText("Say 'Bye World'");

        btn.setOnAction(new EventHandler<ActionEvent>() { // this is anonymous inner classes so we dont need to check event.getSource() == btn
             @Override
             public void handle(ActionEvent event) {
                 System.out.println("Hello World!");
             }
        });


        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));//this sets the initial size of the window when opened
        // The scene class is the container for all contents
        primaryStage.show();
    }
}

