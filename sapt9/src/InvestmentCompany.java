abstract class Project implements Risky{
	private String titlu;
	private String obiectiv;
	private long fonduri;
	private Member manager;
	protected int nr_members = 0;
	protected Member[] ms;
	
	public Project(Member m, String t, String o, long f) {
		manager = m;
		titlu = t;
		obiectiv = o;
		fonduri = f;
	}
	public long getFonduri() {
		return this.fonduri;
	}
	public abstract void addMember(Member m);
	public int getNrMembers() {
		return this.nr_members;
	}
	public String getTitlu(){
		return this.titlu;
	}
	public String toString() {
		return this.titlu + " " + this.obiectiv;
	}
}
	
class Member{
	private int varsta;
	private String nume;
	
	public Member(int v, String n) {
		varsta = v;
		nume = n;
	}
}

abstract class ComercialeSiMilitare extends Project{
	private String deadline;
	private final int maxim = 15;
	public ComercialeSiMilitare(Member m, String t, String o, long f, String d){
		super(m, t, o, f);
		deadline = d;
	}
	public void addMember(Member m) {
		if(this.nr_members == maxim) System.out.println("Nu se mai pot adauga membri\n");
		else {
			Member aux[] = new Member[nr_members + 1];
			for (int i = 0; i < nr_members; ++i) 
	              aux[i] = ms[i]; 
			aux[nr_members] = m;
			ms = aux;
			this.nr_members++;
		}
	}
}

class Comerciale extends ComercialeSiMilitare{
	private long fonduri_marketing;
	private int nr_echipe;
	
	public Comerciale(Member m, String t, String o, long f, String d, int ne){
		super(m, t, o, f, d);
		fonduri_marketing = f/2;
		if(nr_echipe > 14) {
			nr_echipe = 14;
		}
		else nr_echipe = ne;
	}
	public double getRisk() {
		double d = nr_echipe * 3 / this.getNrMembers() / (this.getFonduri() - fonduri_marketing);
		return d;
	}
}
	
class Militare extends ComercialeSiMilitare{
	private String parola;
	
	public Militare(Member m, String t, String o, long f, String d, String p){
		super(m, t, o, f, d);
		parola = p;
	}
	public double getRisk() {
		double d = this.getNrMembers() / parola.length() / this.getFonduri();
		return d;
	}
}

class OpenSource extends Project{
	private String mails;
	
	public OpenSource(Member m, String t, String o, long f, String mm){
		super(m, t, o, f);
		mails = mm;
	}
		public void addMember(Member m) {
			Member aux[] = new Member[nr_members + 1];
			for (int i = 0; i < nr_members; ++i) 
	              aux[i] = ms[i]; 
			aux[nr_members] = m;
			ms = aux;
			this.nr_members++;
		}
	public double getRisk() {
		double d = this.getNrMembers() / this.getFonduri();
		return d;
	}
}

interface Risky{
	public double getRisk();
}

class InvestmentCompany{
	private static int nr_proiecte = 0;
	private static Project ps[];
	
	public static void addProject(Project p) {
		Project aux[] = new Project[nr_proiecte + 1];
		for (int i = 0; i < nr_proiecte; ++i) 
              aux[i] = ps[i]; 
		aux[nr_proiecte] = p;
		ps = aux;
		nr_proiecte += 1;
	}
	public static Project getBestInvestment() {
		if (nr_proiecte == 0) {
			System.out.println("Nu exista proiecte");
			return null;
		}
		Project aux = ps[0];
		for(int i = 1; i < nr_proiecte; ++i) {
			if(aux.getRisk() > ps[i].getRisk()) {
				aux = ps[i];
			}	
		}
		return aux;
	}
	
	public static void main(String args[]) {
		Member m1 = new Member(30, "ion");
		Member m2 = new Member(40, "ioan");
		Member m3 = new Member(50, "ioana");
		Member m4 = new Member(60, "ioanaa");
		Member m5 = new Member(70, "ioaanaa");
		Member m6 = new Member(80, "ioaannaa");
		Member m7 = new Member(90, "iooaannaa");
		Project p1 = new Militare(m1, "militar1", "ceva", 100, "10dec", "123456789");
        Project p2 = new OpenSource(m2, "opensrc1", "altceva", 200000, "oameni");
        Project p3 = new Comerciale(m3, "comercial1", "de toate", 300, "12dec", 40000);
		p1.addMember(m4);
		p1.addMember(m5);
		p2.addMember(m6);
		p3.addMember(m7);
		addProject(p1);
		addProject(p2);
		addProject(p3);
		Project best;
		best = getBestInvestment();
		System.out.println(best.getTitlu());
		
	}
}

