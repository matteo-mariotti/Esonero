package it.uniroma1.cooltext;

/**
 * Classe che analizza il post ed etichetta tutti i token che iniziano con una
 * maiuscola
 * 
 * @author matte
 *
 */
public class UppercaseProcessor extends Processor {

	/**
	 * Analizza la stringa e aggiunge l'etichetta UPPER se trova un token che inizia
	 * per maiuscola
	 */
	@Override
	public void process(Post p) {
		for (Token t : p)
			// Controllo se la prima lettera del token è maiuscola
			if (Character.isUpperCase(t.getTesto().charAt(0)))
				t.addTag(new UpperTag());
	}

}
