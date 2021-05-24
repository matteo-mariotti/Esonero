package it.uniroma1.cooltext;

/**
 * Classe che modella l'etichetta UPPER
 * 
 * @author matte
 *
 */
public class UpperTag extends Tag {

	/**
	 * Stringa da stampare
	 */
	private static final String l = "UPPER";

	/**
	 * Costruttore
	 */
	public UpperTag() {
		super(l);
	}

	/**
	 * Fornisce una rappresentazione sotto forma di stringa dell'etichetta
	 */
	@Override
	public String toString() {
		return super.label;
	}

}
