package basicjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Nasif
 */
public class SceneChange extends Application{
    public void start(Stage primaryStage) {
       //Create scene1
        final Stage windows;
        windows=primaryStage;
        final Scene scene1,scene2;
        Label label1=new Label("Welcome to Scene 1");
        Button button1=new Button("Go to Scene 2");
        Label label2=new Label("Welcome to Scene 2");
        Button button2=new Button("Go to Scene 1");
        HBox layout1=new HBox(10);
        HBox layout2=new HBox(10);
        layout1.getChildren().addAll(label1,button1);
       
        scene1=new Scene(layout1,300,300);
        scene2=new Scene(layout2,300,350);
        
        windows.setScene(scene1);
        windows.show();
        layout2.getChildren().addAll(label2,button2);
        button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                windows.setScene(scene2);
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                windows.setScene(scene1);
            }
        });
        
      
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
}
