//program:  Textfields
//developer: Carlene Dvorak
//date:  4/24/2019
//purpose: use of textfields that do not accept numbers in certain fields.
//set up of GUI for order input info
package textfields;

import java.util.HashSet;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
/**
 *
 * @author Carlene Dvorak
 */

public class TextFields extends Application{
    @Override
     public void start(Stage primaryStage){
    
// create textField to get user input
    TextField nameTextfield = new TextField();
    TextField addTextfield = new TextField();
    TextField cityTextfield = new TextField();
    TextField phoneTextfield = new TextField();
    TextField emailTextfield = new TextField();
    TextField orderTextfield = new TextField();

    HBox hbox1 = new HBox(25);//5 for spacing
    hbox1.setAlignment(Pos.TOP_LEFT);
    hbox1.getChildren().addAll(new Label("  Name:  "), nameTextfield);

    HBox hbox4 = new HBox(20);//5 for spacing
    hbox4.setAlignment(Pos.TOP_LEFT);
    hbox4.getChildren().addAll(new Label("  Address:"), addTextfield);

    HBox hbox2 = new HBox(20);//5 for spacing
    hbox2.setAlignment(Pos.TOP_LEFT);
    hbox2.getChildren().addAll(new Label("  City:      "), cityTextfield);
    
     HBox hbox3 = new HBox(20);//5 for spacing
    hbox3.setAlignment(Pos.TOP_LEFT);
    hbox3.getChildren().addAll(new Label("  Email:    "), emailTextfield);
    
     HBox hbox6= new HBox(20);//5 for spacing
    hbox6.setAlignment(Pos.TOP_LEFT);
    hbox6.getChildren().addAll(new Label("  Phone:   "), phoneTextfield);
    
    HBox hbox7 = new HBox(20);
    hbox7.setAlignment(Pos.CENTER_RIGHT);
    hbox7.getChildren().addAll(orderTextfield);

    VBox hbox5 = new VBox(15);
    hbox5.setAlignment(Pos.CENTER_LEFT);
    hbox5.getChildren().addAll(hbox1,hbox4,hbox2,hbox3,hbox6,hbox7);
    
      //to block a user from entering a number in the name textbox
       Pattern pattern = Pattern.compile("[a-zA-Z]*");
UnaryOperator<TextFormatter.Change> filter = c -> {
    if (pattern.matcher(c.getControlNewText()).matches()) {
        return c ;
    } else {
        return null ;
    }
};
TextFormatter<String> formatter = new TextFormatter<>(filter);
nameTextfield.setTextFormatter(formatter);


 //to block a user from entering a number in the city textbox
       Pattern patterns = Pattern.compile("[a-zA-Z]*");
UnaryOperator<TextFormatter.Change> filters = c -> {
    if (pattern.matcher(c.getControlNewText()).matches()) {
        return c ;
    } else {
        return null ;
    }
};
TextFormatter<String> formatt = new TextFormatter<>(filter);
cityTextfield.setTextFormatter(formatt);

    Scene scene = new Scene(hbox5, 600,350);
    primaryStage.setTitle("Text Fields PlaceOrder");
    primaryStage.setScene(scene);
    primaryStage.show();
    
     }//end of start primary stage
    public static void main(String[] args) {
    launch(args);    
        }//end of main
  

    
}//end of class
