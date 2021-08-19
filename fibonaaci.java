package arithmetic;
import java.util.Scanner;
public class fibonaaci {


public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		Fibonacci(num);

	}
	
	public static void Fibonacci(int n) {
		
		int a=0, b=1, c=0;
		System.out.print(a+" "+b+" ");
		
		for(int i=1; i<=n-2; i++) {
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
