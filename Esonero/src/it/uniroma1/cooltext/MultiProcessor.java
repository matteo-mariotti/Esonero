package it.uniroma1.cooltext;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe che permette di applicare più "etichette" contemporaneamente
 * 
 * @author matte
 *
 */
public class MultiProcessor extends Processor {

	/**
	 * List dei processor da applicare
	 */
	private List<Processor> listaOperazioni = new ArrayList<>();

	/**
	 * Permette di costruire la lista dei processor da applicare
	 * 
	 * @param operazioni Lista dei processo da applicare
	 */
	public MultiProcessor(Processor... operazioni) {
		for (Processor p : operazioni)
			listaOperazioni.add(p);
	}

	/**
	 * Applica, uno ad uno, i processor richiesti
	 */
	@Override
	public void process(Post p) {
		for (Processor proc : listaOperazioni)
			proc.process(p);
	}

}
