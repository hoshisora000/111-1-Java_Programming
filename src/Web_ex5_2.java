	class CTriangle{
		private String color;
		private int base;
		private int height;
		
		public void setB(int b) {
			this.base=b;
		}
		
		public void setH(int h) {
			this.height=h;
		}
		
		public void setColor(String color) {
			this.color=color;
		}
		
		public CTriangle() {
			this.base=10;
			this.height=5;
			this.color="blue";
		}
		
		public CTriangle(int b, int h, String c) {
			this.setB(b);
			this.setH(h);
			this.setColor(c);
		}
		
		public void show() {
			System.out.println("Color=" + this.color);
			System.out.println("base=" + this.base + ", height=" + this.height);
		}
	}
public class Web_ex5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTriangle ctr1 =new CTriangle();
		CTriangle ctr2 =new CTriangle(30,10,"red");
		ctr1.show();
		System.out.println();
		ctr2.show();
		System.out.println();
		System.out.println("Process completed.");
		
	}

}
