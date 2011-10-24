package blitz.language;

import java.io.File;

public class Script {

	private final File file;

	private final KeywordRegistry keywordRegistry = new KeywordRegistry();
	private final DataRegistry dataRegistry = new DataRegistry();

	Script(File file) {
		this.file = file;
	}

	Script(String filePath) {
		this(new File(filePath));
	}

	protected File getFile() {
		return file;
	}

	KeywordRegistry getKeywordRegistry() {
		return keywordRegistry;
	}

	DataRegistry getDataRegistry() {
		return dataRegistry;
	}

	public static Script getScript(File file) {
		return new Script(file);
	}

	public static Script getScript(String filePath) {
		return new Script(filePath);
	}

}