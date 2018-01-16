package design.chessgame.pieces;

import design.chessgame.Move;
import design.chessgame.Piece;
import design.chessgame.Spot;

public class Knight extends Piece {
  public Knight() {
    type = Type.Knight;
  }

  @Override
  public boolean isMoveValid(Move move, Spot[][] board) {
    return false;
  }
}
