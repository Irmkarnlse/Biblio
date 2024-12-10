package Bib;

public class Buch {
	private static int nextId = 0;
	private int id;
	private String titel;
	private String autor;
	private String erscheinJahr;
	private String isbn;
	private String leihDatum;

	public Buch(String titel, String autor, String erscheinJahr, String isbn) {
		this.id = nextId++;
		this.titel = titel;
		this.autor = autor;
		this.erscheinJahr = erscheinJahr;
		this.isbn = isbn;
	}

	public int getId() {
		return this.id;
	}

	public String getTitel() {
		return this.titel;
	}

	public String getAutor() {
		return this.autor;
	}

	public String getErscheinJar() {
		return this.erscheinJahr;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public String leihDatum() {
		return this.leihDatum;
	}

	public boolean istGeliehen() {
		return this.leihDatum() != null;
	}

	public void leihen(String datum) {
		this.leihDatum = datum;
	}

	public void zurueckgeben() {
		this.leihDatum = null;
	}
}
