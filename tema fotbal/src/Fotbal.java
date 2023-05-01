import java.util.Random;
import java.util.Date;

class CoordinateGenerator{
	private Random r = new Random();
	public int generateX() {
		return r.nextInt(101);
	}
	public int generateY() {
		return r.nextInt(51);
	}
}

/*class CoordinateGenerator {
	private Random randomGenerator;
	public CoordinateGenerator() {
		Date now = new Date();
		long sec = now.getTime();
		randomGenerator = new Random(sec);
	}
	public int generateX() {
		int x = randomGenerator.nextInt(101);
		if(x < 5) {
			x = 0;
		} else if(x > 95) {
			x = 100;
		} else { x = randomGenerator.nextInt(99) + 1; }
		return x;
	}
	public int generateY() {
		int y = randomGenerator.nextInt(101);
		if(y < 5) {
			y = 0;
		} else if(y > 95) {
			y = 50;
		} else { y = randomGenerator.nextInt(49) + 1; }
		return y;
	}
}*/

class Minge{
	private int x, y;
	public Minge(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void suteaza() throws Out, Gol, Corner{
		CoordinateGenerator cg = new CoordinateGenerator();
		x = cg.generateX();
		y = cg.generateY();
		if(y == 0 || y == 50)
			throw new Out();
		else if(x == 0 || x == 100) {
				if (y >= 20 && y <= 30) 
					throw new Gol();
				else throw new Corner();
		}
	}
	
}

class Out extends Exception{
	public Out() {
		super("\nExceptie: Out\n");
	}
}

class Gol extends Exception{
	public Gol() {
		super("\nExceptie: Gol\n");
	}
}

class Corner extends Exception{
	public Corner() {
		super("\nExceptie: Corner\n");
	}
}


class Fotbal{ //Joc{
	
	private String echipa1, echipa2;
	private int goluriEchipa1, goluriEchipa2;
	private int cornere, outuri;
	
	public Fotbal(String s1, String s2){
		echipa1 = s1;
		echipa2 = s2;
	}
	
	public String toString() {
		String s = "Echipa1: " + this.echipa1 + "\nEchipa2: " + this.echipa2;
		s += "Goluri echipa 1: " + this.goluriEchipa1 + "\n"; 
		s += "Goluri echipa 2: " + this.goluriEchipa2 + "\n"; 
		s += "Cornere si outuri: " + this.cornere + ", " + this.outuri + "\n";
		return s;
	}
	
	public void simuleaza() {
		Minge minge = new Minge(50, 25);
		Minge aux = minge;
		for (int i = 1; i <= 1000; ++i) {
			aux = minge;
			try {
				minge.suteaza();
			}
			catch(Out e){
				this.outuri++;
				System.out.println(e.getMessage());
				minge = aux;
			}
			catch(Gol e) {
				if(minge.getX() == 0) this.goluriEchipa2++;
				else this.goluriEchipa1++;
				System.out.println(e.getMessage());
				minge = new Minge(50, 25);
			}
			catch(Corner e) {
				this.cornere++;
				System.out.println(e.getMessage());
				///x == 0 || x == 100) (y >= 20 && y <= 30)
				if(minge.getX() == 0 && minge.getY() < 20)
					minge = new Minge(0, 0);
				else if(minge.getX() == 0 && minge.getY() > 30)
					minge = new Minge(0, 50);
				else if(minge.getX() == 100 && minge.getY() < 20)
					minge = new Minge(100, 0);
				else minge = new Minge(100,50);
			}
			finally {
				System.out.println(this.echipa1 + " - " + 
					this.echipa2 + " : Mingea se afla la coordonatele (" + minge.getX() + 
					", " + minge.getY() + ")");
		
			}
		}
	}
	
	public static void main(String argv []) {
		Fotbal f1 = new Fotbal("echipa1", "echipa2");
		Fotbal f2 = new Fotbal("urmatoarea echipa1", "urmatoarea echipa2");
		
		f1.simuleaza();
		System.out.println(f1);
		
		f2.simuleaza();
		System.out.println(f2);
	}
}

