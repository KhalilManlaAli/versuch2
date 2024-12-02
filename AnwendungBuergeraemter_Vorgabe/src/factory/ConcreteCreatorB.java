package factory;

import java.io.IOException;

public class ConcreteCreatorB extends Creator {

	@Override
	public Product factoryMethod() throws IOException {
		
		return new  ConcreteProductB();
	}

}