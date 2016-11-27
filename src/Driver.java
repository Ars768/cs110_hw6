
import shapes.Rectangle;
import shapes.Square;
import utils.Math;
public class Driver{
	public static void main(String[] args) {
		Square a = new Square(50);
		System.out.println("Area(a) = " + a.getArea());
		Rectangle b = new Rectangle(20, 30);
		System.out.println("Area(b) = " + b.getArea());
		double test = 15.6;
		System.out.println("15! = " + Math.factorial((int)test));
		System.out.println("15! = " + Math.factorialLoop((int)test));
	}

}