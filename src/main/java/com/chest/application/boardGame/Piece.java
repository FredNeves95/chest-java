package com.chest.application.boardGame;

public class Piece {
  protected Position position;
  private Board board;

  public Piece(Board board) {
    this.board = board;
    position = null;
  } 

  protected Board getBoard() {
    return board;
  }

  public boolean possibleMove(Position position){
    return true;
  }
}
