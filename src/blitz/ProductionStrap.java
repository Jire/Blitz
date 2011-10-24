package blitz;

public final class ProductionStrap {

	private final EnvironmentFactory factory;

	public ProductionStrap(EnvironmentFactory factory) {
		this.factory = factory;
	}

	public void launch() {
		if (Environment.getEnvironment() != null) {
			/*
			 * Used to take precautions against global
			 * state issues.
			 * 
			 * From this condition clause the issue of
			 * volatile global state is no longer present
			 * so long as the application programming
			 * framework stays unchanged by developers.
			 */
			return;
		}
		Environment.setEnvironment(factory.build());
	}

}