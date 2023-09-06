package Maati.chess.view;

import Maati.chess.model.Color;
import Maati.chess.model.Model;
import Maati.chess.model.Position;
import Maati.chess.model.pieces.Bishop;
import Maati.chess.model.pieces.King;
import Maati.chess.model.pieces.Knight;
import Maati.chess.model.pieces.Pawn;
import Maati.chess.model.pieces.Piece;
import Maati.chess.model.pieces.Queen;
import Maati.chess.model.pieces.Rook;
import static Maati.chess.model.Board.*;
import static Maati.chess.model.GameState.*;
import java.util.Scanner;

/**
 * Class TexteView, this class implements the view class
 *
 * @author Maati Oussama
 */
public class TextView implements View {

    private Model model;

    public TextView(Model model) {
        this.model = model;
    }

    @Override
    public void displayTitle() {

        System.out.println("\t\t    |-----------------------------|");
        System.out.println("\t\t    |         WELCOME TO          |");
        System.out.println("\t\t    |       THE CHESS GAME        |");
        System.out.println("\t\t    |-----------------------------|");
        System.out.println("");

    }

    @Override
    public void displayBoard() {
        int cpt = 8;
        letterLine();
        line(8);
        for (int i = BOARD_SIZE - 1; i > -1; i--) {
            System.out.print(cpt + " |");
            for (int j = 0; j < BOARD_SIZE; j++) {
                spaceOrPiece(i, j);
            }
            System.out.print(" " + cpt--);
            System.out.println("");
            line(8);

        }
        letterLine();
    }

    /**
     * Print the line of letter aligned with column
     */
    private void letterLine() {
        System.out.print("       ");
        for (char letter = 'A'; letter < 'I'; letter++) {
            System.out.print(letter + "        ");
        }
        System.out.println("");
    }

    /**
     * Method to print a line that separate the row of the board
     *
     * @param lenght the length of the line to print
     */
    private void line(int lenght) {
        String line = "  ";
        for (int i = 0; i < lenght; i++) {
            line = line + "---------";
        }
        System.out.println(line);
    }

    /**
     * Private method to print a space in the given position by rows and column
     * if there is no piece, otherwise the piece will be printed if black
     * B/*piece* and if white W/*piece*
     *
     * @param row the row of the position of the piece to print
     * @param column the column of the position of the piece to print
     */
    private void spaceOrPiece(Integer row, Integer column) {

        if (model.getPiece(new Position(row, column)) == null) {
            System.out.print("        |");

        } else {
            Piece piece = model.getPiece(new Position(row, column));
            char color = charColor(piece);
            printThePiece(color, piece);
        }
    }

    /**
     * Method to print the piece depending of the piece given and color of this
     * own piece
     *
     * @param color the color of the piece to get the prefix
     * @param piece the piece to print a string
     */
    private void printThePiece(char color, Piece piece) {
        if (piece instanceof Rook) {
            System.out.print(color + "/ROOK  |");
        }
        if (piece instanceof Knight) {
            System.out.print(color + "/KNIGHT|");
        }
        if (piece instanceof Bishop) {
            System.out.print(color + "/BISHOP|");
        }
        if (piece instanceof Queen) {
            System.out.print(color + "/QUEEN |");
        }
        if (piece instanceof King) {
            System.out.print(color + "/KING  |");
        }
        if (piece instanceof Pawn) {
            System.out.print(color + "/PAWN  |");
        }
    }

    /**
     * Private Method to return a letter depending on the color of the piece
     * given in parameters, B for black and W for white
     *
     * @param piece the piece to get the color from
     * @return the letter of the color of the piece
     */
    private char charColor(Piece piece) {
        if (piece.getColor() == Color.BLACK) {
            return 'B';
        }
        return 'W';

    }

    @Override
    public void displayWinner() {
        if (model.getState() == STALE_MATE) {
            displayStaleMat();
        }
        displayMat();

    }

    @Override
    public void displayPlayer() {
        System.out.println("The current Player is the "
                + model.getCurrentPlayer().getColor()
                + ", you can move a piece ");
    }

    @Override
    public Position askPosition() {

        String pos = validPos();

        int row = Character.getNumericValue(pos.charAt(0));
        int column = (Character.toLowerCase(pos.charAt(1)) - 'a');

        Position asked = new Position(row - 1, column);

        return asked;

    }

    /**
     * Method to ask the user a position 1 number and one letter that will be
     * put into a string and test if the first char of the string is a numerci
     * value and the second one is a letter
     *
     * @return the string after all the condition are true
     */
    private String validPos() {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Write the number of the row and the letter of the"
                + " column in once then press Enter :");
        String pos = keyb.next();

        while (pos.length() != 2
                || !Character.isLetter(pos.charAt(1))
                || !Character.isDigit(pos.charAt(0))
                || Character.getNumericValue(pos.charAt(0)) < 1
                || Character.getNumericValue(pos.charAt(0)) > 8
                || Character.toLowerCase(pos.charAt(1)) - 'a' > 7) {
            this.displayError("You must enter a number between 1->8 and a"
                    + " letter between a->h in once : ");

            pos = keyb.next();
        }
        return pos;
    }

    @Override
    public void displayError(String message) {
        System.out.println(" ! AN ERROR OCCURED : ");
        System.out.println(message);

    }

    @Override
    public void displayCheck() {
        if (model.getState() == CHECK) {
            System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("THE " + model.getCurrentPlayer().getColor()
                    + " PLAYER IS IN CHECK");
            System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("Make a move to undo your state ");
        }

    }

    @Override
    public void displayMat() {
        System.out.println("|-----------------------------|");
        System.out.println("|          CHECK MAT !        |");
        System.out.println("|        THE WINNER IS        |");
        System.out.println("|       THE PLAYER WITH       |");
        System.out.println("|         " + model.getOppositePlayer().getColor()
                + " PIECE        |");
        System.out.println("|-----------------------------|");
    }

    @Override
    public void displayStaleMat() {
        System.out.println("|-----------------------------|");
        System.out.println("|          STALE MAT !        |");
        System.out.println("|      THERE IS NO WINNER     |");
        System.out.println("|-----------------------------|");
    }
}
