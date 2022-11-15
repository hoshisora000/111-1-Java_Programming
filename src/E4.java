
import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double[] wt = new double[n];
		double[] val = new double[n];
		double[][] p_test = new double[n][2];
		for (int i = 0; i < n; i++) {
			wt[i] = scanner.nextInt();
			val[i] = scanner.nextInt();
			p_test[i][0] = wt[i];
			p_test[i][1] = val[i] / wt[i];
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				if (p_test[i][1] < p_test[j][1]) {

					double[] temp = p_test[i];

					p_test[i] = p_test[j];

					p_test[j] = temp;

				}
			}
		}
		int num = 0;
		int total = 0;
		int ks = scanner.nextInt();
		while ((ks - p_test[num][0]) >= 0) {

			total = total + (int) (p_test[num][0]*p_test[num][1]);
			ks = ks - (int) p_test[num][0];
			num++;
		}
		
		if (ks != 0) {
			total = total + ( ks) * (int) p_test[num][1];
		}
		
		System.out.println(total);
		scanner.close();
	}

}
