module InicioProyectoFinal {
	requires javafx.controls;
	requires java.desktop;
	requires javafx.base;
	requires jdk.jdi;
	
	opens business to javafx.graphics, javafx.fxml;
}
