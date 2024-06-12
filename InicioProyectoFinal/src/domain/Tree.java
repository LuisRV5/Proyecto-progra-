package domain;

public class Tree implements ImmovableElement {

	private int positionX = 0;
	private int positionY = 0;

	public Tree() {
		
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
	
	@Override
	public String toString() {
		return "Tree [positionX=" + positionX + ", positionY=" + positionY + "]\n";
	}
}
