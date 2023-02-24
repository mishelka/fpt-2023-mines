package minesweeper;

import minesweeper.consoleui.ConsoleUI;
import minesweeper.core.Field;
import sk.tuke.gamestudio.service.ScoreService;
import sk.tuke.gamestudio.service.ScoreServiceJDBC;

/**
 * Main application class.
 */
public class Minesweeper {
    /** User interface. */
    private ConsoleUI userInterface;

    private ScoreService scoreService = new ScoreServiceJDBC();
 
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
