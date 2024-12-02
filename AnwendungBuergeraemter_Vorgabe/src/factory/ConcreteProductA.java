package factory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteProductA extends Product{
	
	private BufferedReader br;

	public ConcreteProductA() throws IOException {
		
		br=new BufferedReader(new FileReader("AutosAusgabe.csv"));
		
	
	}

	@Override
	public String[] leseAusDatei() throws IOException {
		
		
		String []ergbniszeile=new String [1];
		String zeile=br.readLine();
		int i=0;
		while(i <ergbniszeile.length) {
			ergbniszeile[i]=zeile;
			zeile=br.readLine();
			i++;
		}
		String []wert=ergbniszeile[0].split(";");
		return ergbniszeile[0].split(";");
		
	}

	@Override
	public void schliesseDatei() throws IOException {
		// TODO Auto-generated method stub
		br.close();
	}
	
	

	
	
	
}