package blitz.language;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import blitz.language.parse.SyntaxManager;

class Parser {

	private final Script script;
	private final BufferedReader reader;

	private static final SyntaxManager syntaxManager = new SyntaxManager();

	Parser(Script script) throws FileNotFoundException {
		this.script = script;
		this.reader = new BufferedReader(new FileReader(script.getFile()));
	}

	static {
		for (Component.Type type : Component.Type.values()) {
			Component component = type.createComponent();
			syntaxManager.register(component.getKeyword(), component);
		}
	}

	Script getScript() {
		return script;
	}

	String readLine() throws IOException {
		return reader.readLine();
	}

	void parseLine() throws IOException {
		String line;
		while ((line = readLine()) != null) {
			syntaxManager.search(line.split(" ")[0]);
		}
	}

}