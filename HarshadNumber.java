package arithmetic;
import java.util.Scanner;
public class HarshadNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
	        int num ,rem = 0, sum = 0, n;  
	          System.out.println("Enter a number to be checked: ");
			  num = sc.nextInt();

	        n = num; //152 
	         
	        while(num > 0){  //152>0=? Y
	            rem = num%10; //->2 
	            sum = sum + rem;  //0+2=2
	            num = num/10;  //15.2
	        }  
	          
	        if(n%sum == 0)  //0
	            System.out.println(n + " is a harshad number");  
	        else  
	            System.out.println(n + " is not a harshad number");  
	    }

	}


