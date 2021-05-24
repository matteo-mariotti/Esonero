package it.uniroma1.cooltext;

/**
 * Classe che modella un generico processor
 * 
 * @author matte
 *
 */
public abstract class Processor {

	/**
	 * Svolge il compito designato sul post di input
	 * 
	 * @param p Post su cui eseguire l'operazione
	 */
	public abstract void process(Post p);

}
