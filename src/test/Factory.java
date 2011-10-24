package test;

import blitz.EnvironmentFactory;

final class Factory extends EnvironmentFactory {

	@Override
	protected void configure() {
		enable(InterpreterOption.MULTIPROCESSING);
	}

}