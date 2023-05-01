package v1;

public class Link extends Intrare {

	private Intrare info;
	
	public Link(Intrare info) {
		this.info = info;
	}
	
	public boolean contineInformatie(String s) {
		return info.contineInformatie(s);
	}
	
}
