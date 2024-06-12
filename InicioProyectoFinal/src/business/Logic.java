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
		int positionX = 0;
		int positionY = 0;
		int counter = 0;
		
		for(int i=0;i<mES.size();i++) {
			do {
				flag = false;
				positionX = numRandom(20);
				positionY = numRandom(20);
				if(buttonMatrix[positionX][positionY].getText() == "") {
					mES.get(i).setPositionX(positionX);
					mES.get(i).setPositionY(positionY);
					buttonMatrix[positionX][positionY].setText(x);
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
		int positionX = 0;
		int positionY = 0;
		int counter = 0;
		
		for(int i=0;i<mES.size();i++) {
			do {
				flag = false;
				positionX = numRandom(20);
				positionY = numRandom(20);
				if(buttonMatrix[positionX][positionY].getText() == "") {
					mES.get(i).setPositionX(positionX);
					mES.get(i).setPositionY(positionY);
					buttonMatrix[positionX][positionY].setText(x);
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
		int counter = 0;
		
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
					if(eM.getPositionX()>0) {
						System.out.println("Condicional 1 si");
						if(!(buttonMatrix[eM.getPositionY()][eM.getPositionX()-1].getText().equals("E")) 
								&& (!buttonMatrix[eM.getPositionY()][eM.getPositionX()-1].getText().equals("T"))) {
							System.out.println("Condicional 2 si");
							eM.setPositionX(eM.getPositionX()-1);
							eM.setLastMove(0);
							flag = false;
						}
					}
					break;
				case 1:
					if(eM.getPositionX()<buttonMatrix.length) {
						System.out.println("Condicional 1 si");
						if((!buttonMatrix[eM.getPositionY()][eM.getPositionX()+1].getText().equals("E")) 
								&& (!buttonMatrix[eM.getPositionY()][eM.getPositionX()+1].getText().equals("T"))) {
							System.out.println("Condicional 2 si");
							eM.setPositionX(eM.getPositionX()+1);
							eM.setLastMove(1);
							flag = false;
						}
					}
					break;
				case 2:
					if(eM.getPositionY()>0) {
						System.out.println("Condicional 1 si");
						if((!buttonMatrix[eM.getPositionY()-1][eM.getPositionX()].getText().equals("E")) 
								&& (!buttonMatrix[eM.getPositionY()-1][eM.getPositionX()].getText().equals("T"))) {
							System.out.println("Condicional 2 si");
							eM.setPositionY(eM.getPositionY()-1);
							eM.setLastMove(2);
							flag = false;
						}
					}
					break;
				case 3:
					if(eM.getPositionY()<buttonMatrix[0].length) {
						System.out.println("Condicional 1 si");
						if((!buttonMatrix[eM.getPositionY()+1][eM.getPositionX()].getText().equals("E")) 
								&& (!buttonMatrix[eM.getPositionY()+1][eM.getPositionX()].getText().equals("T")) ) {
							System.out.println("Condicional 2 si");
							eM.setPositionY(eM.getPositionY()+1);
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
