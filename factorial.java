package arithmetic;
import java.util.Scanner;
public class factorial {
	 static int factoria(int n)
	    {
	        int res = 1, i;
	        for (i = 2; i <= n; i++)
	            res *= i;
	        return res;
	    }
	  
	    @SuppressWarnings("resource")
		public static void main(String[] args)
	    {
	    	Scanner sc = new Scanner(System.in);
	        int num;//5
	        System.out.println("Enter a number u want: ");
	  	    num = sc.nextInt();
	        System.out.println("Factorial of " + num + " is: " + factoria(num));
	    }
}
