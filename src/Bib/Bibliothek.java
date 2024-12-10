package Bib;

import java.util.ArrayList;

public class Bibliothek {

	private ArrayList<Buch> buecher;
	private String addresse;

	public Bibliothek(ArrayList<Buch> buecher, String addresse) {
		this.buecher = buecher;
		this.addresse = addresse;
	}

	private Buch bucheFinden(int id) {
		for (Buch b : this.buecher) {
			if (b.getId() == id) {
				return b;
			}
		}
		return null;
	}

	public void buchLeihen(int id, String datum) {
		this.buchLeihen(this.bucheFinden(id), datum);
	}

	public void buchLeihen(Buch b, String datum) {
		if (b != null) {
			b.leihen(datum);
		}
	}

	public ArrayList<Buch> getBuecher() {
		return this.buecher;
	}

	public ArrayList<Buch> getVorhandeneBuecher() {
		ArrayList<Buch> vorhanden = new ArrayList<Buch>();
		for (Buch b : this.buecher) {
			if (b.istGeliehen()) {
				vorhanden.add(b);
			}
		}
		return vorhanden;
	}

	public ArrayList<Buch> getGelieheneBuecher() {
		ArrayList<Buch> vorhanden = new ArrayList<Buch>();
		for (Buch b : this.buecher) {
			if (!b.istGeliehen()) {
				vorhanden.add(b);
			}
		}
		return vorhanden;
	}

	public void buchHinzufuegen(String titel, String autor, String erscheinJahr, String isbn) {
		Buch b = new Buch(titel, autor, erscheinJahr, isbn);
		this.buecher.add(b);
	}

	public void buchHinzufuegen(Buch b) {
		this.buecher.add(b);
	}

	public void buchLoeschen(int id) {
		this.buchLoeschen(this.bucheFinden(id));
	}

	public void buchLoeschen(Buch b) {
		this.buecher.remove(b);
	}

	public Buch getBuch(int id) {
		return this.bucheFinden(id);
	}

	public Buch getBuch(String isbn) {
		for (Buch b : this.buecher) {
			if (b.getIsbn() == isbn) {
				return b;
			}
		}
		return null;
	}

	public ArrayList<Buch> getBuecher(String titel) {
		ArrayList<Buch> list = new ArrayList<Buch>();
		for (Buch b : this.buecher) {
			if (b.getTitel() == titel) {
				list.add(b);
			}
		}
		return list;
	}

	public ArrayList<Buch> getBuecherAutor(String autor) {
		ArrayList<Buch> list = new ArrayList<Buch>();
		for (Buch b : this.buecher) {
			if (b.getAutor() == autor) {
				list.add(b);
			}
		}
		return list;
	}
	
	public boolean test(Buch b1) {
		return b1.equals(b1);
	}

}
