package business;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import domain.ImmovableElement;
import domain.MovableElement;
import javafx.scene.control.Button;

public class Logic {

	public Logic() {

	}

	public ArrayList<Integer> columsAndRows(String text) {
		ArrayList<Integer> matrix = new ArrayList<Integer>();
		matrix.add(Integer.parseInt(text.split(",")[0]));
		matrix.add(Integer.parseInt(text.split(",")[1]));
		return matrix;
	}
	
	public int numRandom(int range) {
		int numRandom = (int)(Math.random()*range);
		return numRandom;
	}
	
public void setImmovableObject(Button[][] buttonMatrix, ArrayList<ImmovableElement> mES, String x) {
		
		boolean flag = false;
		int positionRow = 0;
		int positionColumn = 0;
		int counter = 0;
		
		for(int i=0;i<mES.size();i++) {
			do {
				flag = false;
				positionRow = numRandom(20);
				positionColumn = numRandom(20);
				if(buttonMatrix[positionRow][positionColumn].getText() == "") {
					mES.get(i).setPositionRow(positionRow);
					mES.get(i).setPositionColumn(positionColumn);
					buttonMatrix[positionRow][positionColumn].setText(x);
				}else {
				flag = true;
				counter++;
			  }
			}while(flag);
		}
		
		System.out.println("Contador" + x +":" + counter);
		System.out.println("----------------");
	}

	public void setMovableObject(Button[][] buttonMatrix, ArrayList<MovableElement> mES, String x) {
		
		boolean flag = false;
		int positionRow = 0;
		int positionColumn = 0;
		int counter = 0;
		
		for(int i=0;i<mES.size();i++) {
			do {
				flag = false;
				positionRow = numRandom(20);
				positionColumn = numRandom(20);
				if(buttonMatrix[positionRow][positionColumn].getText() == "") {
					mES.get(i).setPositionRow(positionRow);
					mES.get(i).setPositionColumn(positionColumn);
					buttonMatrix[positionRow][positionColumn].setText(x);
				}else {
				flag = true;
				counter++;
			  }
			}while(flag);
		}
		
		System.out.println("Contador" + x +":" + counter);
		System.out.println("----------------");
	}
	
	public void setNewPosition(Button[][] buttonMatrix, MovableElement eM, int i) {
		System.out.println("Zombie "+i +":cambiando posicion");
		System.out.println(eM.toString());
		boolean flag = true;
		
		//0 = Izquierda
		//1 = Derecha
		//2 = Arriba
		//3 = Abajo
		
		do {
			int movement = numRandom(4);
			System.out.println("numero random: "+movement);
			if(movement!=eM.getLastMove()) {
				switch(movement) {
				case 0:
					if(eM.getPositionColumn()>0) {
						System.out.println("Condicional 1 si");
						if(!(buttonMatrix[eM.getPositionRow()][eM.getPositionColumn()-1].getText().equals("E")) 
								&& (!buttonMatrix[eM.getPositionRow()][eM.getPositionColumn()-1].getText().equals("T"))) {
							System.out.println("Condicional 2 si");
							eM.setPositionColumn(eM.getPositionColumn()-1);
							eM.setLastMove(0);
							flag = false;
						}
					}
					break;
				case 1:
					if(eM.getPositionColumn()<buttonMatrix[0].length-1) {
						System.out.println("Condicional 1 si");
						if((!buttonMatrix[eM.getPositionRow()][eM.getPositionColumn()+1].getText().equals("E")) 
								&& (!buttonMatrix[eM.getPositionRow()][eM.getPositionColumn()+1].getText().equals("T"))) {
							System.out.println("Condicional 2 si");
							eM.setPositionColumn(eM.getPositionColumn()+1);
							eM.setLastMove(1);
							flag = false;
						}
					}
					break;
				case 2:
					if(eM.getPositionRow()>0) {
						System.out.println("Condicional 1 si");
						if((!buttonMatrix[eM.getPositionRow()-1][eM.getPositionColumn()].getText().equals("E")) 
								&& (!buttonMatrix[eM.getPositionRow()-1][eM.getPositionColumn()].getText().equals("T"))) {                   
							System.out.println("Condicional 2 si");
							eM.setPositionRow(eM.getPositionRow()-1);
							eM.setLastMove(2);
							flag = false;
						}
					}
					break;
				case 3:
					if(eM.getPositionRow()<buttonMatrix[0].length-1) {
						System.out.println("Condicional 1 si");
						if((!buttonMatrix[eM.getPositionRow()+1][eM.getPositionColumn()].getText().equals("E")) 
								&& (!buttonMatrix[eM.getPositionRow()+1][eM.getPositionColumn()].getText().equals("T")) ) {
							System.out.println("Condicional 2 si");
							eM.setPositionRow(eM.getPositionRow()+1);
							eM.setLastMove(3);
							flag = false;
						}
					}
					break;
			 }
			}
			
		}while(flag);
		System.out.println(eM.toString());
		System.out.println("Zombie cambiado de posicion\n");
	}
}
