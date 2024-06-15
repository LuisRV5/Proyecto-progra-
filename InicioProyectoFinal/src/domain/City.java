package domain;

public class City {

	private int size = 20;
	private int buildings = 20;
	private int trees = 20;
	private int aliens = 15;
	private int zombies = 15;
	private int humans = 15;
	private int potions = 15;
	
	public City() {
		
	};
	
	public City(int size, int buildings, int trees, int aliens, int zombies, int humans, int potions) {
		this.size = size;
		this.buildings = buildings;
		this.trees = trees;
		this.aliens = aliens;
		this.zombies = zombies;
		this.humans = humans;
		this.potions = potions;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getBuildings() {
		return buildings;
	}

	public void setBuildings(int buildings) {
		this.buildings = buildings;
	}

	public int getTrees() {
		return trees;
	}

	public void setTrees(int trees) {
		this.trees = trees;
	}

	public int getAliens() {
		return aliens;
	}

	public void setAliens(int aliens) {
		this.aliens = aliens;
	}

	public int getZombies() {
		return zombies;
	}

	public void setZombies(int zombies) {
		this.zombies = zombies;
	}

	public int getHumans() {
		return humans;
	}

	public void setHumans(int humans) {
		this.humans = humans;
	}

	public int getPotions() {
		return potions;
	}

	public void setPotions(int potions) {
		this.potions = potions;
	}
	
	public String[] getDataName() {
		String dataName[]= {"size","buildings","trees","aliens","zombies","humans","potions"};
		return dataName;
	}
	
	public String[] getData() {
		String data[]= {String.valueOf(this.size),String.valueOf(this.buildings),
				String.valueOf(this.trees),String.valueOf(this.aliens),
				String.valueOf(this.zombies),String.valueOf(this.humans),
				String.valueOf(this.potions)};
		return data;
	}
	@Override
	public String toString() {
		return "City [size=" + size + ", buildings=" + buildings + ", trees=" + trees + ", aliens=" + aliens
				+ ", zombies=" + zombies + ", humans=" + humans + ", potions=" + potions + "]";
	}
	
	
}
