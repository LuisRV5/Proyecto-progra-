package business;

import java.util.ArrayList;
import java.util.Arrays;

import domain.Alien;
import domain.Building;
import domain.City;
import domain.Human;
import domain.ImmovableElement;
import domain.MovableElement;
import domain.Tree;
import domain.Zombie;
import data.*;
import presentation.UI;

public class Controller {

	private UI ui;
	private Logic logic;
	private Zombie z = new Zombie();
	private Alien a = new Alien();
	private Human h = new Human();
	private Building ed = new Building();
	private Tree t = new Tree();
	private City city;
	private FilesXML fxml;
	 
	private ArrayList<MovableElement> zombies = new ArrayList<MovableElement>();
	private ArrayList<MovableElement> humanos = new ArrayList<MovableElement>();
	private ArrayList<MovableElement> aliens = new ArrayList<MovableElement>();
	private ArrayList<ImmovableElement> edificios = new ArrayList<ImmovableElement>();
	private ArrayList<ImmovableElement> arboles = new ArrayList<ImmovableElement>();
	
	public Controller(UI ui) {
		this.ui=ui;
		logic = new Logic();
		city = new City();
		fxml = new FilesXML();
	}

	public void getControl() {
		
		// Llena los arrays con los objetos necesarios
		arrays();
		// Elimina archivo anterior y crea uno nuevo
		fxml.deleteXML("Descripcion De Ciudad.xml");
		fxml.createXML("Country","Descripcion De Ciudad.xml");
		// Agrega la ciudad con su descripcion al XML
		fxml.writeXML("Descripcion De Ciudad.xml","City",city.getDataName(),city.getData());
		// Obtiene la descripcion de la ciudad para usarla como objeto
		city = fxml.readXML("Descripcion De Ciudad.xml","city");
		
		if(ui.getPContainer().getChildren().contains(ui.getGPMatrix())) {
			ui.getPContainer().getChildren().remove(ui.getGPMatrix());
		}
		// Crea la matriz con respecto al tamanio
		ui.createButtonMatrix(city.getSize());	
		// Se agrega la matriz a al GP
		ui.setGPMatrix(ui.getButtonMatrix());
		// Se agrega el GP a la ventana
		ui.getPContainer().getChildren().add(ui.getGPMatrix());
		
		logic.setMovableObject(ui.getButtonMatrix(), zombies, "Z");
		logic.setMovableObject(ui.getButtonMatrix(), humanos, "H");
		logic.setMovableObject(ui.getButtonMatrix(), aliens, "A");
		logic.setImmovableObject(ui.getButtonMatrix(), edificios, "E");
		logic.setImmovableObject(ui.getButtonMatrix(), arboles, "T");
	
		System.out.println(zombies.toString());
		System.out.println(humanos.toString());
		System.out.println(aliens.toString());
		System.out.println(edificios.toString());
		System.out.println(arboles.toString());
		
		
		ui.getBMove().setOnAction(e->{
			
			if(ui.getPContainer().getChildren().contains(ui.getGPMatrix())) {
				ui.getPContainer().getChildren().remove(ui.getGPMatrix());
			}
			
			for(int i=0;i<zombies.size();i++) {
				ui.getButtonMatrix()[zombies.get(i).getPositionRow()][zombies.get(i).getPositionColumn()].setText("");
				logic.setNewPosition(ui.getButtonMatrix(), zombies.get(i),i);
				ui.getButtonMatrix()[zombies.get(i).getPositionRow()][zombies.get(i).getPositionColumn()].setText(ui.getButtonMatrix()[zombies.get(i).getPositionRow()][zombies.get(i).getPositionColumn()].getText()+"Z");
			}
			// Se agrega el GP a la ventana
			ui.getPContainer().getChildren().add(ui.getGPMatrix());
		});
	
		}	
	
	public void arrays() {
		for(int i=0;i<city.getZombies();i++) {
			z = new Zombie();
			zombies.add(z);
		}
		
		for(int i=0;i<city.getHumans();i++) {
			h = new Human();
			humanos.add(h);
		}
		
		for(int i=0;i<city.getAliens();i++) {
			a = new Alien();
			aliens.add(a);
		}
		
		for(int i=0;i<city.getBuildings();i++) {
			ed = new Building();
			edificios.add(ed);
		}
		
		for(int i=0;i<city.getTrees();i++) {
			t = new Tree();
			arboles.add(t);
		}
	}
		
}
