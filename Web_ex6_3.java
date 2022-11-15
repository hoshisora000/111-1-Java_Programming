import java.util.Scanner;

class Subject // �����OSubject
{
	double mid_score; // �����Ҧ��Z
	double final_score;// �����Ҧ��Z
	double quiz; // �p�Ҧ��Z

	public Subject() {
	}

	public Subject(double m, double f, double q) {
		this.mid_score = m;
		this.final_score = f;
		this.quiz = q;
	}

	public double score() {
		return mid_score * 0.4 + final_score * 0.4 + quiz * 0.2;
	}
}

class Chinese extends Subject{
	Chinese(double m, double f){
		this.mid_score=m;
		this.final_score=f;
	}
	
	@Override
	public double score() {
		// TODO Auto-generated method stub
		return mid_score * 0.5 + final_score * 0.5;
	}
}

class English extends Subject{
	English(double f, double q){
		this.final_score = f;
		this.quiz = q;
	}
	@Override
	public double score() {
		// TODO Auto-generated method stub
		return final_score * 0.7 + quiz * 0.3;
	}
}

public class Web_ex6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int amount = scanner.nextInt();//���(�H�ťզr���Ϲj)
		Subject data[]=new Subject[amount];
		
		for(int i=0;i<amount;i++) {
			int subject = scanner.nextInt();//���(�H�ťզr���Ϲj)
			int data1=scanner.nextInt();//���(�H�ťզr���Ϲj);
			int data2 =scanner.nextInt();//���(�H�ťզr���Ϲj)
			if(subject==1) {
				data[i] = new Chinese(data1,data2);
			}else if(subject==2) {
				data[i] = new English(data1,data2);
			}else {
				System.out.println("��ؿ�J���~");
				i=i-1;
			}
		}
		double max_area=data[0].score();
		for(int i=1;i<amount;i++) {
			max_area=Math.max(max_area, data[i].score());
		}
		System.out.println(max_area);
		scanner.close();
	}

}
