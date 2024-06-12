package domain;

public interface MovableElement {

	public abstract void setPositionX(int positionX);
	
	public abstract int getPositionX();

	public abstract void setPositionY(int positionY);
	
	public abstract int getPositionY();
	
	public abstract void setLastMove(int lastMove);
	
	public abstract int getLastMove();
}
