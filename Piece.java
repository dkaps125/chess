package chess;

import java.util.ArrayList;

abstract class Piece {
	
	Piece(String c) {
		this.color = c;
	}
	
	String color;
	abstract ArrayList<Location> getMoves();
	abstract boolean canMove();
	abstract void move(Location l);
}

class Pawn extends Piece {
	Board b;
	Location l;
	int m;
	
	public Pawn(String c, Location s) {
		super(c);
		if (!c.equalsIgnoreCase("black") || !c.equalsIgnoreCase("white")) {
			System.err.print("Invalid piece color. Black or white only.");
			System.exit(1);
		}
		this.color = c.toLowerCase();
		this.l = s;
		if (color.equals("white"))
			m = 1;
		else
			m = -1;
	}
	
	@Override
	ArrayList<Location> getMoves() {
		ArrayList<Location> locations = new ArrayList<Location>();
		if (!b.occupied(l.X, l.Y + this.m))
			locations.add(new Location(l.X, l.Y + this.m));
		if (b.occupied(l.X - 1, l.Y + this.m) && 
				!b.pieces[l.X -1][l.Y + this.m].color.equals(this.color))
			locations.add(new Location(l.X - 1, l.Y + this.m));
		if (b.occupied(l.X + 1, l.Y + this.m) && 
				!b.pieces[l.X -1][l.Y + this.m].color.equals(this.color))
			locations.add(new Location(l.X + 1, l.Y + this.m));
		return locations;
	}

	@Override
	boolean canMove() {
		if (!b.occupied(l.X, l.Y + this.m))
			return true;
		if (b.occupied(l.X - 1, l.Y + this.m) && 
				!b.pieces[l.X -1][l.Y + this.m].color.equals(this.color))
			return true;
		if (b.occupied(l.X + 1, l.Y + this.m) && 
				!b.pieces[l.X -1][l.Y + this.m].color.equals(this.color))
			return true;
		return false;
	}
	
	boolean canMove(Location loc) {
		if (loc.Y - this.l.Y != this.m)
			return false;
		else if ((b.occupied(loc.X, loc.Y) && 
				b.pieces[loc.X][loc.Y].color.equals(this.color)) ||
				Math.abs(loc.X - this.l.X) != 1 || 
				Math.abs(loc.Y - this.l.Y) != 1)
			return false;
		return true;
	}

	@Override
	void move(Location l) {
		if (this.canMove(l))
			this.l = l;
	}	
}

class Rook extends Piece {
	Board b;
	Location l;
	
	public Rook(String c, Location s) {
		super(c);
		if (!c.equalsIgnoreCase("black") || !c.equalsIgnoreCase("white")) {
			System.err.print("Invalid piece color. Black or white only.");
			System.exit(1);
		}
		this.color = c;
		this.l = s;
	}

	@Override
	ArrayList<Location> getMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	boolean canMove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void move(Location l) {
		if (this.canMove(l))
			this.l = l;
	}	
}

class Knight extends Piece {

	Board b;
	Location l;
	
	public Knight(String c, Location s) {
		super(c);
		if (!c.equalsIgnoreCase("black") || !c.equalsIgnoreCase("white")) {
			System.err.print("Invalid piece color. Black or white only.");
			System.exit(1);
		}
		this.color = c;
		this.l = s;
	}
	
	@Override
	ArrayList<Location> getMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	boolean canMove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void move(Location l) {
		if (this.canMove(l))
			this.l = l;
	}	
}

class Bishop extends Piece {

	Board b;
	Location l;
	
	public Bishop(String c, Location s) {
		super(c);
		if (!c.equalsIgnoreCase("black") || !c.equalsIgnoreCase("white")) {
			System.err.print("Invalid piece color. Black or white only.");
			System.exit(1);
		}
		this.color = c;
		this.l = s;
	}
	
	@Override
	ArrayList<Location> getMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	boolean canMove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void move(Location l) {
		if (this.canMove(l))
			this.l = l;
	}	
}

class King extends Piece {

	Board b;
	Location l;
	
	public King(String c, Location s) {
		super(c);
		if (!c.equalsIgnoreCase("black") || !c.equalsIgnoreCase("white")) {
			System.err.print("Invalid piece color. Black or white only.");
			System.exit(1);
		}
		this.color = c;
		this.l = s;
	}
	
	@Override
	ArrayList<Location> getMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	boolean canMove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void move(Location l) {
		if (this.canMove(l))
			this.l = l;
	}	
}

class Queen extends Piece {

	Board b;
	Location l;
	
	public Queen(String c, Location s) {
		super(c);
		if (!c.equalsIgnoreCase("black") || !c.equalsIgnoreCase("white")) {
			System.err.print("Invalid piece color. Black or white only.");
			System.exit(1);
		}
		this.color = c;
		this.l = s;
	}
	
	@Override
	ArrayList<Location> getMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	boolean canMove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void move(Location l) {
		if (this.canMove(l))
			this.l = l;
	}	
}
