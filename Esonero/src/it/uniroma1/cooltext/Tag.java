package it.uniroma1.cooltext;

/**
 * Classe che modella una generica etichetta
 * 
 * @author matte
 *
 */
public abstract class Tag {

	/**
	 * Stringa da stampare vicino al token che identifica il tipo di token
	 */
	protected final String label;

	/**
	 * Costruttore del generico tag
	 * 
	 * @param label Etichetta da stampare accanto al token
	 */
	public Tag(String label) {
		this.label = label;
	}

	@Override
	public abstract String toString();

}
