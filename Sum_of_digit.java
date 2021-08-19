package arithmetic;
import java.util.Scanner;
public class Sum_of_digit {

	
	@SuppressWarnings("resource")
	public static void main(String[] args)
    {
        int n ;
       	Scanner sc = new Scanner(System.in);
       	System.out.println("Enter a number u want to add:");
		  n = sc.nextInt();
		  int sum = 0;
		  
	        while (n != 0) {
	            sum = sum + n % 10;//2
	            n = n / 10;//15.2
	        }
        System.out.println("Your ans is: "+sum);
    }
}
