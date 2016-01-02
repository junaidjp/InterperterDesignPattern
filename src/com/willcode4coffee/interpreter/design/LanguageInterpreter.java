package com.willcode4coffee.interpreter.design;

public class LanguageInterpreter {
	
	
	public String translateSpanishToEnglish(String sentence) { 
		
		if(sentence.equalsIgnoreCase("Bienvenido a XYZ Aerolíneas")) { 
			 
			return "Welcome to XYZ Airlines";
		}
		else if(sentence.equalsIgnoreCase("Disfruta tu vuelo")) { 
			return "Enjoy your Flight";
		}
		else if(sentence.equalsIgnoreCase("Gracias por Reserva con XYZ Aerolíneas")) { 
			return "Thanks for Booking with XYZ Airlines";
		}
		
		return "Welcome to XYZ Airlines";
	}
	
	
	public String translateEnglishtoSpanish(String sentence) { 
		
		if(sentence.equalsIgnoreCase("Welcome to XYZ Airlines")) { 
			 
			return "Bienvenido a XYZ Aerolíneas";
		}
		else if(sentence.equalsIgnoreCase("Enjoy your Flight")) { 
			return "Disfruta tu vuel";
		}
		else if(sentence.equalsIgnoreCase("Thanks for Booking with XYZ Airlines")) { 
			return "Gracias por Reserva con XYZ Aerolíneas";
		}
		return "Bienvenido a XYZ Aerolíneas";
	}

}
