import java.util.Scanner;

public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String user_input= scanner.nextLine();//���r��(�t�ťզr��)
		int len = user_input.length();//���o�r�����
		String output="";
		char tt = user_input.charAt(0);
		int count = 1;
		for(int i=1;i<len;i++) {
			if(tt==user_input.charAt(i)) {
				count++;
			}else {
				output=output+count+(tt+"");
				count=1;
				tt=user_input.charAt(i);
			}
		}
		output=output+count+(tt+"");
		System.out.println(output);
		scanner.close();
	}

}
