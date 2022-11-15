import java.util.Scanner;
import java.text.*;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		Scanner scanner = new Scanner(System.in);
		DecimalFormat f1 = new DecimalFormat("0.0");
		int x = scanner.nextInt();//分
		int y = scanner.nextInt();//秒
		int z = scanner.nextInt();//公里
		//（1 英哩等於 1.6 公里）
		double alltime = (60*x+y);
		double distance = z/1.6;
		double show = (distance/alltime)*3600;
		System.out.println("Speed = "+f1.format(show));
		scanner.close();
	}

}
