package it.uniroma1.cooltext;

import java.util.ArrayList;

/**
 * Classe che modella un token del post
 * 
 * @author matte
 *
 */
public class Token {

	/**
	 * Testo del token
	 */
	private String testo;
	/**
	 * Lista delle etichette applicate al token
	 */
	private ArrayList<Tag> tag = new ArrayList<>();

	/**
	 * Costruttore di un nuovo token
	 * 
	 * @param testo Testo del token
	 */
	public Token(String testo) {
		this.testo = testo;
	}

	/**
	 * Fornisce una rappresentazione sotto forma di stringa del testo del token con
	 * le sue etichette
	 */
	@Override
	public String toString() {
		// Controllo se il token non ha tag e, di conseguenza restituisco una stringa
		// diversa
		return tag.isEmpty() ? testo : testo + " " + tagList();
	}

	/**
	 * Fornisce una stringa con i tag
	 * 
	 * @return Stringa formattata con i tag del token
	 */
	private String tagList() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < tag.size(); i++) {
			// Per ogni tag ottengo la sua rappresentazione sotto forma di stringa
			sb.append(tag.get(i).toString());
			if (i != tag.size() - 1)
				sb.append("+");
		}
		return sb.toString();
	}

	/**
	 * Getter del testo
	 * 
	 * @return Stringa contenente il testo
	 */
	public String getTesto() {
		return testo;
	}

	/**
	 * Permette di aggiungere un nuovo tag alla lista dei tag
	 * 
	 * @param newTag Nuovo tag da aggiungere
	 */
	public void addTag(Tag newTag) {
		tag.add(newTag);
	}

	/**
	 * Permette di aggiornare il contenuto del testo
	 * 
	 * @param s Nuova testo
	 */
	public void setTesto(String s) {
		testo = s;
	}
}
