/**
 * 
 */
package Java09;

/**
 * @author user
 *
 */
	class CRectangle {
		int width;
		int height;

		public CRectangle(int w, int h) {
			width = w;
			height = h;
		}
		public CRectangle() {
			this(10, 8);
			int width;
			int height;
		}
		public void show() {
			System.out.println("width=" + width);
			System.out.println("height="+height+"\n");
		}
	}
		

	public class J01 {
		public static void main(String[] args) {
			 CRectangle aa=new CRectangle(5,2);
			 aa.show();
			 CRectangle bb=new CRectangle();
			 bb.show();
		  }
	}
