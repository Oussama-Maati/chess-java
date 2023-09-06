package Maati.chess;

import Maati.chess.model.Game;
import Maati.chess.model.Model;
import Maati.chess.view.TextView;
import Maati.chess.controller.Controller;

/**
 * Main Class for the chess game where I run everything
 *
 * @author Maati Oussama
 */
public class MainClassChess {

    public static void main(String[] args) {

        Model game = new Game();
        Controller controller = new Controller(game, new TextView(game));
        controller.play();

    }

}
