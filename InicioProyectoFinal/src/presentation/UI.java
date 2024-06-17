package presentation;

import java.util.ArrayList;

import domain.Events;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UI {
	
	private static UI ui;

	private Scene myScene;
	private Pane pContainer;
	private GridPane gPMatrix;
	
	private TableView<Events> tvEvents;
	private ObservableList<Events> oLEvents;
	private Button bMove;
	private Button[][] buttonMatrix;
	
	
	private UI() {
		setBMove("Movimiento");
		setPContainer();
		setMyScene(pContainer);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Matriz de Componentes");
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
			for(int j=0;j<buttonMatrix[i].length;j++) {
				buttonMatrix[i][j]=new Button();	
				buttonMatrix[i][j].setPrefSize(40,40);
				buttonMatrix[i][j].setMinSize(40,40);
				
				}
		}
	}
	public void setTVEventes(ObservableList<Events> oLEvents) {
		tvEvents = new TableView<Events>();
		//crear columnas
		TableColumn<Events, String> avenueColumn = new TableColumn<>("Avenida");
		avenueColumn.setCellValueFactory(cellData -> cellData.getValue().avenueProperty());
		avenueColumn.setPrefWidth(115);//ancho
		
		TableColumn<Events, String> streetColumn = new TableColumn<>("Calle");
		streetColumn.setCellValueFactory(cellData -> cellData.getValue().streetProperty());
		streetColumn.setPrefWidth(115);//ancho
		
		TableColumn<Events, String> eventColumn = new TableColumn<>("Evento");
		eventColumn.setCellValueFactory(cellData -> cellData.getValue().eventProperty());
		eventColumn.setPrefWidth(115);//ancho
		
		TableColumn<Events, String> resultColumn = new TableColumn<>("Resultado");
		resultColumn.setCellValueFactory(cellData -> cellData.getValue().resultProperty());
		resultColumn.setPrefWidth(115);//ancho
		
		tvEvents.getColumns().addAll(avenueColumn,streetColumn,eventColumn,resultColumn);
		tvEvents.setPrefSize(460,200);
		tvEvents.setTranslateX(900);
		tvEvents.setTranslateY(110);
		
		tvEvents.setItems(oLEvents);
	}

	public TableView<Events> getTVEvents(){
		return this.tvEvents;
	}
	
	public void setObservableList(ArrayList<Events> Events) {
		oLEvents = FXCollections.observableArrayList(Events);
	}
	
	public ObservableList<Events> getObservableList(){
		return oLEvents;
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
			for(int j=0;j<buttonMatrix[i].length;j++) {
				gPMatrix.add(buttonMatrix[i][j],j,i);
		
				}
		}
	}
	public GridPane getGPMatrix() {
		return gPMatrix;
	}
	
	public static UI getInstance() {
		if(ui==null) {
		ui = new UI();
		}
		return ui;
	}
	
}