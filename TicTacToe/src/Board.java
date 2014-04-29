
public class Board
	{	
	static String [][] board;
	
	public static void createBlankBoard()
		{
		board = new String [3][3];
		for(int i=0;i<3;i++)
			{
			for(int j=0;j<3;j++)
				{
				board[i][j] = " ";
				}
			}
		}
	
	public static void printBoard()
		{
		System.out.println("    1   2   3");
		System.out.println("  -------------");
		System.out.println("A | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | ");
		System.out.println("  -------------");
		System.out.println("B | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | ");
		System.out.println("  -------------");
		System.out.println("C | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | ");
		System.out.println("  -------------");
		System.out.println();
		}	
	public static boolean checkForWonGame()
		{
		if ((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && !board[0][1].equals(" ")) ||
			(board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && !board[1][1].equals(" ")) ||
			(board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && !board[2][1].equals(" ")) ||
			(board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && !board[1][0].equals(" ")) ||				
			(board[0][1].equals(board[1][1]) && board[1][1].equals(board[1][2]) && !board[1][1].equals(" ")) ||
			(board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && !board[1][2].equals(" ")) ||
			(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[1][1].equals(" ")) ||
			(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[1][1].equals(" ")))
			{
			System.out.println("The game is over!");
			return true;
			}
		return false;
		}
	}
