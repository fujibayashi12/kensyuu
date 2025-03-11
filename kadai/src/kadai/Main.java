package kadai;

public class Main {

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Circle Circle = new Circle(100,100,20);
		Circle.draw();
		System.out.println(Circle.getPerimeter());
		System.out.println();
		
		Line Line = new Line(0,0,100,100);
		Line.draw();
		System.out.println("周囲の長さは" + Line.getPerimeter());
		System.out.println();
		
		Triangle Triangle  = new Triangle(0,0,100,100,0,200);
		Triangle.draw();
		System.out.println("周囲の長さは" + Triangle.getPerimeter());
		System.out.println("内角の和は" + Triangle.getInternalAngle());
		System.out.println();
		
		Rectangle Rectangle  = new Rectangle(0,0,100,50);
		Rectangle.draw();
		System.out.println("周囲の長さは" + Rectangle.getPerimeter());
		System.out.println("内角の和は"+ Rectangle.getInternalAngle());
		System.out.println();
		
		Square Square  = new Square(0,0,200);
		Square.draw();
		System.out.println("周囲の長さは" + Square.getPerimeter());
		System.out.println("内角の和は"+ Square.getInternalAngle());
		System.out.println();
		

	}

}
