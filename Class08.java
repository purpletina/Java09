/**
 * 
 */
package Java09;

/**
 * @author user
 *
 */
class CWin {
	private static int cnt;
	static String color;
	static int width;
	static int height;

	public static void count() {
		cnt = cnt + 1;
		System.out.println(cnt + " objects");
	}

	public static void Cwin(String str, int w, int h) {
		color = str;
		width = w;
		height = h;
	}

	public static void CWin() {
		color = "red";
		width = 2;
		height = 2;
	}

	public static void setZore() {
		cnt = 0;
		System.out.println(cnt + " objects");
	}
	public static void setValue(int n) {
		cnt=n;
	}
}

public class J08 {
	public static void main(String[] args) {
		CWin a = new CWin();
		CWin.count();
		CWin b = new CWin();
		CWin.count();
		CWin.setZore();
	}

}
