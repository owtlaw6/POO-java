import java.util.Scanner;
import java.util.Random;

class Telefon{
	private String nume_proprietar;
	private String[] nume_apelanti = new String[100];
	private int nr_apelanti = 0;
	public Telefon(String s) {
		nume_proprietar = s;
	}
	public boolean apeleaza(Telefon t) {
		if(t.nr_apelanti == 100) return false;
		t.nume_apelanti[t.nr_apelanti] = this.nume_proprietar;
		t.nr_apelanti++;
		return true;
	}
	public Integer numarApeluri(String s) {
		Integer count = new Integer(0);
		for(int i = 0; i < nr_apelanti; ++i) {
			if(s.equals(nume_apelanti[i]))
				count++;
		}
		return count;
	}
	public String toString() {
		String s = "Proprietar: " + nume_proprietar + "\n";
		for (int i = 0; i < nr_apelanti; ++i) {
			s = s + nume_apelanti[i] + "\n";
		}
		return s;
	}
}

class tema4{
	public static void main(String argv []) {
		int nr_telefoane;
		Scanner scanner = new Scanner(System.in);
		nr_telefoane = Integer.parseInt(scanner.nextLine());	
		Telefon[] t = new Telefon[nr_telefoane];
		for (int i = 0; i < nr_telefoane; ++i) {
			t[i] = new Telefon(scanner.nextLine());
		}
		System.out.println("Citeste numarul de apeluri si proprietarul: ");
		int A, x, y;
		A = Integer.parseInt(scanner.nextLine());
		Random random = new Random();
		for (int i = 0; i < A; ++i) {
			x = random.nextInt(nr_telefoane);
			y = random.nextInt(nr_telefoane);
			while(x == y){
				y = random.nextInt(nr_telefoane);
			}
			t[x].apeleaza(t[y]);
		}
		String s = scanner.nextLine();
		System.out.println();
		for (int i = 0; i < nr_telefoane; ++i) {
			System.out.print(t[i]);
			System.out.println("Nr apeluri: " + t[i].numarApeluri(s) + "\n");
		}
		scanner.close();
	}
}


