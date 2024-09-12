package Sam;
public class DriverApp {
	public static void main(String[] args) {
        Circle c= new Circle(10);
        Rectangle r= new Rectangle(10, 20);
        DrawingApp d1 = new DrawingApp(c);
        DrawingApp d2 = new DrawingApp(r);  // drawing app me r not defined h
        d1.draw();
        d2.draw();
    }
}
