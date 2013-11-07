

public class PlayGame
	{
	static int currentColumnPlay;
	static int currentRowPlay;
	static String [][] board;
	
	public static void main(String[] args)
		{
		board = new String [3][3];
		for(int i=0;i<3;i++)
			{
			for(int j=0;j<3;j++)
				{
				board[i][j] = " ";
				}
			}
		
		Board.printBoard();
		HumanPlayer.choosePlayerMarker();
		
		while (!checkForWonGame())
			{
			HumanPlayer.inputPlayerMove();
			board[currentRowPlay][currentColumnPlay] = HumanPlayer.playerMarker;
			Board.printBoard();
			
			ComputerPlayer.computerMove();
			board[currentRowPlay][currentColumnPlay] = HumanPlayer.computerMarker;
			Board.printBoard();
			}
		}
	
	public static boolean isValidMove()
		{
		if (!board[currentRowPlay][currentColumnPlay].equals(" "))
			{
			return true;
			}
		return false;
		}
	
	public static boolean checkForWonGame()
		{
		if ((board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X")) ||
			(board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X")) ||
			(board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X")) ||
			(board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X")) ||				
			(board[0][1].equals("X") && board[1][1].equals("X") && board[1][2].equals("X")) ||
			(board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X")) ||
			(board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")) ||
			(board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")) ||
			(board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O")) ||
			(board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O")) ||
			(board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O")) ||
			(board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O")) ||				
			(board[0][1].equals("O") && board[1][1].equals("O") && board[1][2].equals("O")) ||
			(board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O")) ||
			(board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")) ||
			(board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")))
			{
			System.out.println("The game is over!");
			return true;
			}
		return false;
		}
	}
