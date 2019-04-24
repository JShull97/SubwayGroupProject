//  Program:  Group Project - Subway Sandwich
//  Developer: Carlene Dvorak, Justin Shull, Koleman Parsley
//  Date:  4/12/2019
//  Purpose:  An application of automated ordering system for Subway
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
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
    Stage window;
    @Override
    public void start(Stage primaryStage) {
      window = primaryStage;
        
      // Declare buttons
      Button nextBread = new Button("Next");
      Button nextMeat = new Button("Next");
      Button nextCheese = new Button("Next");
      Button nextVeg = new Button("Next");
      Button nextSauce = new Button("Next");
      Button placeOrder = new Button("Place order:");
        
        // Start sandwich size
        RadioButton sixInch = new RadioButton("Six Inch");
        RadioButton footLong = new RadioButton("Footlong");
        ToggleGroup tg = new ToggleGroup();
        sixInch.setToggleGroup(tg);
        footLong.setToggleGroup(tg);
        HBox sizeBox = new HBox(15);
        sizeBox.getChildren().addAll(new Label("Size:    "), sixInch, footLong);
        sizeBox.setId("size");
        sizeBox.setAlignment(Pos.CENTER);
        // end sandwich size

        HBox bread = new HBox(15);

        //start of bread type
        RadioButton italian = new RadioButton("Italian");
        RadioButton wholewht = new RadioButton("Whole Wheat");
        RadioButton Honey = new RadioButton("Honey Oat");
        RadioButton herb = new RadioButton("Italian Herb and Cheese");
        ToggleGroup tgBread = new ToggleGroup();
        italian.setToggleGroup(tgBread);
        wholewht.setToggleGroup(tgBread);
        herb.setToggleGroup(tgBread);
        Honey.setToggleGroup(tgBread);
        bread.getChildren().addAll(new Label("Bread:    "),italian, wholewht, Honey,herb);
        bread.setAlignment(Pos.CENTER);
        bread.setPadding(new Insets (10, 50, 20,20));
        
        HBox breadPic = new HBox();
        ImageView imgBread = new ImageView("images/bread.jpg");
        breadPic.getChildren().add(imgBread);
        breadPic.setAlignment(Pos.CENTER);
        VBox vBoxBread = new VBox(5);
        vBoxBread.getChildren().addAll(bread, nextBread);
        //end of bread type
        
        // start meat type
        RadioButton bfh = new RadioButton("Black Forest Ham");
        RadioButton ccc = new RadioButton("Cold Cut Combo");
        RadioButton bmt = new RadioButton("Italian BMT");
        RadioButton turk = new RadioButton("Turkey Breast");
        ToggleGroup tgMeat = new ToggleGroup();
        bfh.setToggleGroup(tgMeat);
        ccc.setToggleGroup(tgMeat);
        bmt.setToggleGroup(tgMeat);
        turk.setToggleGroup(tgMeat);
        
        HBox meatPic = new HBox();
        ImageView imgMeat = new ImageView("images/meats.jpg");
        meatPic.getChildren().add(imgMeat);
        meatPic.setAlignment(Pos.CENTER);
        HBox meatBox = new HBox(15);
        meatBox.getChildren().addAll(new Label("Meats:    "), bfh, ccc, bmt, turk);
        VBox vBoxMeat = new VBox(5);
        vBoxMeat.getChildren().addAll(meatBox, nextMeat);
        // end meat type
        
        
        // start cheese
        HBox cheesePic = new HBox();
        ImageView imgCheese = new ImageView("images/cheese.jpg");
        cheesePic.getChildren().add(imgCheese);
        cheesePic.setAlignment(Pos.CENTER);
        HBox cheeseBox = new HBox(15);
        VBox vBoxCheese = new VBox(5);
        vBoxCheese.getChildren().addAll(cheeseBox, nextCheese);
        
        RadioButton amer = new RadioButton("American");
        RadioButton mc = new RadioButton("Monterey Cheddar");
        RadioButton sm = new RadioButton("Shredded Mozzerella");
        RadioButton pj = new RadioButton("Pepper Jack");
        ToggleGroup tgCheese = new ToggleGroup();
        amer.setToggleGroup(tgCheese);
        mc.setToggleGroup(tgCheese);
        sm.setToggleGroup(tgCheese);
        pj.setToggleGroup(tgCheese);
        cheeseBox.getChildren().addAll(new Label("Cheese:    "), amer, mc, sm,pj);
        // end cheese
        
        // start veggies
        HBox veggiePic = new HBox();
        ImageView imgVeg = new ImageView("images/vegies2.jpg");
        veggiePic.getChildren().add(imgVeg);
        veggiePic.setAlignment(Pos.CENTER);
        HBox veggieBox = new HBox(15);
        VBox vBoxveg = new VBox(5);
        vBoxveg.getChildren().addAll(veggieBox, nextVeg);
                
        RadioButton tom = new RadioButton("Tomatoe");
        RadioButton lettus = new RadioButton("Lettus");
        RadioButton pickle = new RadioButton("Pickles");
        ToggleGroup tgVeg = new ToggleGroup();
        tom.setToggleGroup(tgVeg);
        lettus.setToggleGroup(tgVeg);
        pickle.setToggleGroup(tgVeg);
        veggieBox.getChildren().addAll(new Label("Veggies:    "), tom, lettus, pickle);
        // end veggies
        
        // start sauce
        HBox saucePic = new HBox();
        ImageView imgSauce = new ImageView("images/sauces2.jpg");
        saucePic.getChildren().add(imgSauce);
        saucePic.setAlignment(Pos.CENTER);
        HBox sauceBox = new HBox(15);
        VBox vBoxSauce = new VBox(5);
        vBoxSauce.getChildren().addAll(sauceBox, nextSauce);
                
        RadioButton mayo = new RadioButton("Mayonnaise");
        RadioButton must = new RadioButton("Mustard");
        RadioButton ranch = new RadioButton("Ranch");
        ToggleGroup tgSauce = new ToggleGroup();
        mayo.setToggleGroup(tgSauce);
        must.setToggleGroup(tgSauce);
        ranch.setToggleGroup(tgSauce);
        sauceBox.getChildren().addAll(new Label("Sauces:    "), mayo, must, ranch);
        // end sauce
        
        // start salt and pepper
        HBox spPic = new HBox();
        ImageView imgSP = new ImageView("images/saltandpepper.jpg");
        spPic.getChildren().add(imgSP);
        spPic.setAlignment(Pos.CENTER);
        HBox spBox = new HBox(15);
        VBox vBoxSP = new VBox(5);
        vBoxSP.getChildren().addAll(spBox, placeOrder);
                
        RadioButton y = new RadioButton("Yes");
        RadioButton n = new RadioButton("No");
        ToggleGroup tgSP = new ToggleGroup();
        y.setToggleGroup(tgSP);
        n.setToggleGroup(tgSP);
        spBox.getChildren().addAll(new Label("Salt and Pepper?    "), y, n);
        // end salt and pepper
        
        
        // panes
        BorderPane breadPane = new BorderPane();
        breadPane.setPadding(new Insets(20));
        breadPane.setBottom(vBoxBread);
        breadPane.setCenter(breadPic);
        breadPane.setTop(sizeBox);
   
        BorderPane meatPane = new BorderPane();
        meatPane.setPadding(new Insets(20));
        meatPane.setBottom(vBoxMeat);
        meatPane.setCenter(meatPic);
        meatPane.setTop(meatBox);
        
        BorderPane cheesePane = new BorderPane();
        cheesePane.setPadding(new Insets(20));
        cheesePane.setBottom(vBoxCheese);
        cheesePane.setCenter(cheesePic);
        cheesePane.setTop(cheeseBox);
        
        BorderPane VegPane = new BorderPane();
        VegPane.setPadding(new Insets(20));
        VegPane.setBottom(vBoxveg);
        VegPane.setCenter(veggiePic);
        VegPane.setTop(veggieBox);
        
        BorderPane saucePane = new BorderPane();
        saucePane.setPadding(new Insets(20));
        saucePane.setBottom(vBoxSauce);
        saucePane.setCenter(saucePic);
        saucePane.setTop(sauceBox);
        
        BorderPane spPane = new BorderPane();
        spPane.setPadding(new Insets(20));
        spPane.setBottom(vBoxSP);
        spPane.setCenter(spPic);
        spPane.setTop(spBox);

        
        // create all scenes
        Scene breadScene = new Scene(breadPane, 600, 350);
        Scene meatScene = new Scene(meatPane, 600, 350);
        Scene cheeseScene = new Scene(cheesePane, 600, 350);
        Scene VegScene = new Scene(VegPane, 600, 350);
        Scene sauceScene = new Scene(saucePane, 600, 350);
        Scene spScene = new Scene(spPane, 600, 350);


        // event listeners
        nextBread.setOnAction(e -> window.setScene(meatScene));
        nextMeat.setOnAction(e -> window.setScene(cheeseScene));
        nextCheese.setOnAction(e -> window.setScene(VegScene));
        nextVeg.setOnAction(e -> window.setScene(sauceScene));
        nextSauce.setOnAction(e -> window.setScene(spScene));


        // display order event listener
        placeOrder.setOnAction(e -> displayOrder());
        
        primaryStage.setTitle("Subway Order System");
//        scene.getStylesheets().add(this.getClass().getResource("/css/style.css").toExternalForm());
        primaryStage.setScene(breadScene);
        primaryStage.show();

    } // end of start

    public static void main(String[] args) {
        launch(args);
    }

    public void displayOrder() {
        // TODO
    }

}
