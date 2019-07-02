package createObjects;

public class CreateObjectDemo{
	
	public static void main(String[] args){
		
		// Declare and create a point object and two rectangle objects.
		Point originOne = new Point(23, 94);
		Rectangle rectOne = new Rectangle(originOne, 100, 200);
		Rectangle rectTwo = new Rectangle(50, 100);
		
		// Display rectOne's width, height, and area.
		System.out.println("Width of rectOne: " + rectOne.width);
		System.out.println("Height of rectOne: " + rectOne.height);
		System.out.println("Area of rectOne: " + rectOne.getArea());
		
		// Set rectTwo's position
		rectTwo.origin = originOne;
		
		// Display rectTwo's position
		
		// Move rectTwo and display its new position
	}
}