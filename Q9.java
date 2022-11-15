
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		int[] userin = new int[amount];
		int[] ans_show = new int[amount];
		int ans_show_amount = 0;
		for (int i = 0; i < amount; i++) {
			userin[i] = scanner.nextInt();
			int check = 0;
			for (int j = 2; j < userin[i]; j++) {
				if (userin[i] % j == 0) {
					check = 1;
					break;
				}
			}
			String user_s = userin[i] + "";
			for (int j = 0; j < user_s.length() / 2; j++) {
				int ind = user_s.length() - 1;
				if (user_s.charAt(j) == user_s.charAt(ind - j)) {

				} else {
					check = 1;
				}
			}
			if (check == 0) {
				ans_show[ans_show_amount] = userin[i];
				ans_show_amount++;
			}
		}
		for (int i = 0; i < ans_show_amount; i++) {
			for (int j = i + 1; j < ans_show_amount; j++) {

				if (ans_show[i] > ans_show[j]) {

					int temp = ans_show[i];

					ans_show[i] = ans_show[j];

					ans_show[j] = temp;

				}
			}
		}
		System.out.print(ans_show[0]);
		for (int i = 1; i < ans_show_amount; i++) {
			System.out.print(" " + ans_show[i]);
		}
		scanner.close();
	}

}

