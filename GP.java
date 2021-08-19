package arithmetic;
import java.util.Scanner;
public class GP {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  float a, r, i, tn;
		  int n;
		  float sum = 0;

		  System.out.print("Enter the first number of the G.P. series: ");
		  a = sc.nextInt();

		  System.out.print("Enter the total numbers in the G.P. series: ");
		  n = sc.nextInt();

		  System.out.print("Enter the common ratio of G.P. series: ");
		  r = sc.nextInt();

		  sum = (float)((a * (1 - Math.pow(r, n + 1))) / (1 - r));
		  tn = (float)(a * (1 - Math.pow(r, n - 1)));

		  System.out.println("tn term of G.P.:"+tn);
		  System.out.println("Sum of the G.P.:"+sum);
		 }
	}


