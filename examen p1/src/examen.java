abstract class A{
	public int proc(A p) {return 74;}
}

class B extends A{
	public int proc(A p) {return 33;}
}

class C extends A{
	public int proc(C p) {return 71;}
}

/*public class examen{
	public static void main(String argv[]) {
		C x = new C();
		A y = new B();
		A z = new C();
		System.out.println(y.proc(x) + " " + z.proc(x));
	}
}*/

class Ex extends Exception{}
/*class examen{
	public static void main(String argv[]) throws Ex{
		int i = 0;
		int z = 0;
		while(i < 2) {
			try {
				int k = 0;
				while(k < 3) {
					k++;
					z = z + 2;
					//System.out.println("|");
					if (i == 0) throw new Ex();
					//System.out.println("*");
				}
				z = z + 2;
			} catch (Ex e) {
				System.out.println(e);
			} finally {
				z = z + 1;
			}
			i++;
		}
		System.out.println(z);
	}
}*/

class Pair{
	private int v;
	private int t[];
	public Pair(int x, int []y) { v = x; t = y; }
	public void setVT(int x, int []y) { v = x; t = y; }
	public void setVIT(int x, int i, int y) { v = x; t[i] = y; }
	public int getV() { return v; }
	public int[] getT() { return t; }
}

/*class examen{
	public static Pair call(Pair p, Pair q) {
		p.setVT(8, q.getT());
		p = q;
		p.setVIT(27,  1,  94);
		int tz[] = {29, 46};
		return new Pair(50, tz);
	}
	
	public static void main(String argv[]) {
		int ta[] = {1, 11};
		int tb[] = {44, 95};
		Pair a = new Pair(14, ta);
		Pair b = new Pair(26, tb);
		Pair c = b;
		b = call(a, c);
		System.out.println(a.getT()[1]);
	}
}*/

class X{
	protected int v = 0;
	public X() { v += 49; }
}

class Y extends X{
	public Y() {v += 34;}
	public int getV() {return v;}
}

class Z extends Y{
	public Z() { v += 52; }
}

/*class examen{
	public static void main(String argv[]) {
		X x = new Z();
		Y y = new Y();
		Z z = new Z();
		System.out.println(y.getV());
	}
}*/

class ExA extends Exception {}
class ExB extends ExA {}

/*class examen{
	public static int make(int a) throws ExA{
		for (int k = 0; k < 2; k++) {
			a = a + 2;
			if (a == 3) throw new ExB();
		}
		return a;
	}
	public static void main(String argv[]) throws ExA {
		int x = 0;
		for (int i = 0; i < 3; i++) {
			try {
				x++;
				//System.out.println("|");
				x = make(x);
				//System.out.println("*");
				x++;
			} catch (ExB e) {
				System.out.println(e);
			} finally {
				x++;
			}
		}
		System.out.println(x);
	}
}*/


