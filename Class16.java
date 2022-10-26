/**
 * 
 */
package Java09;
class Circle{
	 private static double pi=3.14;
	 private double radius;
	 public Circle(double r) {
		 radius=r;
	 }
	 public void show() {
		 System.out.println("area="+pi*radius*radius);
	     System.out.println("radius="+radius); 
	 }
}
public class J16 {
	public static void main(String[] args) {
		Circle cir[];
		cir=new Circle[6];
		 for(int i=0;i<cir.length;i++) {
			 cir[i]=new Circle(i);
			 cir[i].show();
		 }
		 cir[0]=new Circle(1.0);
		 cir[1]=new Circle(4.0);
		 cir[2]=new Circle(2.0);
		 
		 cir[0].show();   
	     cir[1].show();   
	     cir[2].show();
	}
}
