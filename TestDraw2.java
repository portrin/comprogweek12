
public class TestDraw2 {
	public static void main(String[] args) {
		Triangle triangle1 = new Triangle(7, 2, '*');
		System.out.println(triangle1.computeArea());
		triangle1.draw();
	}
}
