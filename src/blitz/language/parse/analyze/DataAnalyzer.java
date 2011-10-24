package blitz.language.parse.analyze;

import blitz.language.Component.Type;
import blitz.language.Data;

public final class DataAnalyzer implements ComponentAnalyzer {

	@Override
	public Type analyze(String line) {
		String[] pieces = line.split(" ");

		Data.Type type = Data.Type.valueOf(pieces[0].toUpperCase());

		if (type == null) {
			return null;
		}

		/*
		 * The data test passed: A matching
		 * defined type of data was found.
		 */

		return Type.DATA;
	}

}