//abstract class A{
//	public int proc(A p) {return 56;}
//}
//
//class B extends A{
//	public int proc(A p) {return 73;}
//}
//
//class C extends B{
//	public int proc(C p) {return 61;}
//}
//
//public class main{
//	public static void main(String argv[]) {
//		A x = new C();
//		B y = new B();
//		C z = new C();
//		System.out.println(x.proc(z) + " " + y.proc(z));
//	}
//}
//
//class Ex extends Exception{}
//class main{
//	public static void main(String argv[]) throws Ex{
//		int i = 0;
//		int z = 0;
//		while(i < 2) {
//			try {
//				int k = 0;
//				while(k < 2) {
//					k++;
//					z = z + 1;
//					//System.out.println("|");
//					if (i == 0) throw new Ex();
//					//System.out.println("*");
//				}
//				z = z + 1;
//			} catch (Ex e) {
//				System.out.println(e);
//			} finally {
//				z = z + 1;
//			}
//			i++;
//		}
//		System.out.println(z);
//	}
//}
//
//class Pair{
//	private int v;
//	private int t[];
//	public Pair(int x, int []y) { v = x; t = y; }
//	public void setVT(int x, int []y) { v = x; t = y; }
//	public void setVIT(int x, int i, int y) { v = x; t[i] = y; }
//	public int getV() { return v; }
//	public int[] getT() { return t; }
//}
//
//class main{
//	public static Pair call(Pair p, Pair q) {
//		p.setVT(43, p.getT());
//		//System.out.println(p.getV() + " " + p.getT()[0] + " " + p.getT()[1]);
//		p = q;
//		//System.out.println(p.getV() + " " + p.getT()[0] + " " + p.getT()[1]);
//		p.setVIT(73,  0,  83);
//		//System.out.println(p.getV() + " " + p.getT()[0] + " " + p.getT()[1]);
//		int tz[] = {62, 44};
//		return new Pair(46, tz);
//	}
//	
//	public static void main(String argv[]) {
//		int ta[] = {98, 16};
//		int tb[] = {76, 49};
//		Pair a = new Pair(53, ta);
//		Pair b = new Pair(34, tb);
//		Pair c = b;
//		b = call(a, b);
//		System.out.println(c.getV() + " " + c.getV());
//	}
//}
//
//class X{
//	protected int v = 0;
//	public X() { v += 43; }
//}
//
//class Y extends X{
//	public Y() {v -= 24;}
//	public int getV() {return v;}
//}
//
//class Z extends Y{
//	public Z() { v += 100; }
//}
//
//class main{
//	public static void main(String argv[]) {
//		X x = new Z();
//		Y y = new Y();
//		Z z = new Z();
//		System.out.println(y.getV());
//	}
//}
//
//class ExA extends Exception {}
//class ExB extends ExA {}
//
//class main{
//	public static int make(int a) throws ExA{
//		for (int k = 0; k < 3; k++) {
//			a = a + 2;
//			if (a == 3) throw new ExB();
//		}
//		return a;
//	}
//	public static void main(String argv[]) throws ExA {
//		int x = 0;
//		for (int i = 0; i < 2; i++) {
//			try {
//				x++;
//				//System.out.println("|");
//				x = make(x);
//				//System.out.println("*");
//				x++;
//			} catch (ExB e) {
//				System.out.println(e);
//			} finally {
//				x++;
//			}
//		}
//		System.out.println(x);
//	}
//}
//
//class X{
//	protected int v = 0;
//	public X() { v += 10; }
//	public void proc(X p) { System.out.println(91);}
//}
//
//class Y extends X{
//	public Y() {v += 1;}
//	public void proc(X p) { System.out.println(37);}
//	public int getV() {return v;}
//}
//
//class Z extends Y{
//	public Z() { v += 5; }
//	public void proc(Z p) { System.out.println(14);}
//}
//
//class main{
//	public static void main(String argv[]) {
//		X x = new Z();
//		Y y = new Z();
//		Z z = new Z();
//		x.proc(z);
//		System.out.println(y.getV());
//	}
//}
//class X {
//	public int get()
//	{
//		return 0;
//	}
//}
//class Y extends X {
//	public int get()
//	{
//		return 1;
//	}
// }
//class main{
//	private X a = new Y();
//	public static void main(String argv[]) {
//		a.get();
//	}
//}
//
//class Pair{
//	private int v;
//	private int t[];
//	public Pair(int x, int []y) { v = x; t = y; }
//	public void setVT(int x, int []y) { v = x; t = y; }
//	public void setVIT(int x, int i, int y) { v = x; t[i] = y; }
//	public int getV() { return v; }
//	public int[] getT() { return t; }
//}
//
//class main{
//	public static Pair call(Pair p, Pair q) {
//		p.setVT(2, q.getT());
//		//System.out.println(p.getV() + " " + p.getT()[0] + " " + p.getT()[1]);
//		p = q;
//		//System.out.println(p.getV() + " " + p.getT()[0] + " " + p.getT()[1]);
//		p.setVIT(52,  0,  20);
//		//System.out.println(p.getV() + " " + p.getT()[0] + " " + p.getT()[1]);
//		int tz[] = {74, 80};
//		return new Pair(50, tz);
//	}
//	
//	public static void main(String argv[]) {
//		int ta[] = {62, 94};
//		int tb[] = {64, 53};
//		Pair a = new Pair(50, ta);
//		Pair b = new Pair(61, tb);
//		Pair c = b;
//		b = call(a, b);
//		System.out.println(a.getT()[0] + " " + c.getV());
//	}
//}
//
//abstract class X{
//	public int proc(X p) {return 14;}
//}
//
//class Y extends X{
//	public int proc(X p) {return 12;}
//	public void cucu() {};
//}
//
//class Z extends X{
//	public int proc(Z p) {return 34;}
//	public void cucu() {};
//}
//
//public class main{
//	public static void main(String argv[]) {
//		Z a = new Z();
//		a.cucu();
//		X y = new Y();
//		y.cucu();
//		X z = new Z();
//		z.cucu();
//		System.out.println(y.proc(a) + " " + z.proc(a));
//	}
//}
//
//class X{
//	protected static int v = 0;
//	public X() { v -= 6; }
//	public int exec(Y p) {
//		return 43;
//	}
//}
//
//class Y extends X{
//	public int exec(Y p) {
//		return 37;
//	}
//}
//
//class Z extends Y{
//	public Z() { v += 10; }
//	public int exec(Z p) {
//		return 69;
//	}
//	public static int  getX() {
//		return v;
//	}
//}
//
//class main{
//	public static void main(String argv[]) {
//		X x = new X();
//		X y = new Z();
//		System.out.println(Z.getX());
//		Z z = new Z();
//		System.out.println(y.exec(z));
//	}
//}
//class Tuplu {
//
//    private int v;
//    private Tuplu obj;
//    public Tuplu(int a, Tuplu b) {v = a; obj = b;}
//    public void set(int a, Tuplu b) {v = a; obj = b;}
//    public int getV() {return v;}
//    public Tuplu getObj() {return obj;}
//}
//
//class main {
//    public static Tuplu apelare(Tuplu e, Tuplu f) {
//        f.set(99, e.getObj());
//        f = e;
//        f.getObj().set(45, null);
//        return new Tuplu(21, new Tuplu(44, null));
//    }
//
//    public static void main(String[] args) {
//        Tuplu x = new Tuplu(27, new Tuplu(67, null));
//        Tuplu y = new Tuplu(79, new Tuplu(11, null));
//        Tuplu z = y;
//        y = apelare(x, y);
//        System.out.println(z.getV());
//        System.out.println(z.getObj().getV());
//    }
//}

