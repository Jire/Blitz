package blitz;

public final class Environment {

	private final Interpreter interpreter;
	private final Engine engine;

	Environment(Interpreter interpreter, Engine engine) {
		this.interpreter = interpreter;
		this.engine = engine;
	}

	public Interpreter getInterpreter() {
		return interpreter;
	}

	public Engine getEngine() {
		return engine;
	}

	/*
	 * The following code presents global state in the application.
	 * 
	 * The production of environments has been limited to one per
	 * application process, defusing the worrysome volatile global state.
	 */
	
	private static Environment environment;

	static void setEnvironment(Environment environment) {
		Environment.environment = environment;
	}

	public static Environment getEnvironment() {
		return environment;
	}

}