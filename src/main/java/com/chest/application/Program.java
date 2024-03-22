package com.chest.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chest.application.boardGame.Position;

@SpringBootApplication
public class Program {
	public static void main(String[] args) {
		Position pos = new Position(3, 5);

		System.out.println(pos.toString());
	}

}
