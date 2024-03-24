package com.chest.application.chess;

import com.chest.application.boardGame.Board;
import com.chest.application.boardGame.Piece;
import java.awt.Color;

public class ChessPiece extends Piece {
  private Color color;
  
  public ChessPiece(Board board, Color color) {
    super(board);
    this.color = color;
  }

  public Color getColor() {
    return color;
  }
}
