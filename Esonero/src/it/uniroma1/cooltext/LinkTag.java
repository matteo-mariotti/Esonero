package it.uniroma1.cooltext;

/**
 * Classe che modella i token di tipo link
 * 
 * @author matte
 *
 */
public class LinkTag extends Tag {

	/**
	 * Stringa da stampare
	 */
	private static final String l = "LINK";

	/**
	 * Nome visualizzato del link
	 */
	private String nome;
	/**
	 * Link al quale si viene reindirizzati cliccando sul nome
	 */
	private String link;

	/**
	 * Costruttore della classe
	 * 
	 * @param nome Nome del link
	 * @param link Collegamento ipertestuale
	 */
	public LinkTag(String nome, String link) {
		super(l);
		this.nome = nome;
		this.link = link;
	}

	/**
	 * Override del metodo toString di {@link Object}
	 */
	@Override
	public String toString() {
		return super.label + "=" + link + ":" + nome;
	}

}
