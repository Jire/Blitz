package blitz.language.parse;

import blitz.language.Component;
import blitz.language.Keyword;
import blitz.language.Registry;

public final class SyntaxManager extends Registry<Component> {

	public void register(Keyword keyword, Component component) {
		register(keyword.toString(), component);
	}

	/*
	 * Increase the visibility of (un)register methods
	 * so that a parser can register values to the registry.
	 */

	@Override
	public void register(String name, Component component) {
		super.register(name, component);
	}

	@Override
	public void unregister(String name) {
		super.unregister(name);
	}

}