package minesweeper.consoleui;

import minesweeper.core.Field;

public interface UserInterface {
    void newGameStarted(Field field);

    void update();

    /**
     * Processes user input.
     * Reads line from console and does the action on a playing field according to input string.
     */
    default void processInput() {
        throw new UnsupportedOperationException("Method processInput not yet implemented");
    }
}
