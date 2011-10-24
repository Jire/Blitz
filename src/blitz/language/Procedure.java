package blitz.language;

import java.util.Arrays;
import java.util.List;

class Procedure extends Registry<List<Task>> implements Component {

	private final Type type;

	Procedure(Type type) {
		this.type = type;
	}

	void register(String name, Task... tasks) {
		register(name, Arrays.asList(tasks));
	}

	@Override
	public Keyword getKeyword() {
		return type.getKeyword();
	}

	static enum Type implements Component {

		TASK,
		PRODUCTION;

		private final Keyword keyword;

		Type() {
			this.keyword = new Keyword(name().toLowerCase());
		}

		@Override
		public Keyword getKeyword() {
			return keyword;
		}

	}

}