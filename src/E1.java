import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s1= scanner.next();//字串(不含空白字元)
		int len = s1.length();//取得字串長度
		char temp=s1.charAt(0);
		int count=1;
		String sol="";
		for(int i =1;i<len;i++) {

			char c = s1.charAt(i);//取得字元
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
		System.out.println(sol); //輸出到小數點第2位
		scanner.close();
	}

}
