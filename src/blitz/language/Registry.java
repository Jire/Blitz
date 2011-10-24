package blitz.language;

import java.util.HashMap;
import java.util.Map;

/**
 * @param <T> The type of value which is kept in the registry.
 */
public abstract class Registry<T> {

	private final Map<String, T> registry = new HashMap<String, T>();

	protected void register(String name, T value) {
		registry.put(name, value);
	}

	protected void unregister(String name) {
		registry.remove(name);
	}

	protected T search(String name) {
		return registry.get(name);
	}

}