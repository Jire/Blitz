package blitz.language;

public class Data {

	private final Type type;
	private final Object value;

	Data(Type type, Object value) {
		this.type = type;
		this.value = value;
	}

	Object getValue() {
		return type.convert(value);
	}

	public static enum Type {

		SWITCH(boolean.class),
		SMALL(short.class),
		INTEGER(int.class),
		BIG(long.class),
		DECIMAL(double.class),
		TEXT(String.class);

		private final Class<?> clazz;

		Type(Class<?> clazz) {
			this.clazz = clazz;
		}

		Class<?> getClazz() {
			return clazz;
		}

		String keyword() {
			return name().toLowerCase();
		}

		/**
		 * Converts an object value to the data type.
		 * @param value The object to cast.
		 * @return The object casted as the value.
		 */
		Object convert(Object value) {
			return clazz.cast(value);
		}

		/**
		 * @deprecated Replaced by local type casting found in {@link #convert(Object)}
		 */
		@Deprecated
		static Object convertToType(Object value, Type type) {
			switch (type) {
			case SWITCH:
				return (boolean) value;
			case SMALL:
				return (short) value;
			case INTEGER:
				return (int) value;
			case BIG:
				return (long) value;
			case DECIMAL:
				return (double) value;
			default:
				return null;
			}
		}

	}

}