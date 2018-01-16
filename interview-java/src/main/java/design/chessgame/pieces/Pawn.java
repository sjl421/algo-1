package design.chessgame.pieces;

import design.chessgame.Move;
import design.chessgame.Piece;
import design.chessgame.Spot;

public class Pawn extends Piece {
  public Pawn() {
    type = Type.Pawn;
  }

  @Override
  public boolean isMoveValid(Move move, Spot[][] board) {
    return false;
  }
}
