package shapes;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int a, int b){
		this.width = a;
		this.height = b;
	}
	
	public int getArea(){
		return this.width*this.height;
	}
}
