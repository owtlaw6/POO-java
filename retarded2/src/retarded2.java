//class A {
//	public int proc(A p) {
//		//System.out.println("pas1\n");
//		return 98;
//	}
//}
//
//class B extends A {
//	public int proc(A p) {
//		//System.out.println("pas2\n");
//		return 17;
//	}
//}
//
//class C extends B {
//	public int proc(C p) {
//		//System.out.println("pas3\n");
//		return 65;
//	}
//}
//
//public class retarded2 {
//	public static void main(String[] args) {
//		C x = new C();
//		A y = new B();
//		C z = new C();
//		System.out.println(y.proc(x));// + " " + z.proc(x));
//	}
//}

class retarded2{
	protected int y=0;
	public retarded2() {
		y=ds();
	}
	public static int ds() {
		return 10;
	}
	public String toString() {
		return "" + y;
	}
	public static void main(String[] args) {
		System.out.println(new D());
		System.out.println(new retarded2());
	}
}

class D extends retarded2{
	public static int ds() {
		return 20;
	}
}
