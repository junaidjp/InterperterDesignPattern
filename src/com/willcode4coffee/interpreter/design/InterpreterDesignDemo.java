package com.willcode4coffee.interpreter.design;

public class InterpreterDesignDemo {
	
	
	public LanguageInterpreter languageinterpreter;
	
	
	
	public InterpreterDesignDemo(LanguageInterpreter intrepreter) { 
		this.languageinterpreter = intrepreter;
	}
	
	
	public String interpretSpanishToEnglish(String message) { 
		
		System.out.println("Original Message is  :  " +message);
		System.out.println("                           ");
		Expression spanishToEnglishInterpreter = new SpanishToEnglishInterpreter(message);
		String translateMessage = spanishToEnglishInterpreter.intrepretMessage(languageinterpreter);
		System.out.println("                           ");
		return translateMessage;
		
	}
	
	
	
public String interpretEnglishtoSpanish(String message) { 
		
	System.out.println("Original Message is  :  " +message);
	System.out.println("                           ");
	Expression englishToSpanishIntrepreter = new EnglishToSpanishInterpreter(message);
	String translateMessage = englishToSpanishIntrepreter.intrepretMessage(languageinterpreter);
	
	return translateMessage;
		
		
}




public static void main(String args[]) { 
	
			String englishMessage = "Welcome to XYZ Airlines";
			
			String spanishMessage = "Gracias por Reserva con XYZ Aerolíneas";
			
			InterpreterDesignDemo clientDemo = new InterpreterDesignDemo(new LanguageInterpreter());
			
			String translateMessage = clientDemo.interpretEnglishtoSpanish(englishMessage);
			System.out.println("Spanish Intrepreter Translates to  " +translateMessage);
			System.out.println("                           ");
			String translateSpanishMessage = clientDemo.interpretSpanishToEnglish(spanishMessage);
			System.out.println("English Intrepreter Translates to  " +translateSpanishMessage);
			
		
			
}
}
