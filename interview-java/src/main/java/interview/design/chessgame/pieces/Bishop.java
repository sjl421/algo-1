package interview.design.chessgame.pieces;

import interview.design.chessgame.Move;
import interview.design.chessgame.Piece;
import interview.design.chessgame.Spot;

public class Bishop extends Piece {
  public Bishop() {
    type = Type.Bishop;
  }

  @Override
  public boolean isMoveValid(Move move, Spot[][] board) {
    return false;
  }
}
