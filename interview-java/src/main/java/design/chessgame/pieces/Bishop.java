package design.chessgame.pieces;

import design.chessgame.Move;
import design.chessgame.Piece;
import design.chessgame.Spot;

public class Bishop extends Piece {
  public Bishop() {
    type = Type.Bishop;
  }

  @Override
  public boolean isMoveValid(Move move, Spot[][] board) {
    return false;
  }
}
