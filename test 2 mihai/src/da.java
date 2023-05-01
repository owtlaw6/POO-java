abstract class Produs{
	private String nume;
	protected double pret;
	
	public Produs(String s, double p){
		nume = s;
		pret = p;
	}
	
	public abstract void aplicaReducere(double procent);
}

class Imbracaminte extends Produs{
	private String material;
	
	public Imbracaminte(String s, double p, String m){
		super(s, p);
		material = m;
	}
	public void aplicaReducere(double procent) {
		if(procent >= 1 || procent <= 0) {
			System.out.println("procentul reducerii nu este bun");
		}
		else if (procent >= 0.95)
			pret = pret - 0.95 * pret;
		else pret = pret - procent * pret;
	}
	public String toString() {
		return material;
	}
}

class Electronic extends Produs{
	private boolean resigilat;
	
	public Electronic(String s, double p, boolean m){
		super(s, p);
		resigilat = m;
	}
	public void aplicaReducere(double procent) {
		if(procent >= 1 || procent <= 0) {
			System.out.println("procentul reducerii nu este bun");
		}
		else if (procent + 0.2 >= 0.95)
			pret = pret - 0.95 * pret;
		else pret = pret - (0.2 + procent) * pret;
	}
	public String toString() {
		return "" + resigilat;
	}
}

class Magazin{
	private Produs produse[] = new Produs[1024];
	private int nr = 0;
	
	public void adaugaProdus(Produs p) {
		if (nr == 1024) {
			System.out.println("nu e loc");
		}
		else {
			produse[nr] = p;
			nr++;
		}
	}
	
	public void reducereBF(double procent) {
		if(procent >= 1 || procent <= 0) {
			System.out.println("procentul reducerii nu este bun");
		}
		else {
			for(int i = 0; i < nr; ++i) {
				produse[i].aplicaReducere(procent);
			}
		}
	}
}

