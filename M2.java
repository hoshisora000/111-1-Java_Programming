import java.util.Scanner;

class EmployeeDefault // 父類別
{
	String empl_no; //人員編號
	double salary; //基本薪資
	public EmployeeDefault () {
	}
	public EmployeeDefault (String n, double s) {
		this. empl_no = n;
		this. salary = s;
	}

	public double getMonthMoney() {
		return salary;
	}
} 

class Employee extends EmployeeDefault {
	int skill;
	int other_work_pay;
	int other_work_hour;

	public Employee(String no,int in1,int in2,int in3) {
		super(no, in1);
		skill=in2;
		other_work_hour =in3;
	}

	public int getother_work() {
		return (int) (salary + skill) / 240;
	}

	public double getMonthMoney() {
		other_work_pay = getother_work();
		return salary + skill + other_work_pay*other_work_hour;
	}

}

class Manager extends EmployeeDefault{
	int skill;
	int M_add;

	public Manager(String no, int in1, int in2, int in3) {
		super(no, in1);
		skill = in2;
		M_add = in3;
	}
	public double getMonthMoney() {
		return salary + skill + M_add;
	}
}

public class M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());//整數(以空白字元區隔)
		EmployeeDefault data[]=new EmployeeDefault[num];
		for(int i=0;i<num;i++) {
			String s2= scanner.nextLine();//整行字串(含空白字元)
			String s[]=s2.split(" ");//將字串切割成陣列
			String people_no= s[0];
			int in_1 = Integer.parseInt(s[1]);
			int in_2 = Integer.parseInt(s[2]);
			int in_3 = Integer.parseInt(s[3]);
			if(people_no.charAt(0)=='E') {
				data[i] = new Employee(people_no,in_1,in_2,in_3);
			}else if(people_no.charAt(0)=='M') {
				data[i] = new Manager(people_no, in_1, in_2, in_3);
			}
		}
		int max=0;
		for(int i=0;i<num;i++) {
			if(data[i].getMonthMoney()>max) {
				max =(int) data[i].getMonthMoney();
			}
		}
		System.out.println(max);
		scanner.close();
	}

}
