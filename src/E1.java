import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s1= scanner.next();//�r��(���t�ťզr��)
		int len = s1.length();//���o�r�����
		char temp=s1.charAt(0);
		int count=1;
		String sol="";
		for(int i =1;i<len;i++) {

			char c = s1.charAt(i);//���o�r��
			if(temp==c) {
				count++;
			}else {
				if(count>2) {
					sol=sol+count+temp;
				}else if(count==2) {
					sol=sol+temp+temp;
				}else {
					sol=sol+temp;
				}
				temp = c;
				count=1;
			}

			
		}
		if(count>2) {
			sol=sol+count+temp;
		}else if(count==2) {
			sol=sol+temp+temp;
		}else {
			sol=sol+temp;
		}
		System.out.println(sol); //��X��p���I��2��
		scanner.close();
	}

}
