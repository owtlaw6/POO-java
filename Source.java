package v1;

public class Source {

	public static void main(String[] args) {
		
		Intrare f1 = new Fisier("1");
		Intrare f2 = new Fisier("2");
		Intrare l1 = new Link(f1);
		Intrare d = new Director();
		((Director) d).adauga(f1);
		((Director) d).adauga(f2);
		((Director) d).adauga(l1);
		Intrare l2 = new Link(d);
		
		System.out.println(l2.contineInformatie("1"));
		((Fisier) f1).schimbaContinut("X");
		System.out.println(l2.contineInformatie("1"));

	}

}
