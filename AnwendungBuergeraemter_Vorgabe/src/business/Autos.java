package business;

public class Autos {
	
	// Name des Buergeramtes
    private String kennzeichen;
    // Oeffnungszeiten
    private float typ;
    private String modell;
    // Strasse und Hausnummer des Buergeramtes
    private float tagespreis;
    // Dienstleistungen des Buergeramtes
    private String[] vermietet;

  
	
	public Autos(String kennzeichen, float typ, String modell, float tagespreis, String[] vermietet) {
		super();
		this.kennzeichen = kennzeichen;
		this.typ = typ;
		this.modell = modell;
		this.tagespreis = tagespreis;
		this.vermietet = vermietet;
	}
	
	

	public String getKennzeichen() {
		return kennzeichen;
	}



	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}



	public float getTyp() {
		return typ;
	}



	public void setTyp(float typ) {
		this.typ = typ;
	}



	public String getModell() {
		return modell;
	}



	public void setModell(String modell) {
		this.modell = modell;
	}



	public float getTagespreis() {
		return tagespreis;
	}



	public void setTagespreis(float tagespreis) {
		this.tagespreis = tagespreis;
	}



	public String[] getVermietet() {
		return vermietet;
	}



	public void setVermietet(String[] vermietet) {
		this.vermietet = vermietet;
	}



	public String getVermietetAlsString(char trenner) {
		String ergebnis = "";
		int i = 0;
		for(i = 0; i < this.getVermietet().length - 1; i++) {
			ergebnis = ergebnis + this.getVermietet()[i] + trenner; 
		}
		return ergebnis	+ this.getVermietet()[i];
	}
	
	public String gibAutosZurueck(char trenner){
  		return this.getKennzeichen() + trenner 
  			+ this.getTyp() + trenner
  		    + this.getModell() + trenner
  		    + this.getTagespreis() + trenner
  		    + this.getVermietetAlsString(trenner) + "\n";
  	}
}

