class Avion{
	private String planeID;
	private int totalEnginePower;
	public Avion(String s, int i) {
		planeID = s;
		totalEnginePower = i;
	}
	public String getPlaneID() {
		return this.planeID;
	}
	public int getTotalEnginePower() {
		return this.totalEnginePower;
	}
	public void takeOff() {
		String s = "PlaneID_Value - " + planeID + "_" + totalEnginePower + 
			" - Initiating takeoff procedure" + 
			" - Starting engines - Accelerating down the runway - Taking off - " + 
			"Retracting gear - Takeoff complete";
		System.out.println(s);
		
	}
	public void land() {
		String s = "PlaneID_Value - " + planeID + "_" + totalEnginePower + " - Initiating landing procedure - " +
			"Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - " +
			"Stopping engines - Landing complete";
		System.out.println(s);
	}
	public void fly() {
		String s = "PlaneID_Value - " + planeID + "_" + totalEnginePower + " - Flying";
		System.out.println(s);
	}
}

class Calatori extends Avion{
	private int maxPassengers;
	public Calatori(String s, int i, int p) {
		super(s, i);
		this.maxPassengers = p;
	}
	public int getMaxPassengers() {
		return this.maxPassengers;
	}
}

class Boeing extends Calatori{
	public Boeing(String s, int i, int p) {
		super(s, i, p);
	}
}

class Concorde extends Calatori{
	public Concorde(String s, int i, int p) {
		super(s, i, p);
	}
	public void goSuperSonic() {
		String s = "PlaneID_Value - " + this.getPlaneID() + "_" + this.getTotalEnginePower() + 
			" - Supersonic mode activated";
		System.out.println(s);
	}
	public void goSubSonic() {
		String s = "PlaneID_Value - " + this.getPlaneID() + "_" + this.getTotalEnginePower() + 
			" - Supersonic mode deactivated";
		System.out.println(s);
	}
}

class Lupta extends Avion{
	public Lupta(String s, int i) {
		super(s, i);
	}
	public void launchMissile() {
		String s = "PlaneID_Value - " + this.getPlaneID() + "_" + this.getTotalEnginePower() + 
			" Initiating missile launch procedure - Acquiring target - Launching missile -" + 
			" Breaking away - Missile launch complete";
		System.out.println(s);
	}
}

class Mig extends Lupta{
	public Mig(String s, int i) {
		super(s, i);
	}
	public void highSpeedGeometry() {
		String s = "PlaneID_Value - " + this.getPlaneID() + "_" + this.getTotalEnginePower() + 
			" High speed geometry selected";
		System.out.println(s);
	}
	public void normalSpeedGeometry() {
		String s = "PlaneID_Value - " + this.getPlaneID() + "_" + this.getTotalEnginePower() + 
			" Normal geometry selected";
		System.out.println(s);
	}
}

class TomCat extends Lupta{
	public TomCat(String s, int i) {
		super(s, i);
	}
	public void refuel() {
		String s = "PlaneID_Value - " + this.getPlaneID() + "_" + this.getTotalEnginePower() + 
			"Initiating refueling procedure - " + 
			"Locating refueller - Catching up - Refueling - Refueling complete";
		System.out.println(s);
	}
}


class Avionase{
	public static void main(String argv []) {
		Avion a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        int value;
        a1 = new Avion("avion", 1);
        a2 = new Calatori("calatori", 2, 2);
        a3 = new Concorde("concorde", 3, 3);
        a4 = new Boeing("boeing", 4, 4);
        a5 = new Lupta("lupta", 5);
        a6 = new Mig("mig", 6);
        a7 = new TomCat("tomcat", 7);
        a8 = new Concorde("concorde2", 8, 8);
        a9 = new Boeing("boeing", 9, 9);
        a10 = new Mig("mig", 10);
        
        
        a1.fly();
        System.out.println();
        
        ((Calatori)a2).takeOff();
        System.out.println();
        
        ((Boeing)a4).land();
        System.out.println();
        value = ((Boeing)a9).getMaxPassengers();
        System.out.println(value);
        System.out.println();
        
        ((Concorde)a3).goSuperSonic();
        System.out.println();
        ((Concorde)a8).goSubSonic();
        System.out.println();
        
        ((Lupta)a5).launchMissile();
        System.out.println();
        
        ((Mig)a6).highSpeedGeometry();
        System.out.println();
        ((Mig)a10).normalSpeedGeometry();
        System.out.println();
        
        ((TomCat)a7).refuel();
        System.out.println();
	}
}