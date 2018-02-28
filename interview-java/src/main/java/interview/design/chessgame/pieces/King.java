package interview.design.chessgame.pieces;

import interview.design.chessgame.Move;
import interview.design.chessgame.Piece;
import interview.design.chessgame.Spot;

public class King extends Piece {
  public King() {
    type = Type.King;
  }

  @Override
  public boolean isMoveValid(Move move, Spot[][] board) {
    return false;
  }
}
