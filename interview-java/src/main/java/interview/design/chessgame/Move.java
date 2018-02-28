package interview.design.chessgame;

public class Move {

  private Spot from;
  private Spot to;
  private Piece piece;

  Move(Spot from, Spot to, Piece piece) {
    this.from = from;
    this.to = to;
    this.piece = piece;
  }
}
