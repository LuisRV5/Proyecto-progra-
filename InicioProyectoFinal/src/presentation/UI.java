package presentation;

import javax.swing.SpringLayout.Constraints;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UI {

	private Scene myScene;
	private Pane pContainer;
	private GridPane gPMatrix;
	
	private Button bMove;
	private Button[][] buttonMatrix;
	
	public UI() {
		
		setBMove("Movimiento");
		setPContainer();
		setMyScene(pContainer);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Matriz de Componentes");
		primaryStage.setMinHeight(400);
		primaryStage.setMinWidth(500);
		primaryStage.setMaximized(true);
		primaryStage.setScene(getMyScene());
		primaryStage.show();
		}

	public void setMyScene(Pane pconatiner) {
		myScene=new Scene(pContainer);
	}
	
	public Scene getMyScene() {
		return this.myScene;
	}
	
	public void setPContainer() {
		pContainer = new Pane();
		pContainer.getChildren().add(bMove);
		}
	
	public Pane getPContainer() {
		return this.pContainer;
		
	}
	
	public void setBMove(String text) {
		bMove = new Button(text);
		bMove.setPrefSize(100,20);
		bMove.setTranslateX(900);
		bMove.setTranslateY(20);
	}
	
	public Button getBMove() {
		return bMove;
	}
	
	public void createButtonMatrix(int size) {
		buttonMatrix = new Button[size][size];
		for(int i=0;i<buttonMatrix.length;i++) {
			for(int j=0;j<buttonMatrix[0].length;j++) {
				buttonMatrix[i][j]=new Button();	
				buttonMatrix[i][j].setPrefSize(40,40);
				buttonMatrix[i][j].setMinSize(40,40);
				}
		}
	}
	
	public Button[][] getButtonMatrix(){
		return buttonMatrix;
	}
	
	public void setGPMatrix(Button buttonMatrix[][]) {
		gPMatrix = new GridPane(buttonMatrix.length,buttonMatrix[0].length);
		gPMatrix.setHgap(0);
		gPMatrix.setVgap(0);
		gPMatrix.setPrefSize(400, 400);
		gPMatrix.setTranslateX(25);
		gPMatrix.setTranslateY(10);
		
		for(int i=0;i<buttonMatrix.length;i++) {
			for(int j=0;j<buttonMatrix[0].length;j++) {
				gPMatrix.add(buttonMatrix[i][j],i,j);
		
				}
		}
	}
	public GridPane getGPMatrix() {
		return gPMatrix;
	}
}