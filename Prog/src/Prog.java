class Clock{
	private int hour, minute, second;
	public void settime(int h, int m, int s) {
		hour = (h >= 0) && (h < 24) ? h : 0;
		minute = (m >= 0) && (m < 24) ? m : 0;
		second = (s >= 0) && (s < 24) ? s : 0;
	}
	public void print() {
		System.out.println("Current time " + hour + " : " + minute + " : " + second);
	}
}

class Prog{
	public static void main(String argv []) {
		//System.out.println("Hello world again!");
		Clock c = new Clock();
		c.settime(10, 5, 0);
		c.print();
	}
}