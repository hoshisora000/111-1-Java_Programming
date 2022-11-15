import java.util.Scanner;

class CSphere2 {
	private int x; // ��ߪ�x �y��
	private int y; // ��ߪ�y �y��
	private int z; // ��ߪ�z �y��
	private double radius; // ��y���b�|

	CSphere2(int a, int b, int c, double r) {
		x = a;
		y = b;
		z = c;
		radius = r;
	}

	public double distance(CSphere2 csp2) {
		return Math
				.sqrt(Math.pow((this.x - csp2.x), 2) + Math.pow((this.y - csp2.y), 2) + Math.pow((this.z - csp2.z), 2));
	}

	public boolean isIntersect(CSphere2 csp2) {
		if (distance(csp2) <= this.radius + csp2.radius) {
			return true;
		} else {
			return false;
		}
	}

	public void show() {
		System.out.println("x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", radius=" + this.radius);
	}
}


public class Web_ex5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��J:");
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int z1 = scanner.nextInt();
		double r1 = scanner.nextDouble();
		CSphere2 cs1 = new CSphere2(x1,y1,z1,r1);
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int z2 = scanner.nextInt();
		double r2 = scanner.nextDouble();
		CSphere2 cs2 = new CSphere2(x2,y2,z2,r2);
		System.out.println("");
		System.out.println("");
		System.out.println("��X:");
		cs1.show();
		cs2.show();
		System.out.println("2 �y��ߪ��Z�� = "+cs1.distance(cs2));
		if(cs1.isIntersect(cs2)) {
			System.out.println("2 �y���IĲ");
		}else {
			System.out.println("2 �y�S�IĲ");
		}
		scanner.close();
	}

}
