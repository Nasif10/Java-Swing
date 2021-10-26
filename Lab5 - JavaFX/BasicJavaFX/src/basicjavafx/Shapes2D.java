package basicjavafx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class Shapes2D extends Application {

    @Override
    public void start(Stage primaryStage) {
        //SETTING BUTTON AT BOTTOM
        Button btn1 = new Button("Text");
        Button btn2 = new Button("Line");
        Button btn3 = new Button("Circle");
        Button btn4 = new Button("Rectangle");
        
        final BorderPane root = new BorderPane();
        root.setBottom(btn1);

        
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                Text text = new Text();  
                text.setText("Hello !! Welcome to JavaFx");
                root.setCenter(text);
            }
        });


        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                Line line=new Line();
                line.setStartX(20);
                line.setStartY(20);
                line.setEndX(100);
                line.setEndY(100);
                line.setStroke(Color.BLUE);
               
                root.setCenter(line);
                /*Circle circle = new Circle();
                circle.setCenterX(50);
                circle.setCenterY(50);
                circle.setRadius(50);
                circle.setStroke(Color.BLACK);
                circle.setFill(Color.CORNSILK);
                root.setCenter(circle);*/
            }
        });
        


        //EVENT HANDLING
        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                Circle circle = new Circle();
                circle.setCenterX(50);
                circle.setCenterY(50);
                circle.setRadius(50);
                circle.setStroke(Color.BLACK);
                circle.setFill(Color.CORNSILK);
                root.setCenter(circle);
            }
        });
        
        
        
        
        btn4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                Rectangle r = new Rectangle();
                r.setX(50);
                r.setY(50);
                r.setWidth(200);
                r.setHeight(100);
                r.setArcWidth(20);
                r.setArcHeight(20);
                root.setCenter(r);
            }
        });
        

        Pane root2=new Pane();
        //root.getChildren().add(circle);
        Scene scene=new Scene(root,300,300);
        HBox layout2=new HBox(10);
        layout2.getChildren().addAll(btn1,btn2,btn3,btn4);
        root.setBottom(layout2);
        //CREATE STAGE
        primaryStage.setTitle("2D Shapes JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
