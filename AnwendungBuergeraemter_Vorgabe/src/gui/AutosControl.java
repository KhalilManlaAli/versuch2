package gui;

import java.io.IOException;

import business.Autos;
import business.AutosModel;
import javafx.stage.Stage;

public class AutosControl {

	private AutosModel autosModel;
	private AutosView  autosView;
	
	public AutosControl(Stage primStage) {
		super();
		this.autosModel = new AutosModel();
		this.autosView = new AutosView(this,autosModel,primStage);
	}
	 public void nehmeAutosAuf(){
		 try{
	    		autosModel.setAutos( new Autos(
	        			this.autosView.getTxtKennzeichen().getText(), 
	       	            Float.parseFloat(this.autosView.getTxtTyp().getText()),
	       	            (this.autosView.getTxtModell().getText()),
	       	            Float.parseFloat(this.autosView.getTxtTagespreis().getText()),
	       	           this.autosView.getTxtVermietet().getText().split(";")));
	    		       this.autosView.zeigeInformationsfensterAn("Der Autos wurde aufgenommen!");
	       	}
	       	catch(Exception exc){
	       		this.autosView.zeigeFehlermeldungsfensterAn(exc.getMessage());
	     	}
	    }
	 
	 public void leseAusDatei(String typ){
	    	try {
	      		this.autosModel.leseAusDatei(typ);
	      	}
			catch(IOException exc){
				this.autosView.zeigeFehlermeldungsfensterAn(
					"IOException beim Lesen!");
			}
			catch(Exception exc){
				this.autosView.zeigeFehlermeldungsfensterAn(
					"Unbekannter Fehler beim Lesen!");
			}
		}
	 
	 public void schreibeAutosInCsvDatei() {
			try {
				this.autosModel.schreibeAutosInCsvDatei();;
	   			this.autosView.zeigeInformationsfensterAn(
		   			"Die Autos wurden gespeichert!");
			}	
			catch(IOException exc){
				this.autosView.zeigeFehlermeldungsfensterAn(
					"IOException beim Speichern!");
			}
			catch(Exception exc){
				this.autosView.zeigeFehlermeldungsfensterAn(
					"Unbekannter Fehler beim Speichern!");
			}
		}
	 

}
