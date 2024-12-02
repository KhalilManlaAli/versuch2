package factory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteProductB extends Product{
	

	private BufferedReader br;

	public ConcreteProductB() throws IOException {
		
		br=new BufferedReader(new FileReader("AutosAusgabe.txt"));
		
	
	}

	@Override
	public String[] leseAusDatei() throws IOException {
		
		
		String []ergbniszeile=new String [5];
		String zeile=br.readLine();
		int i=0;
		while(i <ergbniszeile.length) {
			ergbniszeile[i]=zeile;
			zeile=br.readLine();
			i++;
		}
		return ergbniszeile;
		
	}

	@Override
	public void schliesseDatei() throws IOException {
		// TODO Auto-generated method stub
		br.close();
	}
	
	

}
