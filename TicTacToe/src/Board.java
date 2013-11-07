
public class Board
	{	
	public static void printBoard()
		{
		System.out.println("    A   B   C");
		System.out.println("  -------------");
		System.out.println("1 | " + PlayGame.board[0][0] + " | " + PlayGame.board[0][1] + " | " + PlayGame.board[0][2] + " | ");
		System.out.println("  -------------");
		System.out.println("2 | " + PlayGame.board[1][0] + " | " + PlayGame.board[1][1] + " | " + PlayGame.board[1][2] + " | ");
		System.out.println("  -------------");
		System.out.println("3 | " + PlayGame.board[2][0] + " | " + PlayGame.board[2][1] + " | " + PlayGame.board[2][2] + " | ");
		System.out.println("  -------------");
		System.out.println();
		}	
	}
