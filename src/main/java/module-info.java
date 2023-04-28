module com.example.emberektablazatkiegeszites {
	requires javafx.controls;
	requires javafx.fxml;
	
	
	opens com.example.emberektablazatkiegeszites to javafx.fxml;
	exports com.example.emberektablazatkiegeszites;
}