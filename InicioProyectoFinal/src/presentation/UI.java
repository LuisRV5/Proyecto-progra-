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
	private Label lSize;
	private TextField tFSize;
	private Button bCreate;
	private Button[][] buttonMatrix;
	
	public UI() {
		setLSize("tamano");
		setTFSize();
		setBCreate("crear");
		setPContainer();
		setMyScene(pContainer);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Matriz de Componentes");
		primaryStage.setMinHeight(400);
		primaryStage.setMinWidth(500);
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
		pContainer.getChildren().add(lSize);
		pContainer.getChildren().add(tFSize);
		pContainer.getChildren().add(bCreate);
		
		}
	
	public Pane getPContainer() {
		return this.pContainer;
		
	}
	
	public void setLSize(String text) {
		lSize = new Label(text);
		lSize.setPrefSize(100,20);
		lSize.setTranslateX(25);
		lSize.setTranslateY(20);
	}
	public Label getLSize() {
		return lSize;
	}
	
	public void setTFSize() {
		tFSize = new TextField();
		tFSize.setPrefSize(100,20);
		tFSize.setTranslateX(145);
		tFSize.setTranslateY(20);
	}
	
	public TextField getTFSize() {
		return tFSize;
	}
	
	public void setBCreate(String text) {
		bCreate = new Button(text);
		bCreate.setPrefSize(100,20);
		bCreate.setTranslateX(265);
		bCreate.setTranslateY(20);
	}
	public Button getBCreate() {
		return bCreate;
	}
	
	public void createButtonMatrix(int rows,int columns) {
		buttonMatrix = new Button[rows][columns];
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
		gPMatrix.setTranslateY(60);
		
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