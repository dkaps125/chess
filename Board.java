package chess;

public class Board {
	final int HEIGHT = 8;
	final int WIDTH = 8;
	final char[] w_alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
	Piece[][] pieces;
	Location[][] locs;
	
	public Board() {
		for (int i = 1; i < this.HEIGHT; i++) {
			for (int j = 1; j < this.WIDTH; j++) {
				locs[i][j] = new Location(i, j);
			}
		}
	}
	
	public void setup() {
		
	}
	
	public boolean occupied(int x, int y) {
		if (pieces[x][y] != null)
			return true;
		return false;
	}
	
	public int getNumPieces() {
		int sum = 0;
		for (Location[] l : locs) {
			for (Location loc : l) {
				if (pieces[loc.X][loc.Y] != null)
					sum++;
			}
		}
		return sum;
	}
}
