package interview.design.chessgame.pieces;

import interview.design.chessgame.Move;
import interview.design.chessgame.Piece;
import interview.design.chessgame.Spot;

public class Knight extends Piece {
  public Knight() {
    type = Type.Knight;
  }

  @Override
  public boolean isMoveValid(Move move, Spot[][] board) {
    return false;
  }
}
