class Remorca{
	private int nr_cutii;
	private String inmatriculare;
	private static int ultimul_numar = 9;
	public Remorca(int nr, String s) {
		nr_cutii = nr;
		inmatriculare = s;
		Remorca.ultimul_numar = nr;
	}
	public Remorca(String s) {
		Remorca.ultimul_numar += 1;
		nr_cutii = Remorca.ultimul_numar;
		inmatriculare = s;
	}
	public int getNrCutii() {
		return this.nr_cutii;
	}
	public String getInmatriculare() {
		return this.inmatriculare;
	}
}

class Tir{
	private int nr_remorci = 0;
	private Remorca[] remorci = new Remorca[5];
	public boolean adaugaRemorca(int nr, String s) {
		if (this.nr_remorci == 5)
			return false;
		Remorca r = new Remorca(nr, s);
		remorci[nr_remorci] = r;
		nr_remorci += 1;
		return true;
	}
	public boolean adaugaRemorca(Remorca r) {
		if (this.nr_remorci == 5)
			return false;
		remorci[nr_remorci] = r;
		nr_remorci += 1;
		return true;
	}
	public Remorca stergeRemorca(String s) {
		for(int i = 0; i < nr_remorci; i++) {
			if((remorci[i].getInmatriculare()).equals(s)) {
				Remorca aux = remorci[i];
				for(int j = i; j < nr_remorci - 1; j++) {
					remorci[j] = remorci[j + 1];
				}
				nr_remorci -= 1;
				return aux;
			}
		}
		return null;
	}
	public boolean equals(Object o) {
		if (o instanceof Tir) {
			Tir t = (Tir) o;
			int suma1 = 0, suma2 = 0;
			for(int i = 0; i < this.nr_remorci; i++) {
				suma1 += remorci[i].getNrCutii();
			}
			for(int i = 0; i < t.nr_remorci; i++) {
				suma2 += t.remorci[i].getNrCutii();
			}
			if(suma1 == suma2) return true;
			return false;
		}
		return false;
	}
	public String toString() {
		String s = "T ";
		for(int i = 0; i < this.nr_remorci; ++i) {
			s += "-> R(";
			s += this.remorci[i].getInmatriculare() + " " + this.remorci[i].getNrCutii();
			s += ") ";
		}
		return s;
	}
}

class tema3{
	public static void main(String argv []) {
		Tir t1 = new Tir(), t2 = new Tir(), t3 = new Tir();
		t1.adaugaRemorca(15, "TM15DVA");
		t1.adaugaRemorca(1, "TM72DVA");
		t2.adaugaRemorca(new Remorca("GJ70RME"));
		System.out.println(t1);
		System.out.println(t2);
		Remorca r1 = t1.stergeRemorca("TM15DVA");
		System.out.println(t1);
		if(t1.equals(t2)) System.out.println("da, sunt egale");
		else System.out.println("NU, nu sunt egale");
		t3.adaugaRemorca(1, "TM72DVA");
		if(t1.equals(t3)) System.out.println("da, sunt egale");
		else System.out.println("NU, nu sunt egale");
		t1.adaugaRemorca(r1);
		System.out.println(t1);
		t1.adaugaRemorca(r1);
		t1.adaugaRemorca(r1);
		t1.adaugaRemorca(new Remorca("GJ70RME"));
		System.out.println(t1);
		t1.adaugaRemorca(r1);
		
		System.out.println(t1);
	}
}






