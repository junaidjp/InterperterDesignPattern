package com.willcode4coffee.interpreter.design;

/**
 * 
 * @author junaidpasha
 *
 */
public class EnglishToSpanishInterpreter  implements Expression {

	private String message;
	
	
	public EnglishToSpanishInterpreter(String message) { 
		
		this.message = message;
	}
	
	
		public String intrepretMessage(LanguageInterpreter languageintrepreter) {
		String translatedMessage = languageintrepreter.translateEnglishtoSpanish(this.message);
		return translatedMessage ;
	}
}
