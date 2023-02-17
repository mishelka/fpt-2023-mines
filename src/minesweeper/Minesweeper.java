package minesweeper;

import minesweeper.consoleui.ConsoleUI;
import minesweeper.core.Field;

/**
 * Main application class.
 */
public class Minesweeper {
    /** User interface. */
    private ConsoleUI userInterface;
 
    /**
     * Constructor.
     */
    private Minesweeper() {
        userInterface = new ConsoleUI();
        
        Field field = new Field(10, 110, 10);
        userInterface.newGameStarted(field);
    }

    /**
     * Main method.
     * @param args arguments
     */
    public static void main(String[] args) {
        new Minesweeper();
    }
}
