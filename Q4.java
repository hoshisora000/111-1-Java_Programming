import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String userin = scanner.nextLine();
		String start_end[]=userin.split(" ");//將字串切割成陣列
		int total=0;
		for(int i = Integer.parseInt(start_end[0]);i <= Integer.parseInt(start_end[1]);i++) {
			total = (int) (total + Math.pow(2, i));
		}
		
		System.out.println(total); //輸出到小數點第2位
		scanner.close();
	}

}
