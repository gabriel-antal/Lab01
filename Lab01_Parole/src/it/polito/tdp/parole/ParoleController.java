package it.polito.tdp.parole;

/**
 * Sample Skeleton for 'Parole.fxml' Controller Class
 */


import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ParoleController {
	
	Parole elenco ;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader
    
    @FXML
    private Button btnReset;

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader
    
    @FXML
    private TextArea txtTempo;

    @FXML
    private Button buttonCancella;

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
        String stemp = new String();
        long time = System.nanoTime();
    	
    	elenco.addParola(this.txtParola.getText());
    	
    	for(int i=0;i<elenco.getElenco().size();i++)
    		stemp += elenco.getElenco().get(i)+"\n";
    	
    	this.txtResult.clear();
    	this.txtResult.appendText(stemp);
    	this.txtParola.clear();
    	//String s = Integer.toString((int) System.nanoTime());
    	String s = Long.toString(System.nanoTime()-time);
    	this.txtTempo.appendText(s+"\n");
    	
    }
    
    @FXML
    void doReset(ActionEvent event) {
    	
    	long time = System.nanoTime();
    	
    	this.txtResult.clear();
    	elenco.reset();
    	this.txtTempo.clear();
    	
    	String s = Long.toString(System.nanoTime()-time);
    	this.txtTempo.appendText(s+"\n");
    	
    	}
    
 	
    
    @FXML
    void doDelete(ActionEvent event) {
    	
    	 long time = System.nanoTime();
    	
    	//this.txtResult.deleteText(this.txtResult.getSelection());
    	elenco.cancellaSelezione(this.txtResult.getSelectedText());
    	this.txtResult.clear();
    	
    	String stemp = new String();
    	for(int i=0;i<elenco.getElenco().size();i++)
    		stemp += elenco.getElenco().get(i)+"\n";
    	
    	this.txtResult.appendText(stemp);
    	
     	String s = Long.toString(System.nanoTime()-time);
    	this.txtTempo.appendText(s+"\n");
    

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtTempo != null : "fx:id=\"txtTempo\" was not injected: check your FXML file 'Parole.fxml'.";
        assert buttonCancella != null : "fx:id=\"buttonCancella\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Parole.fxml'.";
        elenco = new Parole() ;
        
    }
}
