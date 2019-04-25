//  Program:  Group Project - Subway Sandwich
//  Developer: Carlene Dvorak, Justin Shull, Koleman Parsley
//  Date:  4/12/2019
//  Purpose:  An application of automated ordering system for Subway

import javafx.application.Application;
import javafx.event.ActionEvent;
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
public class GroupProjectSubway extends Application {

    Stage window;
    // have radio buttons class fields so they can be refereced for displayOrder()
    RadioButton sixInch = new RadioButton("Six Inch");
    RadioButton footLong = new RadioButton("Footlong");
    RadioButton italian = new RadioButton("Italian");
    RadioButton wholewht = new RadioButton("Whole Wheat");
    RadioButton Honey = new RadioButton("Honey Oat");
    RadioButton herb = new RadioButton("Italian Herb and Cheese");
    RadioButton bfh = new RadioButton("Black Forest Ham");
    RadioButton ccc = new RadioButton("Cold Cut Combo");
    RadioButton bmt = new RadioButton("Italian BMT");
    RadioButton turk = new RadioButton("Turkey Breast");
    RadioButton amer = new RadioButton("American");
    RadioButton mc = new RadioButton("Monterey Cheddar");
    RadioButton sm = new RadioButton("Shredded Mozzerella");
    RadioButton pj = new RadioButton("Pepper Jack");
    RadioButton tom = new RadioButton("Tomatoe");
    RadioButton lettuce = new RadioButton("Lettuce");
    RadioButton pickle = new RadioButton("Pickles");
    RadioButton mayo = new RadioButton("Mayonnaise");
    RadioButton must = new RadioButton("Mustard");
    RadioButton ranch = new RadioButton("Ranch");
    RadioButton y = new RadioButton("Yes");
    RadioButton n = new RadioButton("No");
    

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
        ToggleGroup tg = new ToggleGroup();
        sixInch.setToggleGroup(tg);
        footLong.setToggleGroup(tg);
        HBox sizeBox = new HBox(15);
        sizeBox.getChildren().addAll(new Label("Size:    "), sixInch, footLong);
        sizeBox.setId("size");
        sizeBox.setAlignment(Pos.CENTER);
        // end sandwich size

        //start of bread type
        HBox bread = new HBox(15);
        ToggleGroup tgBread = new ToggleGroup();
        italian.setToggleGroup(tgBread);
        wholewht.setToggleGroup(tgBread);
        herb.setToggleGroup(tgBread);
        Honey.setToggleGroup(tgBread);
        bread.getChildren().addAll(new Label("Bread:    "), italian, wholewht, Honey, herb);
        bread.setAlignment(Pos.CENTER);
        bread.setPadding(new Insets(10, 50, 20, 20));

        HBox breadPic = new HBox();
        ImageView imgBread = new ImageView("Image/bread.jpg");
        breadPic.getChildren().add(imgBread);
        breadPic.setAlignment(Pos.CENTER);
        VBox vBoxBread = new VBox(5);
        vBoxBread.getChildren().addAll(bread, nextBread);
        //end of bread type

        // start meat type   
        ToggleGroup tgMeat = new ToggleGroup();
        bfh.setToggleGroup(tgMeat);
        ccc.setToggleGroup(tgMeat);
        bmt.setToggleGroup(tgMeat);
        turk.setToggleGroup(tgMeat);

        HBox meatPic = new HBox();
        ImageView imgMeat = new ImageView("Image/meats.jpg");
        meatPic.getChildren().add(imgMeat);
        meatPic.setAlignment(Pos.CENTER);
        HBox meatBox = new HBox(15);
        meatBox.getChildren().addAll(new Label("Meats:    "), bfh, ccc, bmt, turk);
        VBox vBoxMeat = new VBox(5);
        vBoxMeat.getChildren().addAll(meatBox, nextMeat);
        // end meat type      

        // start cheese
        HBox cheesePic = new HBox();
        ImageView imgCheese = new ImageView("Image/cheese.jpg");
        cheesePic.getChildren().add(imgCheese);
        cheesePic.setAlignment(Pos.CENTER);
        HBox cheeseBox = new HBox(15);
        VBox vBoxCheese = new VBox(5);
        vBoxCheese.getChildren().addAll(cheeseBox, nextCheese);

        ToggleGroup tgCheese = new ToggleGroup();
        amer.setToggleGroup(tgCheese);
        mc.setToggleGroup(tgCheese);
        sm.setToggleGroup(tgCheese);
        pj.setToggleGroup(tgCheese);
        cheeseBox.getChildren().addAll(new Label("Cheese:    "), amer, mc, sm, pj);
        // end cheese

        // start veggies
        HBox veggiePic = new HBox();
        ImageView imgVeg = new ImageView("Image/vegies2.jpg");
        veggiePic.getChildren().add(imgVeg);
        veggiePic.setAlignment(Pos.CENTER);
        HBox veggieBox = new HBox(15);
        VBox vBoxveg = new VBox(5);
        vBoxveg.getChildren().addAll(veggieBox, nextVeg);

        ToggleGroup tgVeg = new ToggleGroup();
        tom.setToggleGroup(tgVeg);
        lettuce.setToggleGroup(tgVeg);
        pickle.setToggleGroup(tgVeg);
        veggieBox.getChildren().addAll(new Label("Veggies:    "), tom, lettuce, pickle);
        // end veggies

