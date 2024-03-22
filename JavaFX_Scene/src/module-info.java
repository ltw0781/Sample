module JavaFX_Scene {
	requires javafx.controls;
	requires javafx.fxml
	;
	
	opens application to javafx.graphics, javafx.fxml, javafx.controls;
}
