class Biblioteca{
	private String nume, adresa;
	private String[] titluri_carti = new String[200];
	private int nr_carti = 0;
	
	public Biblioteca(String n, String a) {
		nume = n;
		adresa = a;
	}
	public boolean adauga(String s) {
		if(nr_carti == titluri_carti.length) return false;
		titluri_carti[nr_carti] = s;
		nr_carti++;
		return true;
	}
	public String toString() {
		String s = nume + " " + adresa + ": ";
		for(int i = 0; i < nr_carti - 1; ++i) {
			s = s + titluri_carti[i] + " - ";
		}
		return s + titluri_carti[nr_carti - 1];
	}
	public void actualizeaza(Biblioteca b) {
		boolean exista = false, ok = true;
		for(int i = 0; i < b.nr_carti; ++i) {
			exista = true;
			for(int j = 0; j < this.nr_carti; ++j) {
				if(this.titluri_carti[j].equals(b.titluri_carti[i])){
					exista = false;
					break;
				}
			}
			if (exista == true) {
				ok = this.adauga(b.titluri_carti[i]);
			}
		}
	}
}

class main{
	public static void main(String argv []) {
		Biblioteca b1, b2;
		b1 = new Biblioteca("Nr1", "nr1");
		b2 = new Biblioteca("Nr2", "nr2");
		
		b1.adauga("carte1");
		b1.adauga("carte2");
		b1.adauga("carte3");
		
		b2.adauga("carte1");
		b2.adauga("carte2");
		b2.adauga("carte10");
		b2.adauga("carte11");
		b2.adauga("carte12");
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.actualizeaza(b2);
		System.out.println(b1);
	}
}