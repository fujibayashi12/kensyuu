package kadai;

public abstract class Polygon extends Shape{
	
	public int angle;
	
	
	/**
	 * 概要	・図形描画機能の定義
	 */
	public abstract void draw();

	/**
	 * 概要	・長さ測定機能の定義
	 */
	public abstract double getPerimeter();
	
	/**
	 * angleフィールドを使い、内角の和を算出する。
	 * (例)n角形の場合 (n - 2)*180
	 */
	public int getInternalAngle() {
		return ((this.angle - 2) * 180);
	}
}
