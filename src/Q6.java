import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int total= climbStairs(a);
		
		System.out.println(total);
		scanner.close();
	}
	
	public static int climbStairs(int n) {
	    if( n == 1 || n == 0 )
	        return 1;
	    return climbStairs(n - 1) + climbStairs(n - 2);
	}
}

