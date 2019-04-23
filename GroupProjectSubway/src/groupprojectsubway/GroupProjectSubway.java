
//Program:  Group Project - Subway Sandwich
//Developer: Carlene Dvorak, Justin Shull, Koleman Parsley
//Date:  4/12/2019
//Purpose:  An application of automated ordering system for Subway

package groupprojectsubway;

import java.util.HashSet;
import java.util.Set;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
        HBox sizeBox = new HBox(15);
        sizeBox.getChildren().addAll(new Label("Size:    "), sixInch, footLong);
        sizeBox.setAlignment(Pos.CENTER);
        // end sandwich size
        
        HBox bread = new HBox(15);
        
        //start of bread type
        RadioButton italian = new RadioButton("Italian");
        RadioButton wholewht = new RadioButton("Whole Wheat");
        RadioButton Honey = new RadioButton("Honey Oat");
        RadioButton herb = new RadioButton("Italian Herb and Cheese");
        ToggleGroup tg1 = new ToggleGroup();
        italian.setToggleGroup(tg1);
        wholewht.setToggleGroup(tg1);
        herb.setToggleGroup(tg1);
        Honey.setToggleGroup(tg1);
        bread.getChildren().addAll(new Label("Bread:    "),italian,wholewht,Honey,herb);
        bread.setAlignment(Pos.CENTER);
        bread.setPadding(new Insets (10, 50, 20,20));
        
        HBox pic = new HBox();
        ImageView imgBread = new ImageView("bread.jpg");//create a new image
        pic.getChildren().add(imgBread);
        pic.setAlignment(Pos.CENTER);
        
        //end of bread type
        
        //tabs
        TabPane tabPane = new TabPane();

        Tab tab1 = new Tab("Bread");
        Tab tab2 = new Tab("Cheese");
        Tab tab3 = new Tab("Meat");
        Tab tab4 = new Tab("Veggies");
        tabPane.getTabs().addAll(tab1,tab2,tab3,tab4);
   
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20));
        root.setBottom(buttons);
        root.setCenter(pic);
        root.setBottom(bread);
        root.setTop(sizeBox);

        // display order event listener
        placeOrder.setOnAction(e -> displayOrder());
        
        Scene scene = new Scene(root, 600, 350);

        primaryStage.setTitle("Subway Order System");
//        scene.getStylesheets().add(this.getClass().getResource("/css/style.css").toExternalForm());
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
