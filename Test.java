public class Test {
	public static void main(String[] args) {
		Square s1 = new Square(6,7,'^');
		s1.draw();
		System.out.println(s1.computeArea());

		Triangle t1 = new Triangle(7,17,'#',false);
		t1.draw();

		t1 = new Triangle(7,5,'.',true);
		t1.draw();

		Shape t2 = new Triangle(4,20,'"');
		t2.draw();
		System.out.println(t1.computeArea());
	}
}