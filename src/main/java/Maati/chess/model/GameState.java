package Maati.chess.model;

/**
 * Class GameState this class is used to retain the current state of a Game,
 * PLAY : the game is still runing, CHECK : one of the king is currently in a
 * possible movees of the enemy piece, CHECK_MATE : is when a king has no valid
 * move to do, STALE_MATE : when the player whose turn it is to move is not in
 * check but has no legal move.
 *
 * @author Maati Oussama
 */
public enum GameState {
    PLAY, CHECK, CHECK_MATE, STALE_MATE;
}
