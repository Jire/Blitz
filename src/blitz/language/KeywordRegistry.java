package blitz.language;

final class KeywordRegistry extends Registry<Keyword> {

	void register(String name, String keyword) {
		register(name, new Keyword(keyword));
	}

	Keyword forComponent(Component component) {
		return search(component.getKeyword().toString());
	}

}