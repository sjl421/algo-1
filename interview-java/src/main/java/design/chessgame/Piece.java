package design.chessgame;

/**
 * Chess piece is one of the following:
 *  King, Queen, Knight, Bishop, Rook, Pawn
 */
public abstract class Piece {
  public enum Type {
    King,
    Queen,
    Knight,
    Bishop,
    Rook,
    Pawn
  }

  protected Type type;

  public abstract boolean isMoveValid(Move move, Spot[][] board);

  public Type getType() {
    return type;
  }
}
