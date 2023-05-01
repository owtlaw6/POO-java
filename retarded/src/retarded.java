/*class A{
	public static void main(String argv []) {
		System.out.println("Hello world!");
		
	}
}


class retarded{
	public static void main(String argv []) {
		System.out.println("Hello world again!");
		
	}
}*/

abstract class A {
    public int proc(B p) {
        return 5;
    }
}

class B extends A {
    public int proc(C p) {
        return 21;
    }
}

class C extends B {
    public int proc(C p) {
        return 45;
    }
}

class retarded{
	public static void main(String argv[]) {
		A x = new C();
        B y = new C();
        B z = new B();
        System.out.println(x.proc(z) + " " + y.proc(z));
		
	}
}
