package domain;

public class Building implements ImmovableElement {

	private int positionX = 0;
	private int positionY = 0;

	public Building() {
		
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
		return "Building [positionX=" + positionX + ", positionY=" + positionY + "]\n";
	}

}
