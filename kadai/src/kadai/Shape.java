package kadai;

public abstract class Shape implements Figure{

	/**	
	 * 概要	・図形描画機能の定義
	 */	
	public abstract void draw();
	
	/**
	 * 概要	・長さ測定機能の定義
	 * @return 長さ
	 */
	public abstract double getPerimeter();
}
