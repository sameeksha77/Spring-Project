package Sam;
public class Rectangle implements Shape {
	private int length;
    private int breadth;

    public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int length, int breadth) {
        super();
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
    }
}
