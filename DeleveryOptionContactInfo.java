//program:  Delivery Option
//developer: Carlene Dvorak
//date:  4/24/2019
//purpose: use of textfields that only permit letter and numbers in fields needed and outputs
//information with submit button or clears the screen
//set up of GUI for order input info
package textfields;

import java.util.function.UnaryOperator;
import java.util.regex.Pattern;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Carlene Dvorak
 */
public class TextFields extends Application {

    private static TextArea orderTextfield = new TextArea();
    static TextField nameTextfield = new TextField();
    static TextField addTextfield = new TextField();
    static TextField cityTextfield = new TextField();
    static TextField phoneTextfield = new TextField();
    static TextField emailTextfield = new TextField();

    @Override
    public void start(Stage primaryStage) {

// create textField to get user input
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

        HBox hbox6 = new HBox(20);//5 for spacing
        hbox6.setAlignment(Pos.TOP_LEFT);
        hbox6.getChildren().addAll(new Label("  Phone:   "), phoneTextfield);

        Button bt = new Button();
        bt.setText("submit");
//        bt.setAlignment(Pos.CENTER);

        Button clearBt = new Button("Clear");
//        clearBt.setAlignment(Pos.CENTER);

        //Action Event listener
        bt.setOnAction(e -> {
            displayInfo();

        });

        //clear button action Event
        clearBt.setOnAction(f -> {
            clearText();
        });

        VBox hbox5 = new VBox(15);
        hbox5.setAlignment(Pos.CENTER_LEFT);
        hbox5.getChildren().addAll(hbox1, hbox4, hbox2, hbox3, hbox6, bt, clearBt);
        hbox5.setPadding(new Insets(50, 50, 50, 50));

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(orderTextfield);
        scrollPane.setPrefWidth(300);
        scrollPane.setPrefHeight(500);

        VBox hbox7 = new VBox(20);
        hbox7.setAlignment(Pos.TOP_RIGHT);
        hbox7.getChildren().addAll(orderTextfield);
        hbox7.setPrefWidth(300);
        hbox7.setPrefHeight(500);

        VBox hbox8 = new VBox(15);
//        hbox8.setAlignment(Pos.CENTER_RIGHT);
        hbox8.getChildren().addAll(hbox7, scrollPane);

        HBox hbox9 = new HBox(15);
        hbox9.getChildren().addAll(hbox5, hbox8);

        //to block a user from entering a number in the name textbox
        Pattern pattern = Pattern.compile("[0-9]*");
        UnaryOperator<TextFormatter.Change> filter = c -> {
            if (pattern.matcher(c.getControlNewText()).matches()) {
                return c;
            } else {
                return null;
            }
        };
        TextFormatter<String> formatterphone = new TextFormatter<>(filter);
        phoneTextfield.setTextFormatter(formatterphone);

        //to block a user from entering a number in the city textbox
        Pattern patterns = Pattern.compile("[a-z]*");
        UnaryOperator<TextFormatter.Change> filters = c -> {
            if (patterns.matcher(c.getControlNewText()).matches()) {
                return c;
            } else {
                return null;
            }
        };
        TextFormatter<String> formattname = new TextFormatter<>(filters);
                TextFormatter<String> formattcity = new TextFormatter<>(filters);
        nameTextfield.setTextFormatter(formattname);
       cityTextfield.setTextFormatter(formattcity);
        

        
        Scene scene = new Scene(hbox9, 700, 350);
        primaryStage.setTitle("Text Fields PlaceOrder");
        primaryStage.setScene(scene);
        primaryStage.show();

    }//end of start primary stage

    public static void displayInfo() {

        // this creates a string that holds the value of the nametextfield Grab
        String name = nameTextfield.getText();
        String add = addTextfield.getText();
        String city = cityTextfield.getText();
        String phone = phoneTextfield.getText();
        String email = emailTextfield.getText();

        orderTextfield.setText("Your order: \n" + name + "\n" + add + "\n" + city + "\n" + phone + "\n" + email);

    }

    public static void clearText() {
        String clear = "";
        orderTextfield.setText(clear);
        nameTextfield.setText(clear);
        addTextfield.setText(clear);
        cityTextfield.setText(clear);
        phoneTextfield.setText(clear);
        emailTextfield.setText(clear);

    }

    public static void main(String[] args) {
        launch(args);
    }//end of main

}//end of class
