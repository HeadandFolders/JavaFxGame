module Games {
	requires javafx.controls;
	requires java.desktop;
	requires java.sql;
	requires javafx.media;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
