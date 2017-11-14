public class Square extends Shape {
	
	public Square(int row, char ch) {
		super(row,ch);
	}

	public Square(int row, int indent, char ch) {
		super(row,indent,ch);
	}

	public void draw() {
		for(int i=0;i<this.row;i++){
			for(int k=0;k<this.indent;k++)System.out.print(" ");
			for(int j=0;j<this.row;j++){
				System.out.print(this.charactor);
			}
			System.out.println("");
		}
	}

	public double computeArea() {
		return this.row*this.row;
	}
}