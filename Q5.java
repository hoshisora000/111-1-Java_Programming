import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String userin = scanner.nextLine();
		String userin_split[]=userin.split(" ");//�N�r����Φ��}�C
		int userin_length = userin_split[0].length();
		int m=0,n=0;
		for(int i = 0;i<userin_length;i++) {
			for(int j=0;j<userin_length;j++) {
				if(userin_split[0].charAt(i) == userin_split[1].charAt(j)) {
					if(i==j) {
						m++;
					}else {
						n++;
					}
					break;
				}
			}

		}
		System.out.println(m+" "+n); //��X��p���I��2��
		scanner.close();
	}

}
