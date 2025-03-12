package kadai;


public class Square extends Rectangle{


	/**
	 *"スーパークラスRectangleのコンストラクタを明示的に呼び出す。
	 *引数は以下の通りとする。
	 *第1引数...Point型データのx座標
	 *第2引数...Point型データのy座標
	 *第3引数...正方形の一辺の長さ
	 *第4引数...正方形の一辺の長さ"											
	 */
	public Square(int x,int y,int width){
		super(x,y,width,width);
		
		
	}
	/*
	 * 以下のようなメッセージを表示
	 * 出力例
	 * "[正方形を描画] 点(0,0)を基準として幅・高さ200の正方形"
	 */
	public void draw() {
		System.out.println("[正方形を描画] 点("+ p.getX() + ","+ p.getY() +")を基準として幅・高さ"+ width +"の正方形");
	}
	
	public double getPerimeter() {
		return width * 4;
	}
	
}
