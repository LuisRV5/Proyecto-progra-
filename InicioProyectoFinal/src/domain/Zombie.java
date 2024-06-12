package domain;

public class Zombie implements MovableElement {

	private int positionX = 0;
	private int positionY = 0;
	private int lastMove = 0;

	public Zombie() {
		
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	
	public int getPositionX() {
		return positionX;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	
	public int getPositionY() {
		return positionY;
	}
	
	public void setLastMove(int lastMove) {
		this.lastMove = lastMove;
	}
	
	public int getLastMove() {
		return lastMove;
	}

	@Override
	public String toString() {
		return "Zombie [positionX=" + positionX + ", positionY=" + positionY + ", lastMove=" + lastMove + "]\n";
	}
	
}
