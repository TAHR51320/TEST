package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class Controller_test implements Initializable {
	@FXML ListView <String> test ;
	@FXML ObservableList<String> t;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	t = FXCollections.observableArrayList("1", "2", "3", "4");
	test.setItems(t);
	
	test.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
	
	}
	
	public void a(ActionEvent e){
		String list;
		list = test.getSelectionModel().getSelectedItem();
		
	System.out.println(list);
	}

	
	
	
}
