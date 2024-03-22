module JavaFX_SwitchScene {
	requires javafx.controls;
	requires javafx.fxml;		//FX모듈 추가
	
	opens application to javafx.graphics, javafx.fxml;
}
