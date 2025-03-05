package calcapp.Mein;

import calcapp.logics.Calclogic;

public class calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10; int b =2;
		int total = Calclogic.tasu(a, b);
		int delta = Calclogic.hiku(a, b);
		System.out.println("足すと" + total + ",引くと" + delta);
	}
	

}


