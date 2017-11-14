public class Shape {

	protected int row;
	protected int indent;
	protected char charactor;

	public Shape(int row, char ch) {
		this.row = row;
		this.charactor = ch;
		this.indent = 0;
	}

	public Shape(int row, int indent, char ch) {
		this.row = row;
		this.charactor = ch;
		this.indent = indent;
	}

	public int getRow() {
		return this.row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getIndent() {
		return this.indent;
	}

	public void setIndent(int indent) {
		this.indent = indent;
	}

	public char getCharactor() {
		return this.charactor;
	}

	public void setCharactor(char ch) {
		this.charactor = ch;
	}

	public void draw() {
		System.out.println("Do not know what shape to draw yet!");
	}

	public double computeArea() {
		return 0;
	}

}