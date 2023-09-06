package Maati.chess.controller;

import Maati.chess.model.GameState;
import static Maati.chess.model.GameState.*;
import Maati.chess.model.Model;
import Maati.chess.model.Position;
import Maati.chess.view.View;
import java.util.ArrayList;
import java.util.List;

/**
 * Class Controller this is where everything is in charge of making the game
 * work all ive done previously will be used here, The controlleur have 2
 * attributs to make an instance 1 attribut model to make the game run and 1
 * attribut view to display everything we need to see
 *
 * @author Maati Oussama
 */
public class Controller {

    private Model model;
    private View view;

    /**
     * Constructor for the controller made with a view and a model
     *
     * @param model instance that will be the attribut
     * @param view the view instance that will be the attribut
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * MADE THE MOST ROBUST WAY POSSIBLE ***************************************
     * The play method is used to play the chess game till the stat is not
     * checkmate or stalemate, ask a start position that will be asked till its
     * a valid and possible position that have at least one valid move, then ask
     * the new pos that will be asked till it is a position that is a valid one
     * from the start pos then make the move, change the current player. ( if a
     * player is in check state and have at least one valid move it will be
     * displayed )
     */
    public void play() {

        view.displayTitle();
        model.start();
        GameState state = model.getState();
        while (state != CHECK_MATE && state != STALE_MATE) {

            view.displayBoard();
            view.displayCheck();
            view.displayPlayer();
            Position oldPos = view.askPosition();
            oldPos = possibleOldPos(oldPos);

            List<Position> possibleAndValidMove = getPossibleAndValid(oldPos);
            List<Object> listAndPos = validOldPos(possibleAndValidMove, oldPos);
            oldPos = (Position) listAndPos.get(0);
            possibleAndValidMove = (List<Position>) listAndPos.get(1);
            Position newPos = view.askPosition();
            newPos = validNewPos(possibleAndValidMove, newPos);

            model.movePiecePosition(oldPos, newPos);
            state = model.getState();
        }
        view.displayWinner();
    }

    /**
     * Method to ask a new pos till the new pos in contained in the list of
     * valid position of the start pos
     *
     * @param possibleAndValidMove the list of valid move of the start pos
     * @param newPos the pos to ask till contained in the list
     * @return the new pos when possible
     */
    private Position validNewPos(List<Position> possibleAndValidMove,
            Position newPos) {
        while (!possibleAndValidMove.contains(newPos)) {
            view.displayError("The destinaton is not valid or not possible,"
                    + " find another destination");
            newPos = view.askPosition();
        }
        return newPos;
    }

    /**
     * Method to get ask a start pos till it haves at least one valid move and
     * then return a list of two object, the first object is a position the old
     * pos valid and the second object is the list of valid moves of the oldPos
     *
     * @param possibleAndValidMove the list of valid moves of the old pos
     * @param oldPos the old pos valid
     * @return a list with these 2 parameters
     */
    private List<Object> validOldPos(List<Position> possibleAndValidMove,
            Position oldPos) {
        while (possibleAndValidMove.isEmpty()) {
            view.displayError("This piece have no possible or valid "
                    + "move find another piece");

            oldPos = view.askPosition();
            oldPos = possibleOldPos(oldPos);

            possibleAndValidMove = getPossibleAndValid(oldPos);
        }
        return List.of(oldPos, possibleAndValidMove);
    }

    /**
     * Robust method used for the first position asked so method will keep
     * asking till the position contains a piece and is owned by the current
     * player
     *
     * @param oldPos the position to ask till fulfil the condition
     * @return the oldPos valid
     */
    private Position possibleOldPos(Position oldPos) {
        while (model.getPiece(oldPos) == null
                || !model.isCurrentPlayerPosition(oldPos)) {
            view.displayError("You don't own this piece or "
                    + "this square is empty !");
            oldPos = view.askPosition();
        }
        return oldPos;
    }

    /**
     * This method is used to make a List of all the Valid and Possible
     * possition of a Piece from a given position, it will first get all the
     * possible move that piece then get all the non-valid move into another
     * list
     *
     * @param oldPos the pos to get the piece of it and all its valid and
     * possible moves
     * @return the list of valid and possible moves for the oldpos
     */
    private List<Position> getPossibleAndValid(Position oldPos) {
        List<Position> possAndVal = model.getPossibleMoves(oldPos);
        List<Position> notValidMove = new ArrayList<>();

        for (Position newPos : possAndVal) {
            if (!model.isValidMove(oldPos, newPos)) {
                notValidMove.add(newPos);
            }
        }
        possAndVal.removeAll(notValidMove);
        return possAndVal;
    }
}
