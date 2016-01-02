package com.willcode4coffee.interpreter.design;

public class SpanishToEnglishInterpreter implements Expression {

	private String message;
	
	public SpanishToEnglishInterpreter(String message) { 
		this.message = message;
	}
	
	
		public String intrepretMessage(LanguageInterpreter languageintrepreter) {
		String translatedMessage = languageintrepreter.translateSpanishToEnglish(this.message);
		return translatedMessage ;
	}
	
	

}
