package Maati.chess.view;

import Maati.chess.model.Position;

/**
 * Class view that will be implemented by the TextView Class
 *
 * @author Maati Oussama
 *
 */
public interface View {

    /**
     * Method void to just print a title
     */
    public void displayTitle();

    /**
     * Method void to print the board in a good way of display
     */
    public void displayBoard();

    /**
     * Method to print the end of the game it will either print the CheckMate
     * case or StaleMate
     */
    public void displayWinner();

    /**
     * Method to print the current player so we know who can move a piece
     */
    public void displayPlayer();

    /**
     * Method to ask a position the must enter one number for the row and one
     * letter for the column into one entry that is a String variable the number
     * must be between 1 and 8 and the letter a and h if all those condition are
     * not 'true' then the position will be asked till it is. The fist character
     * of the string is then put into an integer and the letter -'a' is also put
     * into a integer
     *
     * @return the position asked to the user after validation
     */
    public Position askPosition();

    /**
     * Method to print an error
     *
     * @param message the string message of the error to print
     */
    public void displayError(String message);

    /**
     * Display a message to the current player to warn them that they are in
     * check state
     */
    public void displayCheck();

    /**
     * Display a message to prevent the players that the current one lost and
     * the opposite move just moved a piece won the game
     */
    public void displayMat();

    /**
     * Display a message to prevent the players when the game is in this state
     * and that there is no winner
     */
    public void displayStaleMat();
}
