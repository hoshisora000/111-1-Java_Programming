
class CShape // 父類別CShape
{
  public double area()
  {
    return 0.0;
  }
}

class CCircle extends CShape{
	private double pi = 3.14;
	private double r;
	public CCircle(double x) {
		this.r=x;
	}
	public double area(){
		return Math.pow(this.r, 2)*this.pi;
	}
}

class CSquare extends CShape{
	private double length;
	public CSquare(double x) {
		this.length=x;
	}
	public double area(){
		return Math.pow(this.length, 2);
	}
}

//我把程式碼放在同一個project，CTriangle已經用過，故將他尾數改為1
class CTriangle1 extends CShape{
	private double base;
	private double high;
	public CTriangle1(double x, double y) {
		this.base=x;
		this.high=y;
	}
	public double area(){
		return this.base*this.high/2;
	}
}

public class Web_ex6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle cir1=new CCircle(2.0);
		CCircle cir2=new CCircle(3.0);
		CSquare squ1=new CSquare(4.0);
		CSquare squ2=new CSquare(5.0);
		CTriangle1 tri1=new CTriangle1(3.0,3.0);
		CTriangle1 tri2=new CTriangle1(5.0,4.0);
		System.out.println("面積1 = "+cir1.area());
		System.out.println("面積2 = "+cir2.area());
		System.out.println("面積3 = "+squ1.area());
		System.out.println("面積4 = "+squ2.area());
		System.out.println("面積5 = "+tri1.area());
		System.out.println("面積6 = "+tri2.area());
		System.out.println("面積最大 = "+largest(cir1,cir2,squ1,squ2,tri1,tri2));
	}
	public static double largest(CCircle a,CCircle b,CSquare c,CSquare d,CTriangle1 e,CTriangle1 f) {
		//largest(CShape a,CShape b,CShape c,CShape d,CShape e,CShape f)
		double max_area = Math.max(a.area(), b.area());
		max_area=Math.max(max_area, c.area());
		max_area=Math.max(max_area, d.area());
		max_area=Math.max(max_area, e.area());
		max_area=Math.max(max_area, f.area());
		return max_area;
	}

}
