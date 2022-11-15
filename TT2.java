
import java.util.Scanner;

public class TT2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入多邊形的邊數及其長度，程序將為你顯示它的面積：");
		int n = input.nextInt();
		if (n < 3) {
			System.out.println("錯誤的邊輸入！");
			System.exit(0);
		}
		int side = input.nextInt();
		if (side < 0) {
			System.out.println("錯誤的邊長輸入！");
			System.exit(0);
		}
		double area = area(n, side);
		System.out.printf("此%3d邊形的面積是%6f", n, area);
		input.close();

	}

	public static double area(int n, int side) {
		double area = n * side * side / (4 * Math.tan(Math.PI / n));
		return area;

	}
	
	/*
	 * 
	 * 
	 * Scanner scanner = new Scanner(System.in); DecimalFormat f1 = new
	 * DecimalFormat("0.00");//輸出到小數點第2位
	 * 
	 * int num1 = scanner.nextInt();//整數(以空白字元區隔) float num2 =
	 * Float.parseFloat(scanner.next()); //浮點數 double num3 =
	 * Double.parseDouble(scanner.next());
	 * 
	 * String s1= scanner.next();//字串(不含空白字元) String s2=
	 * scanner.nextLine();//整行字串(含空白字元) String s[]=s1.split(" ");//將字串切割成陣列 int len
	 * = s1.length();//取得字串長度 char c = s1.charAt(i);//取得字元
	 * 
	 * System.out.println(f1.format(num3)); //輸出到小數點第2位
	 * 
	 * 3.字串切割 : StringTokenizer：
	 * 
	 * import java.util.*;
	 * 
	 * public class C1 { public static void main(String[] args) { Scanner cin = new
	 * Scanner(System.in); // ..... String str = cin.nextLine(); // String
	 * s[]=s1.split(" ");//將字串切割成陣列(多個空白會切成多個陣列元素) StringTokenizer st = new
	 * StringTokenizer(str); int n = st.countTokens(); // 計算Token數(多個空白不會切成多個陣列元素)
	 * int a[] = new int[n]; int i = 0; while (st.hasMoreTokens()) { a[i] =
	 * Integer.parseInt(st.nextToken()); i++; } } }
	 *  4.排序 :
	 * 
	 * Arrays.sort(a)
	 */
}