package design.chessgame.pieces;

import design.chessgame.Move;
import design.chessgame.Piece;
import design.chessgame.Spot;

public class Queen extends Piece {
  public Queen() {
    type = Type.Queen;
  }

  @Override
  public boolean isMoveValid(Move move, Spot[][] board) {
    return false;
  }
}
