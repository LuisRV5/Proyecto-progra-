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
	
	public int numRandom() {
		int numRandom = (int)(Math.random()*20);
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
				positionX = numRandom();
				positionY = numRandom();
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
				positionX = numRandom();
				positionY = numRandom();
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
}
