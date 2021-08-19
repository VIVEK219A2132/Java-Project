package arithmetic;
import java.util.Scanner;
public class AP {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int a, d, n, tn;
		  int sum = 0;

		  System.out.print("Enter the first number of the A.P. series: ");
		  a = sc.nextInt();

		  System.out.print("Enter the difference of A.P. series: ");
		  d = sc.nextInt();

		  System.out.print("Enter the total numbers in the A.P. series: ");
		  n = sc.nextInt();

		  sum = (n * (2 * a + (n - 1) * d)) / 2;
		  tn = a + (n - 1) * d;//9
		  System.out.print("Sum of the series A.P.: ");

		  for (int i = a; i <= tn; i = i + d) 
		  {
		   if (i != tn) 
		   {
		    System.out.print(i + " + ");
		   } else 
		   {
		    System.out.print(i + " = " + sum + " ");
		   }
		  }
	}

}
