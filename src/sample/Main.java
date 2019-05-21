package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application {
    public Scene scene1;
    public Scene scene2;
    public Scene scene3;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setScene(new Scene(root, 500, 300));
        //primaryStage.show();

        //Scene scene1 = maxWindow(primaryStage);
        //scene1 = EvaniaWindow(primaryStage);
        //scene2 = maxWindow(primaryStage);
       scene3 = Finalwindow(primaryStage);
        primaryStage.setScene(scene3);

        primaryStage.show();
    }

    public Scene Finalwindow(Stage primarystage) {

        Image WhiteImage = new Image("whitebackground.jpg");

        Image ArticWolf = new Image("articwolf.jpg", 200, 200, true, true);
        ImageView ArtView = new ImageView(ArticWolf);
        Button button4 = new Button("Artic Wolf", ArtView);


        Image AfricanGoldenWolf = new Image("africangoldenwolf.jpg", 200, 200, true, true);
        ImageView AfrView = new ImageView(AfricanGoldenWolf);
        Button button5 = new Button("African Golden Wolf", AfrView);


        Image EthiopianWolf = new Image("ethiopianwolf.jpg", 200, 200, true, true);
        ImageView EthView = new ImageView(EthiopianWolf);
        Button button6 = new Button("Ethiopian Wolf", EthView);


        Image GrayWolf = new Image("graywolf.jpg", 200, 200, true, true);
        ImageView GryView = new ImageView(GrayWolf);
        Button button7 = new Button("Gray Wolf", GryView);


        Image Mannedwolf = new Image("mannedwolf.jpg", 200, 200, true, true);
        ImageView ManView = new ImageView(Mannedwolf);
        Button button8 = new Button("Manned Wolf", ManView);

        Button button9 = new Button("Return to main screen");

        Label label = new Label("Welcome to the page where you can learn all about different species of wolves. Click on one of the images to gain the information on that species.");



        BackgroundImage background1  = new BackgroundImage(ArticWolf,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,new BackgroundSize(100,100, true, true,true, false));
        Background background6= new Background(background1);
        BackgroundImage background2  = new BackgroundImage(AfricanGoldenWolf,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,new BackgroundSize(100,100, true, true,true, false));
        Background background7= new Background(background2);
        BackgroundImage background3  = new BackgroundImage(EthiopianWolf,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,new BackgroundSize(100,100, true, true,true, false));
        Background background8= new Background(background3);
        BackgroundImage background4  = new BackgroundImage(GrayWolf,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,new BackgroundSize(100,100, true, true,true, false));
        Background background9= new Background(background4);
        BackgroundImage background5  = new BackgroundImage(Mannedwolf,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,new BackgroundSize(100,100, true, true,true, false));
        Background background10= new Background(background5);
        BackgroundImage background11 = new BackgroundImage(WhiteImage,null,null,null,null);
        Background background12 = new Background(background11);


        BorderPane borderpane = new BorderPane();


        button4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (button4 == button4) {
                    label.setText("Scientific Name: Canis lupus arctos\n Habitat: Snowy biomes, Artic regions\n Features: Have thick white coats and short limbs to keep away from frigid temperatures.\n Behavior: Lives in a pack of six wolves or as a lone wolf.\n Life Span: 7 years in the wild and 20 in captivity.");
                    borderpane.setBackground(background6);
                }
            }
        });
        button5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (button5 == button5) {
                    label.setText("Scientific Name: Canis anthus\n Habitat: Northeast and Northwest Africa\n Features: Has a long muzzle and a short tail. Color varies due to geographical location or season. Marking on face, throat, and abdomen are usally white. Amber is the main color of their eyes.\n Behavior: In a pack consisting of the mated pair, current offspring/litter, and/or past offspring that stay as 'helpers' \n Life Span: 8 years");
                    borderpane.setBackground(background7);
                }
            }
        });
        button6.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (button6 == button6) {
                    label.setText("Scientific Name: Canis simensis\n Habitat: Found in some mountain ranges in Ethiopia\n Features: Slender and long-limbed canines. Redish fur with white markings on their tails, legs, belly, face, and chin.\n Behavior: In a pack of 3-13 wolves, but mainly 6.\n Life Span: 8 through 10 years");
                    borderpane.setBackground(background8);
                }
            }
        });
        button7.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (button7 == button7) {
                    label.setText("Scientific Name: Canis lupus\n Habitat: Canada, Alaska, the Great Lakes, northern Rockies and Pacific Northwest.\n Features: Fur colors can range from gray, white, black, and ect.\n Behavior: Lives in a pack with up to 7 or 8 other wolves. Each wolf has their own unique sounds (like a howl) to communicate with other wolves.\n Life Span: 7-8 years in the wild and 12 or more years in a remote or protected area.");
                    borderpane.setBackground(background9);
                }
            }
        });
        button8.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (button8 == button8) {
                    label.setText("Scientific Name: Chrysocyon brachyurus\n Habitat: Central and Eastern South America\n Features: They have a thick red coat, long black legs and tall, erect ears. The maned wolf is the largest canid of South America. Is called a 'manned wolf' because of how its fur is around its neck.\n Behavior: Lives only with its mate\n Life Span: Its lifespan in the wild is unknown. It could live 6.5-15 years in captivity.");
                    borderpane.setBackground(background10);
                }
            }
        });
        button9.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (button9 == button9) {
                    label.setText("Welcome to the page where you can learn all about different species of wolves. Click on one of the images to gain the information on that species.");
                    borderpane.setBackground(background12);
                }
            }
        });

        VBox vbox = new VBox(button4, button5, button6, button7, button8,button9);

        //borderpane = new BorderPane();
        borderpane.setLeft(vbox);
        borderpane.setCenter(label);

        Scene scene = new Scene(borderpane, 300, 300);
        primarystage.setTitle("Wolves, A Diverse Species");
        return scene;
    }

















    /*public Scene EvaniaWindow(Stage primaryStage) {
        Image Elk = new Image("Elk_Project_CP2.jpg", 200, 200, true, true);
        ImageView ElkView = new ImageView(Elk);
        Image Wolf = new Image("Wolf_Project_CP2.jpg",200, 200, true, true);
        ImageView WolfView = new ImageView(Wolf);
        Image Gyrfalcon = new Image("Gyrfalcon_Project_CP2.jpg",200, 200, false, true);
        ImageView GyrfalconView = new ImageView(Gyrfalcon);
        Button button1 = new Button("Elk", ElkView);
        button1.resize(250,200);
        button1.setContentDisplay(ContentDisplay.TOP);
        //String ElkText = "Info about elks, a majestic creature";

        Button button2 = new Button("Wolf", WolfView);
        button2.resize(250,200);
        button2.setContentDisplay(ContentDisplay.TOP);
        //String WolfText = "Wolf info, some of the most beautiful and talented creatures.";

        Button button3 = new Button("Gyrfalcon", GyrfalconView);
        button3.setContentDisplay(ContentDisplay.TOP);
        button3.resize(250,200);
        //String GyrfalconText = "Gyrfalcon info, they are like falcons but white and live in the tundra";

        Label label = new Label("Click on an image");


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

        //Button maxbutton  = new Button("Max's Screen");
        //maxbutton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            //@Override
           // public void handle(MouseEvent event) {
               // primaryStage.setScene(scene2);
            //}
       // });



        VBox vbox = new VBox(button1, button2, button3);


        BorderPane borderpane = new BorderPane();
        borderpane.setLeft(vbox);
        borderpane.setCenter(label);
        //borderpane.setBottom(maxbutton);



        Scene scene = new Scene(borderpane, 300, 300);
        primarystage.setTitle("Wolves, A Diverse Species");
        return scene;

    }
*/
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
        //primaryStage.setTitle("Four Choices");
        primaryStage.setScene(scene1);

        primaryStage.show();
        return scene1;
    }


    public static void main(String[] args) {

        launch(args);
    }
}
