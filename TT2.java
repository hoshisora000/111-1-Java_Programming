
import java.util.Scanner;

public class TT2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�h��Ϊ���ƤΨ���סA�{�ǱN���A��ܥ������n�G");
		int n = input.nextInt();
		if (n < 3) {
			System.out.println("���~�����J�I");
			System.exit(0);
		}
		int side = input.nextInt();
		if (side < 0) {
			System.out.println("���~�������J�I");
			System.exit(0);
		}
		double area = area(n, side);
		System.out.printf("��%3d��Ϊ����n�O%6f", n, area);
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
	 * DecimalFormat("0.00");//��X��p���I��2��
	 * 
	 * int num1 = scanner.nextInt();//���(�H�ťզr���Ϲj) float num2 =
	 * Float.parseFloat(scanner.next()); //�B�I�� double num3 =
	 * Double.parseDouble(scanner.next());
	 * 
	 * String s1= scanner.next();//�r��(���t�ťզr��) String s2=
	 * scanner.nextLine();//���r��(�t�ťզr��) String s[]=s1.split(" ");//�N�r����Φ��}�C int len
	 * = s1.length();//���o�r����� char c = s1.charAt(i);//���o�r��
	 * 
	 * System.out.println(f1.format(num3)); //��X��p���I��2��
	 * 
	 * 3.�r����� : StringTokenizer�G
	 * 
	 * import java.util.*;
	 * 
	 * public class C1 { public static void main(String[] args) { Scanner cin = new
	 * Scanner(System.in); // ..... String str = cin.nextLine(); // String
	 * s[]=s1.split(" ");//�N�r����Φ��}�C(�h�Ӫťշ|�����h�Ӱ}�C����) StringTokenizer st = new
	 * StringTokenizer(str); int n = st.countTokens(); // �p��Token��(�h�Ӫťդ��|�����h�Ӱ}�C����)
	 * int a[] = new int[n]; int i = 0; while (st.hasMoreTokens()) { a[i] =
	 * Integer.parseInt(st.nextToken()); i++; } } }
	 *  4.�Ƨ� :
	 * 
	 * Arrays.sort(a)
	 */
}