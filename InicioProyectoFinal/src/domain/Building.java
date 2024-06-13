package domain;

public class Building implements ImmovableElement {

	private int positionRow = 0;
	private int positionColumn = 0;

	public Building() {
		
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
	
	@Override
	public String toString() {
		return "Building [positionRow=" + positionRow + ", positionColumn=" + positionColumn + "]\n";
	}

}
