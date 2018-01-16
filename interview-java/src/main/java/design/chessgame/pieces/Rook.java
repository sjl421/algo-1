package design.chessgame.pieces;

import design.chessgame.Move;
import design.chessgame.Piece;
import design.chessgame.Spot;

public class Rook extends Piece {
  public Rook() {
    type = Type.Rook;
  }

  @Override
  public boolean isMoveValid(Move move, Spot[][] board) {
    return false;
  }
}
