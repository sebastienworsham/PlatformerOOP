package main;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    protected static Stage stage;
    protected static String gameState;
    protected Scene scene;

    @Override
    public void start (Stage primaryStage) throws Exception {
        try {
            stage = primaryStage;
            gameState = "mainMenu";
            updateScene(gameState);
            stage.show();

            AnimationTimer timer = new AnimationTimer() {
                @Override
                public void handle(long now) {
                    new KeyInput(scene);
                }
            };
            timer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateScene (String gameState) {
        if(gameState.equals("mainMenu")) {
            GameScene mainMenu = new GameScene();
            scene = mainMenu.renderMainMenu();
        } else {
            GameScene level1 = new GameScene();
            scene = level1.renderLevel1();
        }
        stage.setScene(scene);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
