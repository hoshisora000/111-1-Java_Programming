import java.util.Scanner;
import java.text.*;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat f1 = new DecimalFormat("0.00");//輸出到小數點第2位
		float num1= Float.parseFloat(scanner.next());
		float num2= Float.parseFloat(scanner.next());
		float num3= Float.parseFloat(scanner.next());
		System.out.println(f1.format((num1+num2)*num3/2)); //輸出到小數點第2位
		scanner.close();
		
	}

}
