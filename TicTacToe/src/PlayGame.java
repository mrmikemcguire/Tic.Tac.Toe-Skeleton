

public class PlayGame
	{
	static int currentColumnPlay;
	static int currentRowPlay;

	public static void main(String[] args)
		{
		Board.createBlankBoard();
		Board.printBoard();
		HumanPlayer.choosePlayerMarker();
		
		while (!Board.checkForWonGame())
			{
			HumanPlayer.inputPlayerMove();
			Board.board[currentRowPlay][currentColumnPlay] = HumanPlayer.playerMarker;
			Board.printBoard();
			
			ComputerPlayer.computerMove();
			Board.board[currentRowPlay][currentColumnPlay] = HumanPlayer.computerMarker;
			Board.printBoard();
			}
		}
	
	public static boolean isValidMove()
		{
		if (!Board.board[currentRowPlay][currentColumnPlay].equals(" "))
			{
			return true;
			}
		return false;
		}
	}
