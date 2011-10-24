package blitz.language;

class Loop extends Registry<Task> {

	static enum Type implements Component {

		FOR,
		WHILE;

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