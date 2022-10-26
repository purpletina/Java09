/**
 * 
 */
package Java09;

/**
 * @author user
 *
 */
class CCount{
	static int cnt = 0;
	public CCount() {
		cnt++;
	}
	public static void count() {
		System.out.println(cnt+"object(s) created");
	}
	void setZero() {
		cnt = 0;
	}
	void setValue(int n) {
		cnt = n;
	}
}
public class J05 {

	public static void main(String[] args) {
		 CCount a=new CCount();
		 a.count();
		 CCount b=new CCount();
		 CCount c=new CCount();
		 b.count();
		 b.setZero();
		 c.setValue(2);
		 c.count();
	}

}
