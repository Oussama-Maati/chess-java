package Maati.chess.controller;

import Maati.chess.model.Game;
import Maati.chess.model.GameState;
import Maati.chess.model.Model;
import Maati.chess.model.Move;
import Maati.chess.view.TextView;
import Maati.chess.view.View;
import java.util.List;

/**
 *
 * @author Maati Oussama
 */
public class RandomPlayController {
    
    private Model model;
    private View view;
    public int move = 0;
    
    public RandomPlayController(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    
    public void play() {
        boolean gameOver = false;
        view.displayTitle();
        model.start();
        while (/*move < 100 &&*/ !gameOver) {
            
            view.displayBoard();
            view.displayPlayer();
            List<Move> allMoves = model.getAllValidMoves();
            int random = 0 + (int) (Math.random() * (allMoves.size() - 0) + 1) - 1;
            
            Move randomMove = allMoves.get(random);
            
            model.movePiecePosition(randomMove.getOrigin(), randomMove.getTarget());
            this.move++;
            gameOver = gameOver();
            view.displayCheck();
        }


        view.displayWinner();
    }
    
    private boolean gameOver() {
        return (model.getAllValidMoves().isEmpty() || model.getState() == GameState.CHECK_MATE
                || model.getState() == GameState.STALE_MATE);
    }
    
    public static void main(String[] args) {
        
        Model game = new Game();
        RandomPlayController controller
                = new RandomPlayController(game, new TextView(game));
        controller.play();
    }
}
