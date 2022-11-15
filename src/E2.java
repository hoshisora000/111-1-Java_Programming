import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		int[] userin=new int[amount];
		int[] show_ans=new int[amount];
		for(int i=0;i<amount;i++) {
			userin[i] = scanner.nextInt();
		}
		for(int i=0;i<amount;i++) {
			int x=userin[i];
			int[] check=new int[x];
			int count=0;
			for(int j=1;j<x;j++) {
				if(x%j==0) {
					check[count]=j;
					count++;
				}
			}
			int sum=0;
			for(int j=0;j<count;j++) {
				sum=sum+check[j];
			}
			if(sum>x) {
				show_ans[i]=1;
			}else if(sum==x) {
				show_ans[i]=3;
			}else if(sum<x) {
				show_ans[i]=2;
			}else {
				show_ans[i]=4;
			}
		}
		for(int i=0;i<amount;i++) {
			System.out.println(show_ans[i]); //輸出到小數點第2位
		}
		scanner.close();
	}

}
