package day2Tasks;
class Shape {
	int length;
	public Shape(int length) {
		this.length=length;
	}
	public double calculateArea() {
		return 0.0;
	}
}
class Rectangle extends Shape{
	int height;

public Rectangle(int length,int height) {
	super(length);
	this.height=height;
}

@Override
public double calculateArea() {
	return length * height;
}
}

class Square extends Shape{
	public Square(int length) {
		super(length);
		
	}
	@Override
	public double calculateArea() {
		return length * length;
	}
}
class Triangle extends Shape{
	int heigth;
	public Triangle(int length,int height) {
		super(length);
		this.heigth=height;
	}
	@Override
	public double calculateArea() {
		return 0.5 * length * heigth;
	}
}
public class TestShape{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes=new Shape[5];
		shapes[0] =new Rectangle(10,5);
		shapes[1] =new Square(5);
		shapes[2] =new Triangle(6,3);
		shapes[3] =new Rectangle(6,6);
		shapes[4] =new Square(4);
		
		for(Shape shape:shapes) {
			System.out.println("Area : " + shape.calculateArea());
		}

	}

}


