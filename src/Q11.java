import java.util.Scanner;

class CSphere
{
  private int x; // 圓心的x 座標
  private int y; // 圓心的y 座標
  private int z; // 圓心的z 座標
  private int radius; // 圓球的半徑
  
  public void setLocation(int a,int b,int c) {
	  this.x=a;
	  this.y=b;
	  this.z=c;
  }
  
  public void setRadius(int ra) {
	  this.radius=ra;
  }
  
  public double surfaceArea() {
	  //System.out.println(4*3.14*Math.pow(radius, 2));
	  return 4*3.14*Math.pow(radius, 2);
  }
  
  public double volume() {
	  return 4*3.14*Math.pow(radius, 3)/3;
	  //System.out.println(4*3.14*Math.pow(radius, 3)/3);
  }
  
  public String showCenter() {
	  //System.out.println("x="+this.x+" y="+this.y+" z="+this.z);
	  return "x="+this.x+" y="+this.y+" z="+this.z;
  }
}

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		int r = scanner.nextInt();
		CSphere cs1 = new CSphere();
		cs1.setLocation(x, y, z);
		cs1.setRadius(r);
		
		System.out.println(cs1.showCenter());
		System.out.println(cs1.surfaceArea());
		System.out.println(cs1.volume());
		scanner.close();
	}

}

