package it.uniroma1.cooltext;

/**
 * Non modificabile!!!
 **/
public class CoolText {
	private Post post;

	public CoolText(Post post) {
		this.post = post;
	}

	public void run() {
		MultiProcessor mp = new MultiProcessor(new HashtagProcessor(), new LinkProcessor(), new UppercaseProcessor());
		mp.process(post);
	}

	public static void main(String[] args) {
		Post post = new Post("#jdk15 #Upper Sto [[imparare|imparando]] a\t#[[Programmare]] \t  in #java"); //Programmare

		for (Token t : post)
			System.out.println(t);

		new CoolText(post).run();

		for (Token t : post)
			System.out.println(t);
	}
}
