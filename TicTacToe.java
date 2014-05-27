import java.util.Arrays;

public class TicTacToe {

	public static int[][] tictactoe = { { 1, 1, 0}, { 1, 0, 0 }, { 0, -1, -1 } };

	public static void main(String[] args) {

		for (int i = 0; i < tictactoe.length; i++) {
			for (int j = 0; j < tictactoe[i].length; ++j) {
				System.out.print("|");
				System.out.printf("%2d", tictactoe[i][j]);
				System.out.print("|");
			}
			System.out.println("");
		}
		
		System.out.println(addLines(tictactoe));
	}

	public static int addLines(int[][] test) {
		int result = 0;
		int winner = -1;
		for (int i=0; i < test.length; i++) {
			result = 0;
			for(int j=0; j < test[i].length; j++) {
				result += test[i][j];
				if (result == 3 || result == -3){
					int line = i + 1;
					System.out.println("Line " + line + " wins!");
					winner = 1;
					break;
				}
				if (winner == 1) break;
			}
		}
		return result;
	}
}
