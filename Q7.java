
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int i=1,list=0;
		while(true) {
			int cc=i;
			while(cc%2==0) {
				cc=cc/2;
			}
			while(cc%3==0) {
				cc=cc/3;
			}
			while(cc%5==0) {
				cc=cc/5;
			}
			if(cc==1) {
				list++;
				if(list==number)
					break;
			}
			i++;
		}
		System.out.println(i);
		scanner.close();
	}

}
