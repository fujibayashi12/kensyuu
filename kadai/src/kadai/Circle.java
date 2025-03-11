package kadai;

public class Circle extends Shape{
	
	private Point center;
	private int radius;
	
	/*
	 * 引数無しコンストラクタの定義
	 * center(x,y座標),半径すべて0で初期化する
	 */
	public Circle() {
		this.center = new Point(0, 0);//(これで初期化だと思う)
		this.radius = 0;
	}
	
	/*
	 * xとy...centerフィールドに代入するPoint型変数のx,y座標値
	 * r..円の半径
	 */
	public Circle(int x, int y,int r) {
		this.center = new Point(x, y);
		this.radius = r;
	}
	
	/*
	 * 以下のようなメッセージを表示する
	 * 出力例
	 * "[円を描画] 中心点(100,100)から半径20"
	 */
	public void draw() {
		System.out.println("[円を描画] 中心点(" + center.getX()+ "," + center.getY() +")から半径"+ radius );
	}
	
	/*
	 * 半径を使い、以下の計算式で算出した結果を返す
	 * 半径 * 2 * 円周率
	 * 円周率..Math.PIフィールド
	 */
	public double getPerimeter() {
		return (radius * 2 * Math.PI); //半径 * 2 * Math.PI
	}
}