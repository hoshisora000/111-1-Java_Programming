

	import java.util.Scanner;

	public class tt {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("�п�J�C�� : ");
	        int a = sc.nextInt();
	        System.out.print("�п�J��� : ");
	        int b = sc.nextInt();
	        int[][] input = new int[a][b];
	        int[][] out = new int[b][a];
	        for(int x = 0;x < input.length ;x++){
	            for(int y = 0; y < input[x].length ; y++){
	                System.out.print("�п�J�}�C[" + x + "][" + y + "] = ");
	                int in = sc.nextInt();
	                input[x][y] = in;
	                out[y][x] = in;
	            }
	        }
	        for(int x = 0;x < input.length ;x++){
	            for(int y = 0; y < input[x].length ; y++){
	                System.out.print(" " + input[x][y]);
	            }
	            System.out.println();
	        }
	        for(int x = 0 ; x < out.length ;x++){
	            for(int y = 0; y < out[x].length ; y++){
	                System.out.print(" " + out[x][y]);
	            }
	            System.out.println();
	        }
	        sc.close();
	    }
	}
	 
