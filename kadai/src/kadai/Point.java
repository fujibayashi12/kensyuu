package kadai;

public class Point {

		private int x;
		private int y;
		
		/**
		 * 引数なしコンストラクタの定義
		 * x座標、y座標ともに0で初期化する。
		 */
		public Point() {
			this.x = 0;
			this.y = 0;
					}
		/**
		 *x座標、y座標を受け取りその値で初期化するコンストラクタの定義
		 *第1引数で渡された値をxフィールドに代入する。
		 *第2引数で渡された値をyフィールドに代入する。						
		 */
		public Point(int x,int y) {
			this.x = x;
			this.y = y;
		}
		
		/**
		 * xフィールドの値を返すメソッド							
		 */
		public int getX() {
			return this.x;
			

		/**
		 * 引数で渡された値を、xフィールドにセットするメソッド							
		 */
		}
		public void setX(int x) {
			this.x = x;
			
		/**
		 * yフィールドの値を返すメソッド							
		 */	
		}
		public int getY() {
			return this.y;
			
		/**
		 * 引数で渡された値を、yフィールドにセットするメソッド							
		 */	
		}
		public void setY(int y) {
			this.y = y;
			
		}
}
