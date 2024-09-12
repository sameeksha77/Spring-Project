package Sam;
public class DrawingApp {
	 private Shape shape;

	    public DrawingApp(Shape shape) {
	        this.shape = shape;
	    }

	    public void draw(){
	        System.out.println(shape);
	    }
}
