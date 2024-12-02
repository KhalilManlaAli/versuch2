package factory;

import java.io.IOException;

public class ConcreteCreatorA  extends Creator{

	@Override
	public Product factoryMethod() throws IOException {
		
	return new  ConcreteProductA();
	
	}

}