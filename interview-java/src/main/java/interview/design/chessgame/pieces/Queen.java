package interview.design.chessgame.pieces;

import interview.design.chessgame.Move;
import interview.design.chessgame.Piece;
import interview.design.chessgame.Spot;

public class Queen extends Piece {
  public Queen() {
    type = Type.Queen;
  }

  @Override
  public boolean isMoveValid(Move move, Spot[][] board) {
    return false;
  }
}
