import java.util.Scanner;

public class E3 {

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
			System.out.println(num+" "+z+" "+point); //��X��p���I��2��
		}
		scanner.close();
	}

}
