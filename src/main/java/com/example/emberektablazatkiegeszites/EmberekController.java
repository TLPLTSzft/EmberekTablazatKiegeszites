package com.example.emberektablazatkiegeszites;

import javafx.css.ParsedValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmberekController {
	
	@FXML
	private TableView<Ember> emberek;
	@FXML
	private TableColumn<Ember, String> nevOszlop;
	@FXML
	private TableColumn<Ember, Integer> korOszlop;
	@FXML
	private TextField nevMezo;
	@FXML
	private Spinner<Integer> korMezo;
	@FXML
	String nev;
	@FXML
	int kor;
	
	@FXML
	private void initialize() {
		nevOszlop.setCellValueFactory(new PropertyValueFactory<>("nev"));
		korOszlop.setCellValueFactory(new PropertyValueFactory<>("eletkor"));
		SpinnerValueFactory<Integer> valueFactory =
			new SpinnerValueFactory.IntegerSpinnerValueFactory(20, 40);
		valueFactory.setValue(30);
		korMezo.setValueFactory(valueFactory);
		emberek.getItems().add(new Ember("első név", 20));
		emberek.getItems().add(new Ember("második név", 25));
		emberek.getItems().add(new Ember("harmadik név", 30));
	}
	
	public void hozzaadClick(ActionEvent actionEvent) {
		nev = nevMezo.getText().trim();
		if (nev.isEmpty()) {
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setContentText("Név megadása kötelező");
			alert.show();
		} else {
			kor = korMezo.getValue();
			emberek.getItems().add(new Ember(nev, kor));
		}
	}
}