import java.util.Scanner;

class Point{
	private int x;
	private int y;
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public double distance() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}
	
	public double distance(Point p) {
		return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
	}
}

public class Web_ex5_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("請輸入三個點座標： ");
			
			String first= scanner.next();//字串(不含空白字元)
			if(first.equals("q")) {
				break;
			}
			
			int x1 = Integer.parseInt(first);	
			int y1 = scanner.nextInt();
			Point p1 = new Point(x1,y1);
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			Point p2 = new Point(x2,y2);
			int x3 = scanner.nextInt();
			int y3 = scanner.nextInt();
			Point p3 = new Point(x3,y3);
			
			System.out.print("與原點距離： "+p1.distance()+" "+p2.distance()+" "+p3.distance()+"\n");
			//四捨五入小數點後第一位Math.round(p1.distance()*10.0))/10.0
			System.out.print("任兩點距離： "+p1.distance(p2)+" "+p1.distance(p3)+" "+p2.distance(p3)+"\n");
			
			System.out.print("距離最遠的兩個點： ");
			if(p1.distance(p2)==p1.distance(p3)&&p1.distance(p2)==p2.distance(p3)) {
				System.out.print("任兩點距離相等");
			}else if(p1.distance(p3)>=p1.distance(p2)&&p1.distance(p3)>=p2.distance(p3)) {
				System.out.print("A C");
			}else if(p1.distance(p2)>=p1.distance(p3)&&p1.distance(p2)>=p2.distance(p3)) {
				System.out.print("A B");
			}else {
				System.out.print("B C");
			}
			
			System.out.print("\n");
			System.out.print("\n");

		}
		scanner.close();
	}
	
}
