package test;

import blitz.ProductionStrap;

final class Loader {

	public static void main(String[] args) {
		ProductionStrap bootstrap = new ProductionStrap(new Factory());
		bootstrap.launch();
	}
	
}