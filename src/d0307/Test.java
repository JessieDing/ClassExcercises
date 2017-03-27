package d0307;

public class Test {

	public static void main(String[] args) {

		Bird e = new Eagle();
		Bird o = new Ostrich();

		Bird[] birds = new Bird[2];
		birds[0] = o;
		birds[1] = e;

		for (Bird b : birds) {
			b.fly();
		}
	}
}
