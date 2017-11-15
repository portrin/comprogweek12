import java.util.ArrayList;

public class ShapeCollection {
	public static void main(String[] args) {
		ArrayList<Shape> upDownArrow = new ArrayList<Shape>();
		// create all shape objtects
		// add all objects to ArrayList
		// compute total area and draw it
		Shape t1 = new Triangle(7,0,'*');
		Shape s1 = new Square(5,4,'&');
		Shape t2 = new Triangle(7,0,'*',true);
		upDownArrow.add(t1);
		upDownArrow.add(s1);
		upDownArrow.add(t2);

		System.out.println("the total area is " + computeArea(upDownArrow));
		draw(upDownArrow);
	}

	public static double computeArea(ArrayList<Shape> shapeList) {
		double totalArea = 0;

		for(int i=0;i<shapeList.size();i++){
			totalArea += shapeList.get(i).computeArea();
		}
		return totalArea;
	}

	public static void draw(ArrayList<Shape> shapeList) {
		for(int i=0;i<shapeList.size();i++){
			shapeList.get(i).draw();
		}
	}
}
