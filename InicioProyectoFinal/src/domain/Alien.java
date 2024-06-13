package domain;

public class Alien implements MovableElement {

	private int positionRow = 0;
	private int positionColumn = 0;
	private int lastMove = 4;

	public Alien() {
		
	}

	public void setPositionRow(int positionX) {
		this.positionRow = positionX;
	}
	
	public int getPositionRow() {
		return positionRow;
	}

	public void setPositionColumn(int positionY) {
		this.positionColumn = positionY;
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
		return "Alien [positionRow=" + positionRow + ", positionColumn=" + positionColumn + ", lastMove=" + lastMove + "]\n";
	}
}
