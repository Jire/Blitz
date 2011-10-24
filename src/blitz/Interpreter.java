package blitz;

import java.util.BitSet;

import blitz.EnvironmentFactory.InterpreterOption;

public final class Interpreter {

	private final BitSet options = new BitSet();

	boolean optionEnabled(InterpreterOption option) {
		return options.get(option.ordinal());
	}

	void enableOption(InterpreterOption option) {
		options.set(option.ordinal(), true);
	}

}