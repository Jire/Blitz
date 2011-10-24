package blitz;

public abstract class EnvironmentFactory {

	private final Interpreter interpreter = new Interpreter();

	protected final void enable(InterpreterOption option) {
		interpreter.enableOption(option);
	}

	protected abstract void configure();

	Environment build() {
		return new Environment(
				interpreter,
				new Engine(interpreter.optionEnabled(InterpreterOption.MULTIPROCESSING))
				);
	}

	protected static enum InterpreterOption {

		/**
		 * Enabling this option will allow utilization of
		 * multiple processor machinery.
		 */
		MULTIPROCESSING;

	}

}