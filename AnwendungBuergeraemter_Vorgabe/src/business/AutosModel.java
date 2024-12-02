package business;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import factory.ConcreteCreatorA;
import factory.ConcreteCreatorB;
import factory.Creator;
import factory.Product;

public class AutosModel {


	private Autos autos;

	public Autos getAutos() {
		return autos;
	}

	public void setAutos(Autos autos) {
		this.autos = autos;
	}
	public void schreibeAutosInCsvDatei() throws IOException {
	
			BufferedWriter aus = new BufferedWriter(new FileWriter("AutosAusgabe.txt"));
			aus.write(autos.gibAutosZurueck(';'));
			aus.close();
			
			
}
	
	 public void leseAusDatei(String typ)throws IOException{
		 
		 
		 
		 
		  Creator creator=null;
		  if(typ.equals("csv")) {
				creator=new ConcreteCreatorA();
		  }
		  else {
			  creator=new ConcreteCreatorB();
		  }
		  Product reader=creator.factoryMethod(); 
		  String[] zeile = reader.leseAusDatei();
		  this.autos = new Autos(zeile[0], 
    				Float.parseFloat(zeile[1]), 
    				zeile[2], 
    				Float.parseFloat(zeile[3]), 
    				zeile[4].split("_"));
			reader.schliesseDatei();
		  
	    	
	      		/*if("csv".equals(typ)){
	      			BufferedReader ein = new BufferedReader(new FileReader("AutosAusgabe.csv"));
	      			String[] zeile = ein.readLine().split(";");
	      			this.autos = new Autos(zeile[0], 
	      				Float.parseFloat(zeile[1]), 
	      				zeile[2], 
	      				Float.parseFloat(zeile[3]), 
	      				zeile[4].split("_"));
	      				ein.close();*/

	 }
}

