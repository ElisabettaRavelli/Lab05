package it.polito.tdp.anagrammi.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.AnagrammiModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {
	
	private AnagrammiModel model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParolaInserita;

    @FXML
    private Button btnCalcolaAnagrammi;

    @FXML
    private TextArea txtAnagrammiCorretti;

    @FXML
    private TextArea txtAnagrammiErrati;

    @FXML
    private Button btnReset;

    @FXML
    void doCalcolaAnagrammi(ActionEvent event) {

    }

    @FXML
    void doReset(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtParolaInserita != null : "fx:id=\"txtParolaInserita\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnCalcolaAnagrammi != null : "fx:id=\"btnCalcolaAnagrammi\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtAnagrammiCorretti != null : "fx:id=\"txtAnagrammiCorretti\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtAnagrammiErrati != null : "fx:id=\"txtAnagrammiErrati\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }
    
    public void setModel(AnagrammiModel model) {
    	this.model = model;
    }
}