        // start sauce
        HBox saucePic = new HBox();
        ImageView imgSauce = new ImageView("Image/sauces.jpg");
        saucePic.getChildren().add(imgSauce);
        saucePic.setAlignment(Pos.CENTER);
        HBox sauceBox = new HBox(15);
        VBox vBoxSauce = new VBox(5);
        vBoxSauce.getChildren().addAll(sauceBox, nextSauce);

        ToggleGroup tgSauce = new ToggleGroup();
        mayo.setToggleGroup(tgSauce);
        must.setToggleGroup(tgSauce);
        ranch.setToggleGroup(tgSauce);
        sauceBox.getChildren().addAll(new Label("Sauces:    "), mayo, must, ranch);
        // end sauce

        // start salt and pepper
        HBox spPic = new HBox();
        ImageView imgSP = new ImageView("Image/saltandpepper.jpg");
        spPic.getChildren().add(imgSP);
        spPic.setAlignment(Pos.CENTER);
        HBox spBox = new HBox(15);
        VBox vBoxSP = new VBox(5);
        vBoxSP.getChildren().addAll(spBox, placeOrder);

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
        breadScene.getStylesheets().add("Style.css");
        Scene meatScene = new Scene(meatPane, 600, 350);
        meatScene.getStylesheets().add("Style.css");
        Scene cheeseScene = new Scene(cheesePane, 600, 350);
        cheeseScene.getStylesheets().add("Style.css");
        Scene VegScene = new Scene(VegPane, 600, 350);
        VegScene.getStylesheets().add("Style.css");
        Scene sauceScene = new Scene(saucePane, 600, 350);
        sauceScene.getStylesheets().add("Style.css");
        Scene spScene = new Scene(spPane, 600, 350);
        spScene.getStylesheets().add("Style.css");

        // button event listeners
        nextBread.setOnAction(e ->{ 
            if (sixInch.isSelected() || footLong.isSelected()){
                if(italian.isSelected() || wholewht.isSelected() || Honey.isSelected() || herb.isSelected()){
                    window.setScene(meatScene);
                }
            }
        });
        nextMeat.setOnAction(e -> window.setScene(cheeseScene));
        nextCheese.setOnAction(e -> window.setScene(VegScene));
        nextVeg.setOnAction(e -> window.setScene(sauceScene));
        nextSauce.setOnAction(e -> window.setScene(spScene));

        // display order event listener
        placeOrder.setOnAction((ActionEvent e) -> {
            String order = displayOrder();

            BorderPane orderPane = new BorderPane();
            orderPane.setPadding(new Insets(20));
            orderPane.setCenter(new Label(order));

            Scene orderScene = new Scene(orderPane, 600, 350);
            orderScene.getStylesheets().add("Style.css");
            window.setScene(orderScene);
        });

        primaryStage.setTitle("Subway Order System");
        breadScene.getStylesheets().add("Style.css");
        primaryStage.setScene(breadScene);
        primaryStage.show();

    } // end of start

    public static void main(String[] args) {
        launch(args);
    }

    public String displayOrder() {
        String sizeChoice = getSize();
        String breadChoice = getBread();
        String meatChoice = getMeat();
        String cheeseChoice = getCheese();
        String vegChoice = getVeg();
        String sauceChoice = getSauce();
        String spChoice = getSP();
        return "Sandwich Size: " + sizeChoice
                + "\nBread: " + breadChoice
                + "\nMeat: " + meatChoice
                + "\nCheese: " + cheeseChoice
                + "\nVegetable: " + vegChoice
                + "\nSauce: " + sauceChoice
                + "\nSalt and Pepper: " + spChoice;
    }

    public String getSize() {
        if (sixInch.isSelected()) {
            return "Six Inch";
        } else if (footLong.isSelected()) {
            return "Foot Long";
        } else {
            return "None";
        }
    }

    public String getBread() {
        if (italian.isSelected()) {
            return "Italian";
        } else if (wholewht.isSelected()) {
            return "Whole Wheat";
        } else if (Honey.isSelected()) {
            return "Honey Oat";
        } else if (herb.isSelected()) {
            return "Italian Herb & Cheese";
        } else {
            return "None";
        }
    }

    public String getMeat() {
        if (bfh.isSelected()) {
            return "Black Forest Ham";
        } else if (ccc.isSelected()) {
            return "Cold Cut Combo";
        } else if (bmt.isSelected()) {
            return "Italian BMT";
        } else if (turk.isSelected()) {
            return "Turkey Breast";
        } else {
            return "None";
        }
    }

    public String getCheese() {
        if (amer.isSelected()) {
            return "American";
        } else if (mc.isSelected()) {
            return "Monterey Cheddar";
        } else if (sm.isSelected()) {
            return "Shredded Mozzerella";
        } else if (pj.isSelected()) {
            return "Pepper Jack";
        } else {
            return "None";
        }
    }

    public String getVeg() {
        if (tom.isSelected()) {
            return "Tomatoes";
        } else if (lettuce.isSelected()) {
            return "Lettuce";
        } else if (pickle.isSelected()) {
            return "Pickles";
        } else {
            return "None";
        }
    }

    public String getSauce() {
        if (mayo.isSelected()) {
            return "Mayonnaise";
        } else if (must.isSelected()) {
            return "Mustard";
        } else if (ranch.isSelected()) {
            return "Ranch";
        } else {
            return "None";
        }
    }

    public String getSP() {
        if (y.isSelected()) {
            return "Yes";
        } else if (n.isSelected()) {
            return "No";
        } else {
            return "None";
        }
    }

}
