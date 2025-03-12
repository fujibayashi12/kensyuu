package kadai;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in); //キーボードから入力値を受け取る
	
		int num = scanner.nextInt();		      //整数を受け取る
			
		switch (num) {
			
			case 0:
				Circle Circle = new Circle(100,100,20);
				Circle.draw();
				System.out.println(Circle.getPerimeter());
				System.out.println();
				break;
			
			case 2:
				Line Line = new Line(0,0,100,100);
				Line.draw();
				System.out.println("周囲の長さは" + Line.getPerimeter());
				System.out.println();
				break;
			
			case 3:
				Triangle Triangle  = new Triangle(0,0,100,100,0,200);
				Triangle.draw();
				System.out.println("周囲の長さは" + Triangle.getPerimeter());
				System.out.println("内角の和は" + Triangle.getInternalAngle());
				System.out.println();
				break;
			
			case 4:
				Rectangle Rectangle  = new Rectangle(0,0,100,50);
				Rectangle.draw();
				System.out.println("周囲の長さは" + Rectangle.getPerimeter());
				System.out.println("内角の和は"+ Rectangle.getInternalAngle());
				System.out.println();
				break;
			
			case 44:
				Square Square  = new Square(0,0,200);
				Square.draw();
				System.out.println("周囲の長さは" + Square.getPerimeter());
				System.out.println("内角の和は"+ Square.getInternalAngle());
				System.out.println();
				break;
			}
		scanner.close();
	}
}
