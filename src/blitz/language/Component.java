package blitz.language;

public interface Component {

	Keyword getKeyword();

	/*
	 * Although the visibility of this
	 * method's implementation must be
	 * public, this interface itself is
	 * not, hence the nor is the keyword.
	 */

	public static enum Type {

		DATA(Data.class),
		PROCEDURE(Procedure.class),
		LOOP(Loop.class);

		private final Class<?> clazz;

		Type(Class<?> clazz) {
			this.clazz = clazz;
		}

		Component createComponent() {
			try {
				return (Component) clazz.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
			return null;
		}

	}

}