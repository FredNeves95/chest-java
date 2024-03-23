package com.chest.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chest.application.boardGame.Board;
@SpringBootApplication
public class Program {
	public static void main(String[] args) {
		Board board = new Board(8, 8);
	}

}
