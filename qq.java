import java.util.Scanner;

public class qq {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int x = scanner.nextInt();//�f�n����
			int y = scanner.nextInt();//�I��
			int z = scanner.nextInt();//�h�ֿ�
			
			if(x<=0||z<=0||y<=0||y==1) {
				break;//���ծרҵ���
			}

			if((z-x)>=0) {
				System.out.println(z); //��X��p���I��2��
			}
			
		}
		scanner.close();
	}
}