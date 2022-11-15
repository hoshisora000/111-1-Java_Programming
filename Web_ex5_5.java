import java.util.Scanner;

class CNumber {
	int num;

	public CNumber(int n) {
		num = n;
	}

	public boolean prime() {
		int flag = 1;
		if (num == 1)
			return false;
		for (int i = 2; i < num; i++)
			if (num % i == 0) {
				flag = 0;
				break;
			}
		if (flag == 1)
			return true;
		else
			return false;
	}
}

public class Web_ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int count=0;
		String show="";
		for(int i =x;i<=y-4;i++) {
			CNumber number1=new CNumber(i);
			CNumber number2=new CNumber(i+4);
			if(number1.prime()&&number2.prime()) {
				if(count==0) {
					show="("+i+","+(i+4)+")";
				}else {
					show=show+", ("+i+","+(i+4)+")";
				}
				count++;
			}
		}
		System.out.println(show+" ¦@"+count+"²Õ");
		scanner.close();
	}

}
