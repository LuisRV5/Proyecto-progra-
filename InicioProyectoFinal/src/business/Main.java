package business;
	
import javafx.application.Application;
import javafx.stage.Stage;
import presentation.UI;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		UI ui = UI.getInstance();
		Controller controller = new Controller(ui);
		controller.getControl();
		ui.start(primaryStage);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
