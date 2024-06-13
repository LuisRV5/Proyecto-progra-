package domain;

public class Zombie implements MovableElement {

	private int positionRow = 0;
	private int positionColumn = 0;
	private int lastMove = 4;

	public Zombie() {
		
	}

	public void setPositionRow(int positionRow) {
		this.positionRow = positionRow;
	}
	
	public int getPositionRow() {
		return positionRow;
	}

	public void setPositionColumn(int positionColumn) {
		this.positionColumn = positionColumn;
	}
	
	public int getPositionColumn() {
		return positionColumn;
	}
	
	public void setLastMove(int lastMove) {
		this.lastMove = lastMove;
	}
	
	public int getLastMove() {
		return lastMove;
	}

	@Override
	public String toString() {
		return "Zombie [positionRow=" + positionRow + ", positionColumn=" + positionColumn + ", lastMove=" + lastMove + "]\n";
	}
	
}
