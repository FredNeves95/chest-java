package com.chest.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.chest.application.chess.ChessMatch;
@SpringBootApplication
public class Program {
	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();

		UI.printBoard(chessMatch.getPieces());
	}
}
