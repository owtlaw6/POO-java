package v1;

public class Director extends Intrare {

	private Intrare[] info;
	private int nr;
	
	public Director() {
		info = new Intrare[128];
		nr = 0;
	}
	
	public boolean adauga(Intrare i) {
		if (nr == 128) {
			return false;
		} else {
			info[nr++] = i;
			return true;
		}
	}
	
	public boolean contineInformatie(String s) {
		for (int i = 0; i < nr; i++)
			if (info[i].contineInformatie(s))
				return true;
		return false;
	}
	
}
