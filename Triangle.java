public class Triangle extends Shape {
	
	private boolean isFliped;

	public Triangle(int row, char ch, boolean isFliped) {
		super(row,ch);
		this.isFliped = isFliped;
	}

	public Triangle(int row,int indent, char ch, boolean isFliped) {
		super(row,indent,ch);
		this.isFliped = isFliped;
	}
	public Triangle(int row, char ch){
		super(row,ch);
		this.isFliped = false;
	}
	public Triangle(int row, int indent, char ch){
		super(row,indent,ch);
		this.isFliped = false;
	}

	public void draw() {
		if(this.isFliped == false) {
			for(int i=0;i<this.row;i++){
				for(int j=1;j<this.row-i+this.indent;j++){								
					System.out.print(" ");
				}
				for(int k=0;k<i+1;k++){
					System.out.print(this.charactor+" ");sdgf
				}
				System.out.println("");
			}
		} else {
			for(int i=0;i<this.row;i++){
				for(int j=0;j<i+this.indent;j++){
					System.out.print(" ");
				}
				for(int k=0;k<this.row-i;k++){
					System.out.print(this.charactor+" ");
				}
				System.out.println("");
			}
		}
	}

	public double computeArea() {return (this.row*this.row)/2.0;}
}