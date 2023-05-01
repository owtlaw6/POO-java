package v1;

public class Fisier extends Intrare {

	private String info;
	
	public Fisier(String info) {
		this.info = info;
	}
	
	public void schimbaContinut(String info) {
		this.info = info;
	}
	
	public boolean contineInformatie(String s) {
		return s.equals(info);
	}
	
}

