import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] wt=new int[n];
		int[] val=new int[n];
		int max=0;
		for(int i=0;i<n;i++) {
			wt[i] = scanner.nextInt();
			val[i] = scanner.nextInt();
		}
		int ks = scanner.nextInt();
		max=Knapsack(ks,wt,val,n);
		System.out.print(max);
		scanner.close();
	}

	public static int Knapsack(int W,int[] wt,int[] val,int n) {
		// TODO Auto-generated method stub
		if(n==0||W==0)
			return 0;
		if(wt[n-1]>W) {
			return Knapsack(W,wt,val,n-1);
		}else {
			return max(val[n-1]+Knapsack(W-wt[n-1],wt,val,n-1),Knapsack(W,wt,val,n-1));
		}
	}

	private static int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

}
