package it.uniroma1.cooltext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Classe che modella un generico post
 * 
 * @author matte
 *
 */
public class Post implements Iterable<Token> {

	/**
	 * Lista contenente il post suddiviso in {@link it.uniroma1.cooltext.Token}
	 */
	private List<Token> tokenList = new ArrayList<>();

	/**
	 * Costruttore di un post
	 * 
	 * @param post Stringa contenente il post formattato
	 */
	public Post(String post) {
		//Divido la stringa in token
		tokenList = Tokenizzatore.tokenize(post);
	}

	/**
	 * Restituisce un iterator per il post
	 */
	@Override
	public Iterator<Token> iterator() {
		return new Iterator<>() {

			/**
			 * Indice della posizione attuale nella lista di Token
			 */
			private int index;

			/**
			 * Controlla se la lista ha ancora un elemento o meno
			 */
			@Override
			public boolean hasNext() {
				return index < tokenList.size();
			}

			/**
			 * Fornisce il prossimo elemento della lista
			 */
			@Override
			public Token next() {
				return tokenList.get(index++);
			}
		};
	}
}
