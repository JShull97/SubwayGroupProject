
//Program:  Group Project - Subway Sandwich
//Developer: Carlene Dvorak
//Date:  4/12/2019
//Purpose:  An application of automated ordering system for Subway

package groupprojectsubway;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Carlene Dvorak
 */
public class GroupProjectSubway extends Application{
    
    @Override
    public void start(Stage primaryStage) {
    
        HBox buttons = new HBox();
        Button placeOrder = new Button();
        placeOrder.setText("Place order:");
        buttons.getChildren().add(placeOrder);
        buttons.setAlignment(Pos.CENTER);
        
        Button bread = new Button();
        bread.setText("italian");
//        bread.getChildren().add(bread);

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20));
        root.setBottom(buttons);
        root.setLeft(bread);

        Scene scene = new Scene(root, 600, 250);

        primaryStage.setTitle("Subway Order System");
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }//end of start

    public static void main(String[] args) {
        launch(args);
    }

}