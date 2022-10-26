package Java09;

/**
 * @author user
 *
 */
class CcRational{
	public static int n;
	public static int d;
	public  void setND(int num, int den) {
		n=num;
		d=den;
	 }
	public void setN(int num) {
		n=num;
	}
	public void setD(int num) {
		d=num;
	}
	
}
public class J10b {
	public static void main(String[] args) {
		CcRational aaa=new CcRational();
		aaa.setND(3,5);
		show(aaa);
	}
	 public static void show(CcRational obj) {
		 System.out.println(obj.n+"/"+obj.d);
	 }
}
