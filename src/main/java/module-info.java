module dev.ggsource {
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive javafx.graphics;

	opens dev.ggsource to javafx.fxml;
	exports dev.ggsource;
}
