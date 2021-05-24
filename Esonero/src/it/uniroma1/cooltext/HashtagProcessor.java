package it.uniroma1.cooltext;

/**
 * Processa i token di tipo Hashtag
 * 
 * @author matte
 *
 */
public class HashtagProcessor extends Processor {
	/**
	 * Analizza i token del post e etichetta quelli che iniziano con #, eliminando
	 * poi il simbolo #
	 */
	@Override
	public void process(Post p) {
		for (Token t : p)
			// Controllo se il token è un Hashtag (inizia con #)
			if (t.getTesto().startsWith("#")) {
				// Aggiungo il tag al token
				t.addTag(new HashTag());
				// Aggiorno il testo rimuovendo il simbolo #
				t.setTesto(t.getTesto().substring(1));
			}
	}

}