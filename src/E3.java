import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int x = scanner.nextInt();//口罩價格
			int y = scanner.nextInt();//點數
			int z = scanner.nextInt();//多少錢
			
			if(x<=0||z<=0||y<=0||y==1) {
				break;//測試案例結束
			}
			
			int num=0;
			int point=0;
			while((z-x)>=0) {
				num++;
				point++;
				z=z-x;
			}
			while((point-y)>=0) {
				num++;
				point++;
				point=point-y;
			}
			System.out.println(num+" "+z+" "+point); //輸出到小數點第2位
		}
		scanner.close();
	}

}
