package main;

import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

public class KeyInput {

    public KeyInput(Scene scene) {
        scene.addEventHandler(KeyEvent.KEY_PRESSED, this::handleKeyPress);
        scene.addEventHandler(KeyEvent.KEY_RELEASED, this::handleKeyRelease);
    }

    private void handleKeyPress(KeyEvent event) {
        switch (event.getCode()) {
            case W:
                System.out.println("test");
                break;
            case A:

                break;
            case S:

                break;
            case D:

                break;
        }
    }

    private void handleKeyRelease(KeyEvent event) {
        switch (event.getCode()) {
            case W:

                break;
            case A:

                break;
            case S:

                break;
            case D:

                break;
        }
    }
}
