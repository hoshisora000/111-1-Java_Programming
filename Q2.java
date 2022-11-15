import java.util.Scanner;
import java.text.*;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat f1 = new DecimalFormat("0.00");
		int money = scanner.nextInt();
		int rate = scanner.nextInt();
		int n = scanner.nextInt();
		double show = money;
		for (int i = 0; i < n; i++) {
			show = show * (1 + (0.01 * rate));
		}
		System.out.println(f1.format(show));
		scanner.close();
	}
}
