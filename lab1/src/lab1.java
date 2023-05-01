class Complex{
	private double real, imaginar;
	private static int count = 0;
	public void setValue(double re, double im) {
		real = re;
		imaginar = im;
	}
	public void print() {
		count++;
		System.out.println("z = " + real + " + i * " + imaginar);
	}
	public void calculeazaModul() {
		System.out.println("Modulul este: " + (Math.sqrt(real * real + imaginar * imaginar)));
	}
		public Complex suma(Complex nr) {
			Complex s = new Complex();
			s.setValue(this.real + nr.real, this.imaginar + nr.imaginar);
			return s;
		}
	public static int numarat() {
		return count;
	}
}

class lab1{ ///ClientComplex
	public static void main(String argv []) {
		Complex c = new Complex();
		c.setValue(11, 5);
		c.print();
		c.calculeazaModul();
		Complex cc = new Complex();
		cc.setValue(5, 11);
		cc.print();
		cc.suma(c).print();
		System.out.println("numarul de afisari a numerelor este: " + Complex.numarat());
	}
}