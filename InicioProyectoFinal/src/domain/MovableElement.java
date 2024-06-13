package domain;

public interface MovableElement {

	public abstract void setPositionRow(int positionRow);
	
	public abstract int getPositionRow();

	public abstract void setPositionColumn(int positionColumn);
	
	public abstract int getPositionColumn();
	
	public abstract void setLastMove(int lastMove);
	
	public abstract int getLastMove();
}
