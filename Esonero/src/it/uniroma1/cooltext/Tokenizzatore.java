package it.uniroma1.cooltext;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe che espone un metodo per "tokenizzare" delle stringhe
 * 
 * @author matte
 *
 */
public class Tokenizzatore {

	/**
	 * Tokenizza la stringa passata in input
	 * 
	 * @param testo Stringa da "tokenizzare"
	 * @return Lista contenente i token
	 */
	public static List<Token> tokenize(String testo) {
		List<Token> tList = new ArrayList<>();
		// Scorro le parole dopo che i tab sono stati sostituiti da spazi ed e la
		// stringa è stata trasformata in un array con split
		for (String s : testo.replace("\t", " ").split(" "))
			// La aggiungo come token sono se la parola non è vuota
			if (s.trim() != "")
				tList.add(new Token(s.trim()));
		return tList;
	}

}
