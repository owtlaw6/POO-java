class Fisier{
	private String nume, continut;
	private int id = 0, nr_concatenari = 0;
	private static int code = 1;
	Fisier anterior;
	public Fisier(String n, String c) {
		nume = n;
		continut = c;
		id = code;
		code++;
		anterior = null;
	}
	private void salveazaVersiune() {
		Fisier aux = new Fisier(this.nume + "bak", this.continut);
		aux.anterior = null;
		this.anterior = aux;
	}
	public void concateneaza(Fisier f) {
		this.salveazaVersiune();
		this.continut += f.continut;
		nr_concatenari++;
	}
	public String toString() {
		String s = id + " " + nume + " " + continut + "\n";
		if (anterior != null)
			return s + anterior.toString();
		return s;
	}
	public int numarConcatenari() {
		return nr_concatenari;
	}
}

class tema2{
	public static void main(String argv []) {
		Fisier a = new Fisier("PrimulFisier", "programare ");
		Fisier b = new Fisier("AlDoileaFisier", "orientata ");
		System.out.print(a);
		System.out.println(b);
		a.concateneaza(b);
		System.out.println(a);
		Fisier c = new Fisier("AlTreileaFisier", "pe obiecte ");
		System.out.println(c);
		a.concateneaza(c);
		System.out.println(a);
		System.out.println("Nr concatenari pentru fisierul a: " + a.numarConcatenari());
		System.out.println("Nr concatenari pentru fisierul b: " + b.numarConcatenari());
	}
}