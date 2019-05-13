package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setScene(new Scene(root, 500, 300));
        //primaryStage.show();

        //Scene scene1 = maxWindow(primaryStage);
        Scene scene1 = EvaniaWindow(primaryStage);
        primaryStage.setScene(scene1);

        primaryStage.show();
    }

    public Scene EvaniaWindow(Stage primaryStage) {
        Image Elk = new Image("Elk_Project_CP2.jpg", 200, 200, true, true);
        ImageView ElkView = new ImageView(Elk);
        Image Wolf = new Image("Wolf_Project_CP2.jpg");
        ImageView WolfView = new ImageView(Wolf);
        Image Gyrfalcon = new Image("Gyrfalcon_Project_CP2.jpg");
        ImageView GyrfalconView = new ImageView(Gyrfalcon);
        Button button1 = new Button("Elk", ElkView);
        //String ElkText = "Info about elks, a majestic creature";

        Button button2 = new Button("Wolf", WolfView);
        //String WolfText = "Wolf info, some of the most beautiful and talented creatures.";

        Button button3 = new Button("Gyrfalcon", GyrfalconView);
        //String GyrfalconText = "Gyrfalcon info, they are like falcons but white and live in the tundra";

        Label label = new Label("Click on an image");
        // TODO: 5/8/2019 Commented out the String AnimalText and label.setText(AnimalText) and added the set on mouse clicked commands. Have to ask Mr.Walter when he gets back if that is okay.


        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                if (event.getTarget() == button1) {
                    //label.setText(ElkText);
                } else if (event.getTarget() == button2) {
                    //label.setText(WolfText);
                } else if (event.getTarget() == button3) {
                    //label.setText(GyrfalconText);
                }


            }
        };
        button1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                label.setText("Elk info, a majestic creature");

            }
        });
        button2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (button2 == button2) {
                    label.setText("Wolf info, some of the most beautiful and talented creatures.");
                }
            }
        });
        button3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (button3 == button3) {
                    label.setText("Gyrfalcon info, they are like falcons but white and live in the tundra");
                }
            }
        });


        VBox vbox = new VBox(button1, button2, button3);

        BorderPane borderpane = new BorderPane();
        borderpane.setLeft(vbox);
        borderpane.setCenter(label);

        Scene scene = new Scene(borderpane, 300, 300);
        primaryStage.setTitle("Animal Information");
        return scene;

    }

    public Scene maxWindow(Stage primaryStage) {
        //Creating Max's 4 choices
        Rectangle rect1 = new Rectangle(100, 100);
        rect1.setFill(Color.CORNFLOWERBLUE); //topleft
        Rectangle rect2 = new Rectangle(100, 100);
        rect2.setFill(Color.FIREBRICK); //topright
        Rectangle rect3 = new Rectangle(100, 100);
        rect3.setFill(Color.DARKSEAGREEN); //bottomleft
        Rectangle rect4 = new Rectangle(100, 100);
        rect4.setFill(Color.DARKORANGE); //bottomright

        Paint color1 = rect1.getFill();
        Paint color2 = rect2.getFill();
        Paint color3 = rect3.getFill();
        Paint color4 = rect4.getFill();

        //adding functions to recs
        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
                    if (event.getTarget() == rect1) {
                        rect2.setFill(color1);
                        rect3.setFill(color1);
                        rect4.setFill(color1);
                    } else if (event.getTarget() == rect2) {
                        rect1.setFill(color2);
                        rect3.setFill(color2);
                        rect4.setFill(color2);
                    } else if (event.getTarget() == rect3) {
                        rect1.setFill(color3);
                        rect2.setFill(color3);
                        rect4.setFill(color3);
                    } else if (event.getTarget() == rect4) {
                        rect1.setFill(color4);
                        rect2.setFill(color4);
                        rect3.setFill(color4);
                    }

                } else if (event.getEventType() == MouseEvent.MOUSE_EXITED) {

                    rect1.setFill(color1);
                    rect2.setFill(color2);
                    rect3.setFill(color3);
                    rect4.setFill(color4);

                }

            }

        };
        rect1.addEventFilter(MouseEvent.MOUSE_ENTERED_TARGET, handler);
        rect1.addEventFilter(MouseEvent.MOUSE_EXITED, handler);

        rect2.addEventFilter(MouseEvent.MOUSE_ENTERED_TARGET, handler);
        rect2.addEventFilter(MouseEvent.MOUSE_EXITED, handler);

        rect3.addEventFilter(MouseEvent.MOUSE_ENTERED_TARGET, handler);
        rect3.addEventFilter(MouseEvent.MOUSE_EXITED, handler);

        rect4.addEventFilter(MouseEvent.MOUSE_ENTERED_TARGET, handler);
        rect4.addEventFilter(MouseEvent.MOUSE_EXITED, handler);


        GridPane layout1 = new GridPane();
        layout1.setHgap(200);
        layout1.setVgap(200);
        layout1.setAlignment(Pos.CENTER);

        layout1.setGridLinesVisible(false);
        layout1.add(rect1, 0, 0);
        layout1.add(rect2, 1, 0);
        layout1.add(rect3, 0, 1);
        layout1.add(rect4, 1, 1);
        Scene scene1 = new Scene(layout1, 500, 500);
        primaryStage.setTitle("Four Choices");
        primaryStage.setScene(scene1);

        primaryStage.show();
        return scene1;
    }


    public static void main(String[] args) {

        launch(args);
    }
}
