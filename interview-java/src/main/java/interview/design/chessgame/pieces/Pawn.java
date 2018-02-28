package interview.design.chessgame.pieces;

import interview.design.chessgame.Move;
import interview.design.chessgame.Piece;
import interview.design.chessgame.Spot;

public class Pawn extends Piece {
  public Pawn() {
    type = Type.Pawn;
  }

  @Override
  public boolean isMoveValid(Move move, Spot[][] board) {
    return false;
  }
}
