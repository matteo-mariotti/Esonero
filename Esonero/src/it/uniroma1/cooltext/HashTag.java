package it.uniroma1.cooltext;

/**
 * Classe che modella il tag HASH
 * 
 * @author matte
 *
 */
public class HashTag extends Tag {

	/**
	 * Stringa da stampare
	 */
	private static final String l = "HASH";

	/**
	 * Costruttore
	 */
	public HashTag() {
		super(l);
	}

	/**
	 * Override del metodo toString di {@link Object}
	 */
	@Override
	public String toString() {
		return super.label;
	}

}
