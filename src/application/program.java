package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class program {
		public static void main(String[] args) {
			ChessMatch chessMatch = new ChessMatch(); 
			Scanner s = new Scanner(System.in);
			while (true) { 
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source");
			ChessPosition source = UI.readChessPosition(s);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(s);
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			
			}
			
		}
}

