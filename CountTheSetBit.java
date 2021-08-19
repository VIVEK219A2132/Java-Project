package arithmetic;
import java.util.Scanner;
public class CountTheSetBit {
	
	public static void main(String args[])
    {
      int a;
      Scanner sc= new Scanner(System.in);
	  System.out.println("Enter a number to find which bits are to be checked:");
	  a=sc.nextInt();
      System.out.println("There are " +CountNoSetBits(a)+" set bits in "+a);
    }

	static int CountNoSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

	}

