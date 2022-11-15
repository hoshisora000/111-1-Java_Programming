

//我把程式碼放在同一個project，故將他尾數改為2
class CShape2 // 父類別CShape
{
  public double area()
  {
    return 0.0;
  }
}

class CCircle2 extends CShape2{
	private double pi = 3.14;
	private double r;
	public CCircle2(double x) {
		this.r=x;
	}
	public double area(){
		return Math.pow(this.r, 2)*this.pi;
	}
}

class CSquare2 extends CShape2{
	private double length;
	public CSquare2(double x) {
		this.length=x;
	}
	public double area(){
		return Math.pow(this.length, 2);
	}
}

//我把程式碼放在同一個project，CTriangle已經用過，故將他尾數改為2
class CTriangle2 extends CShape2{
	private double base;
	private double high;
	public CTriangle2(double x, double y) {
		this.base=x;
		this.high=y;
	}
	public double area(){
		return this.base*this.high/2;
	}
}
public class Web_ex6_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CShape2 shp[]=new CShape2[6];
		shp[0]=new CCircle2(2.0);
		shp[1]=new CCircle2(3.0);
		shp[2]=new CSquare2(4.0);
		shp[3]=new CSquare2(5.0);
		shp[4]=new CTriangle2(3.0,3.0);
		shp[5]=new CTriangle2(5.0,4.0);
		for(int i=0;i<6;i++) {
			System.out.println("面積"+i+" = "+shp[i].area());
		}
		System.out.println("面積最大 = "+largest2(shp));
	}
	public static double largest2(CShape2 x[]) {
		double max_area=x[0].area();
		for(int i=1;i<x.length;i++) {
			max_area=Math.max(max_area, x[i].area());
		}

		return max_area;
	}
}
