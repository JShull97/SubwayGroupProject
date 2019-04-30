
//  Program:  Group Project - Subway Sandwich
//  Developer: Carlene Dvorak, Justin Shull, Koleman Parsley
//  Date:  4/12/2019
//  Purpose:  An application of automated ordering system for Subway

// Imports
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

//package groupprojectsubway;
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
        Button startBt = new Button("Start Order");
        Button nextBread = new Button("Next");
        Button nextMeat = new Button("Next");
        Button nextCheese = new Button("Next");
        Button nextVeg = new Button("Next");
        Button nextSauce = new Button("Next");
        Button placeOrder = new Button("Place order:");
        
        // Back Buttons
        Button backBread = new Button("Back");
        Button backMeat = new Button("Back");
        Button backCheese = new Button("Back");
        Button backVeg = new Button("Back");
        Button backSauce = new Button("Back");
        Button backSP = new Button("Back");

        // Start sandwich size       
        ToggleGroup tg = new ToggleGroup();
        sixInch.setToggleGroup(tg);
        footLong.setToggleGroup(tg);
        HBox sizeBox = new HBox(15);
        sizeBox.getChildren().addAll(new Label("Size:    "), sixInch, footLong);
        sizeBox.setId("size");
        sizeBox.setAlignment(Pos.CENTER);
        // end sandwich size

        // Start main screen
        HBox start = new HBox(15);
        ToggleGroup tgStart = new ToggleGroup();

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

        // Subway Logo
        HBox subwayPic = new HBox();
        ImageView subwayLogo = new ImageView("Image/Subway.png");
        subwayLogo.setFitHeight(72);
        subwayLogo.setFitWidth(250);
        subwayPic.getChildren().add(subwayLogo);
        subwayPic.setAlignment(Pos.CENTER);
        VBox vBoxMain = new VBox(5);
        vBoxMain.getChildren().addAll(startBt);

        HBox breadPic = new HBox();
        ImageView imgBread = new ImageView("Image/bread.jpg");
        breadPic.getChildren().add(imgBread);
        breadPic.setAlignment(Pos.CENTER);
        VBox vBoxBread = new VBox(5);
        HBox breadBut = new HBox(15);
        breadBut.getChildren().addAll(backBread, nextBread);
        vBoxBread.getChildren().addAll(bread, breadBut);
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
        HBox meatBut = new HBox(15);
        meatBut.getChildren().addAll(backMeat, nextMeat);
        vBoxMeat.getChildren().addAll(meatBox, meatBut);
        // end meat type      

        // start cheese
        HBox cheesePic = new HBox();
        ImageView imgCheese = new ImageView("Image/cheese.jpg");
        cheesePic.getChildren().add(imgCheese);
        cheesePic.setAlignment(Pos.CENTER);
        HBox cheeseBox = new HBox(15);
        VBox vBoxCheese = new VBox(5);
        HBox cheeseBut = new HBox(15);
        cheeseBut.getChildren().addAll(backCheese, nextCheese);
        vBoxCheese.getChildren().addAll(cheeseBox, cheeseBut);

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
        VBox vBoxVeg = new VBox(5);
        HBox veggieBut = new HBox(15);
        veggieBut.getChildren().addAll(backVeg, nextVeg);
        vBoxVeg.getChildren().addAll(veggieBox, veggieBut);

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
        HBox sauceBut = new HBox(15);
        sauceBut.getChildren().addAll(backSauce, nextSauce);
        vBoxSauce.getChildren().addAll(sauceBox, sauceBut);

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
        HBox spBut = new HBox(15);
        spBut.getChildren().addAll(backSP, placeOrder);
        vBoxSP.getChildren().addAll(spBut);

        ToggleGroup tgSP = new ToggleGroup();
        y.setToggleGroup(tgSP);
        n.setToggleGroup(tgSP);
        spBox.getChildren().addAll(new Label("Salt and Pepper?    "), y, n);
        // end salt and pepper

        // panes
        BorderPane main = new BorderPane();
        main.setPadding(new Insets(20));
        main.setCenter(subwayPic);
        main.setBottom(vBoxMain);

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
        VegPane.setBottom(vBoxVeg);
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
        // Applies stylesheets to each scene
        Scene mainScene = new Scene(main, 750, 450);
        mainScene.getStylesheets().add("style.css");
        Scene breadScene = new Scene(breadPane, 750, 450);
        breadScene.getStylesheets().add("style.css");
        Scene meatScene = new Scene(meatPane, 750, 450);
        meatScene.getStylesheets().add("style.css");
        Scene cheeseScene = new Scene(cheesePane, 750, 450);
        cheeseScene.getStylesheets().add("style.css");
        Scene VegScene = new Scene(VegPane, 750, 450);
        VegScene.getStylesheets().add("style.css");
        Scene sauceScene = new Scene(saucePane, 750, 450);
        sauceScene.getStylesheets().add("style.css");
        Scene spScene = new Scene(spPane, 750, 450);
        spScene.getStylesheets().add("style.css");

        // Next button event listeners
        startBt.setOnAction(e -> window.setScene(breadScene));
        
        // Makes sure bread and size is selected
        nextBread.setOnAction(e -> {
            if (sixInch.isSelected() || footLong.isSelected()) {
                if (italian.isSelected() || wholewht.isSelected() || Honey.isSelected() || herb.isSelected()) {
                    window.setScene(meatScene);
                }else {
                    Label err2 = new Label("Plese select \nBread type");
                    breadPane.setRight(err2);
                }
            }else {
                Label err = new Label("Please select \nsize of sandwich");
                breadPane.setRight(err);
            }
        });
        
        nextMeat.setOnAction(e -> window.setScene(cheeseScene));
        nextCheese.setOnAction(e -> window.setScene(VegScene));
        nextVeg.setOnAction(e -> window.setScene(sauceScene));
        nextSauce.setOnAction(e -> window.setScene(spScene));

        
        // back Button event Listener
        backBread.setOnAction(e -> window.setScene(mainScene));
        backMeat.setOnAction(e -> window.setScene(breadScene));
        backCheese.setOnAction(e -> window.setScene(meatScene));
        backVeg.setOnAction(e -> window.setScene(cheeseScene));
        backSauce.setOnAction(e -> window.setScene(VegScene));
        backSP.setOnAction(e -> window.setScene(sauceScene));
        
        // display order event listener
        placeOrder.setOnAction((ActionEvent e) -> {
            String order = displayOrder();

            BorderPane orderPane = new BorderPane();
            orderPane.setId("orderStuff");
            orderPane.setPadding(new Insets(20));
            orderPane.setCenter(new Label(order));

            Scene orderScene = new Scene(orderPane, 750, 450);
            orderScene.getStylesheets().add("style.css");
            window.setScene(orderScene);
        });

        primaryStage.setTitle("Subway Order System");
//        scene.getStylesheets().add(this.getClass().getResource("/css/style.css").toExternalForm());
        primaryStage.setScene(mainScene);
        primaryStage.show();

    } // end of start

    public static void main(String[] args) {
        launch(args);
    }

    public String displayOrder() {
        String msg = "Your Order Is";
        String sizeChoice = getSize();
        String breadChoice = getBread();
        String meatChoice = getMeat();
        String cheeseChoice = getCheese();
        String vegChoice = getVeg();
        String sauceChoice = getSauce();
        String spChoice = getSP();
        return    "Sandwich Size:       " + sizeChoice
                + "\nBread:                      " + breadChoice
                + "\nMeat:                       " + meatChoice
                + "\nCheese:                    " + cheeseChoice
                + "\nVegetable:               " + vegChoice
                + "\nSauce:                      " + sauceChoice
                + "\nSalt and Pepper:     " + spChoice;
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
