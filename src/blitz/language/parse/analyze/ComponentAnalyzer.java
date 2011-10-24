package blitz.language.parse.analyze;

import blitz.language.Component;

interface ComponentAnalyzer {

	Component.Type analyze(String line);

}