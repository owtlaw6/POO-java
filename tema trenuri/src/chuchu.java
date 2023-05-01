class Tren{
	private Vagon vags[] = new Vagon[15];
	private int nrvags;
	
	public Tren(Vagon[] v, int nrv) {
		nrvags = nrv;
		vags = v;
	}
	
	public int getSumColete(Tren t) {
		int sum = 0;
		for(int i = 0; i < t.nrvags; ++i) {
			sum += t.vags[i].getNrColete();
		}
		return sum;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Tren) {
			Tren t = (Tren) o;
			int sum1 = getSumColete(this);
			int sum2 = getSumColete(t);
			if(sum1 == sum2) return true;
		}
		return false;
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < this.nrvags; ++i) {
			s += this.vags[i].toString();
		}
		return s;
	}
	
}

abstract class Vagon{
	public abstract int getNrColete();
}

abstract class Calatori extends Vagon{
	public abstract int getNrPasageri();
	public abstract void deschideUsi();
	public abstract void inchideUsi();
}

class CalatoriA extends Calatori{
	public int getNrColete() {
		return 300;
	}
	public int getNrPasageri() {
		return 40;
	}
	public void deschideUsi() {
		System.out.println("Usile sunt deschise");
	}
	public void inchideUsi() {
		System.out.println("Usile sunt inchise");
	}
	public String toString() {
		return "CalatoriA ";
	}
}

class CalatoriB extends Calatori{
	public int getNrColete() {
		return 400;
	}
	public int getNrPasageri() {
		return 50;
	}
	public void deschideUsi() {
		System.out.println("Usile sunt deschise");
	}
	public void inchideUsi() {
		System.out.println("Usile sunt inchise");
	}
	public void blocareGeamuri() {
		System.out.println("Geamurile sunt blocate");
	}
	public String toString() {
		return "CalatoriB ";
	}
}

class Marfa extends Vagon{
	public int getNrColete() {
		return 400;
	}
	public String toString() {
		return "Marfa ";
	}
}

/*class ceva{
	private int a, b;
	public ceva(int a, int b) {
		ceva orice = new ceva(a, b, this);
	}
	private ceva(int a, int b, ceva c) {
		c.a = a;
		c.b = b;
	}
	public int geta() { return a; }
	public int getb() { return b; }
}*/

class chuchu{
	public static void main(String argv []) {
		/*ceva v = new ceva(1, 4);
		System.out.println(v.geta());
		System.out.println(v.getb());*/
		
		Vagon cc = new CalatoriB();
		Vagon[] v1 = new Vagon[] {new CalatoriB(), new CalatoriA(), cc};
		Vagon[] v2 = new Vagon[4];
		v2[0] = cc;
		v2[1] = new CalatoriA();
		Tren t = new Tren(v2, 2);
		
	}
}