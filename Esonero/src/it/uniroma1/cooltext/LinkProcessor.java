package it.uniroma1.cooltext;

/**
 * Processa i token di tipo link
 * 
 * @author matte
 *
 */
public class LinkProcessor extends Processor {

	/**
	 * Analizza tutti i token e, su quelli di tipo link, aggiunge una etichetta
	 */
	@Override
	public void process(Post p) {
		for (Token t : p) {
			String testo = t.getTesto();
			// Controllo se sono in presenza di un link
			if (testo.startsWith("[[") && testo.endsWith("]]")) {
				// Diviso il link in due (se contiene sia testo che link) altrimenti in una
				// soltanto, dopo aver rimosso le parentesi quadre
				String[] divisione = testo.replace("]]", "").replace("[[", "").split("\\|");
				testo = divisione[0];
				//Gestisco il caso in cui il link sia vuoto
				if (testo.isEmpty()) testo = " ";
				// Sulla base di come è strutturato il link aggiorno i tag
				if (divisione.length > 1)
					addLinkTag(divisione[1], testo, t);
				else
					addLinkTag(testo, testo, t);
			}
		}

	}

	/**
	 * Aggiunge il linkTag al token
	 * 
	 * @param testo Testo del link
	 * @param link  Indirizzo del link
	 * @param t     Token da aggiornare
	 */
	private void addLinkTag(String testo, String link, Token t) {
		// Aggiorno il testo
		t.setTesto(testo);
		// Aggiungo il tag
		t.addTag(new LinkTag(testo, link));
	}

}
