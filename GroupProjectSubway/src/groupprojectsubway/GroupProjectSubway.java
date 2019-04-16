
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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
        
        // Start sandwich size
        RadioButton sixInch = new RadioButton("Six Inch");
        RadioButton footLong = new RadioButton("Footlong");
        ToggleGroup tg = new ToggleGroup();
        sixInch.setToggleGroup(tg);
        footLong.setToggleGroup(tg);
        VBox sizeBox = new VBox(5);
        sizeBox.getChildren().addAll(new Label("What size sandwich do you want?"), sixInch, footLong);
        // end sandwich size
        
        Button bread = new Button();
        bread.setText("italian");
        //bread.getChildren().add(bread);

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20));
        root.setBottom(buttons);
        root.setLeft(bread);
        root.setTop(sizeBox);

        // display order event listener
        placeOrder.setOnAction(e -> displayOrder());
        
        Scene scene = new Scene(root, 600, 250);

        primaryStage.setTitle("Subway Order System");
        scene.getStylesheets().add(this.getClass().getResource("/css/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }//end of start

    public static void main(String[] args) {
        launch(args);
    }
    
    public void displayOrder() {
        // TODO
    }

}