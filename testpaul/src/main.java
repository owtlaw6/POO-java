class Nota{
	private int valoare;
	private String materia;
	
	public Nota(int v, String m){
		valoare = v;
		materia = m;
	}
	public int getValoare() {
		return this.valoare;
	}
	public String getMateria() {
		return this.materia;
	}
}

class Carnet{
	private String nume;
	private Nota[] note = new Nota[256];
	private int nr_note = 0;
	
	public Carnet(String n) {
		nume = n;
	}
	public boolean adaugaNota(int v, String s) {
		if(nr_note == note.length) return false;
		note[nr_note] = new Nota(v, s);
		nr_note++;
		return true;
	}
	public float medieMaterie(String disciplina) {
		float m = 0;
		int count = 0;
		String s;
		for (int i = 0; i < nr_note; ++i) {
			s = note[i].getMateria();
			if(disciplina.equals(s)) {
				m += note[i].getValoare();
				count++;
			}
		}
		if(count > 0) return m/count;
		return 0;
	}
	public float medieTotal() {
		float m = 0;
		int count = 0;
		for (int i = 0; i < nr_note; ++i) {
			m += note[i].getValoare();
			count++;
		}
		if(count > 0) return m/count;
		return 0;
	}
	public String toString() {
		String s = nume + "\n";
		for(int i = 0; i < nr_note; ++i) {
			s = s + note[i].getMateria() + " " + note[i].getValoare() + "\n";
		}
		return s + "Medie totala " + this.medieTotal();
	}
}

class main{
	public static void main(String argv []) {
		Carnet c = new Carnet("Ion");
		c.adaugaNota(5, "poo");
		c.adaugaNota(10, "poo");
		c.adaugaNota(8, "ptdm");
		
		float m;
		m = c.medieMaterie("poo");
		System.out.println(m);
		m = c.medieMaterie("ptdm");
		System.out.println(m);
		m = c.medieTotal();	
		System.out.println(m);
		System.out.println();
		System.out.println(c);
		
		//int a = 50;
		//System.out.println(a/0);
		System.out.println();
		//System.out.println("ceva" + "\b" + " ");
		String s = "ceva";
		//s[s.length() - 1] = '\n';
		s = s.substring(0, s.length() - 1);
		System.out.println(s);
		
		///System.out.println(s[1]);
		//char[] a;
		//char[] b;
	}
}



