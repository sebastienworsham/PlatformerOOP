package main;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import java.util.HashMap;

public class GameScene extends Main {
    public Scene renderMainMenu() {
        VBox vbox = new VBox();
        vbox.setPrefSize(480,360);
        vbox.setStyle("-fx-background-color: #000000;");
        Scene scene = new Scene(vbox);
        scene.getStylesheets().add("style.css");

        Text titleText = new Text("Platformer Game");
        Button newGame = new Button("New Game");
        Button loadGame = new Button("Load Game");
        newGame.setOnAction(e ->{
            gameState = "level1";
            updateScene(gameState);
        });

        vbox.getChildren().addAll(titleText, newGame, loadGame);
        return scene;
    }

    public Scene renderLevel1() {
        Pane gameRoot = new Pane();
        Scene scene = new Scene(gameRoot, 480, 360);


        Rectangle bg = new Rectangle(480, 360);
        bg.setFill(Color.RED);
        Rectangle player = new Rectangle(32, 32);
        player.setFill(Color.WHITE);
        gameRoot.getChildren().addAll(bg, player);

        return scene;
    }
}
