

public class AccessLevelTest {

	public static void main(String[] args) {
		// Bird[] birds = new Bird[2];
		// birds[0] = new Eagle();
		// birds[1] = new Ostrich();
		//
		// for (Bird b : birds) { // Bird b£¿
		// b.fly();
		// }
		Bird ea = new Eagle();
		Eagle e = new Eagle();
		Ostrich o = new Ostrich();
		beginFly(ea);
		beginFly(e);
		beginFly(o);
	}

	public static void beginFly(Bird b) {
		b.fly();
	}
}
