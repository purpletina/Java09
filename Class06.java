/**
 * 
 */
package Java09;

/**
 * @author user
 *
 */
class Count{
	static int count;
	public static void add2n(int n) {
		for(int i=0;i<=n;i++) {
			count=count+i;
		}
		System.out.println("1+2+3+..="+count);
		count=0;
	}
}
public class J06 {
	public static void main(String[] args) {
		 Count.add2n(10);
		 Count.add2n(5);
	}

}
