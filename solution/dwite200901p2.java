/* 
 * DWITE - January 2009 - Problem 2: Tic Tac Win
 * Solution by Nayuki Minase
 * 
 * http://nayuki.eigenstate.org/page/dwite-programming-contest-solutions
 * https://github.com/nayuki/DWITE-programming-contest-solutions
 */


public final class dwite200901p2 extends DwiteSolution {
	
	public static void main(String[] args) {
		new dwite200901p2().run("DATA2.txt", "OUT2.txt");
	}
	
	
	private char[][] grid;
	
	protected void runOnce() {
		// Read board
		grid = new char[3][];
		for (int i = 0; i < grid.length; i++)
			grid[i] = io.readLine().toCharArray();
		
		// Check horizontal
		for (int y = 0; y < 3; y++) {
			char temp = getLineConsensus(0, y, 1, 0);
			if (temp != '.') {
				io.println(temp + "");
				return;
			}
		}
		
		// Check vertical
		for (int x = 0; x < 3; x++) {
			char temp = getLineConsensus(x, 0, 0, 1);
			if (temp != '.') {
				io.println(temp + "");
				return;
			}
		}
		
		// Check diagonals
		char temp = getLineConsensus(0, 0, 1, 1);
		if (temp != '.') {
			io.println(temp + "");
			return;
		}
		temp = getLineConsensus(2, 0, -1, 1);
		if (temp != '.') {
			io.println(temp + "");
			return;
		}
		
		// No winner
		io.println(".");
	}
	
	
	private char getLineConsensus(int x, int y, int dx, int dy) {
		char result = grid[y][x];
		for (int i = 0; i < 3; i++, x += dx, y += dy) {
			if (grid[y][x] != result)
				result = '.';
		}
		return result;
	}
	
}
