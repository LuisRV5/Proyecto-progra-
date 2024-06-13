package domain;

public class Tree implements ImmovableElement {

	private int positionRow = 0;
	private int positionColumn = 0;

	public Tree() {
		
	}

	public void setPositionRow(int positionRow) {
		this.positionRow = positionRow;
	}
	
	public int getPositionRow() {
		return positionRow;
	}

	public void setPositionColumn(int positionColum) {
		this.positionColumn = positionColum;
	}
	
	public int getPositionColumn() {
		return positionColumn;
	}
	
	@Override
	public String toString() {
		return "Tree [positionRow=" + positionRow + ", positionColum=" + positionColumn + "]\n";
	}
}
