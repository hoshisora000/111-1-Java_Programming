import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s2= scanner.nextLine();//���r��(�t�ťզr��)
		String s[]=s2.split(" ");//�N�r����Φ��}�C
		String user_input = s[0];
		int len = user_input.length();//���o�r�����
		
		String tt = s[1].toLowerCase();
		String TT = s[1].toUpperCase();
		char finding_L = tt.charAt(0);
		char finding_U =TT.charAt(0);
		int amount=0;
		int space=0;
		int[] sol=new int[30];
		for(int i=0;i<len;i++) {
			space++;
			char check = user_input.charAt(i);
			if(check==finding_L||check==finding_U) {
				sol[amount]=space;
				amount++;
				space=0;
			}
		}
		String ans="";
		for(int i=0;i<amount;i++) {
			ans=ans+" "+sol[i];
		}
		System.out.println(ans.substring(3));
		scanner.close();
	}

}
