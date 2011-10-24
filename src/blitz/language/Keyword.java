package blitz.language;

public final class Keyword {

	private final String domestic;

	Keyword(String domestic) {
		this.domestic = domestic;
	}

	@Override
	public String toString() {
		return domestic;
	}

}