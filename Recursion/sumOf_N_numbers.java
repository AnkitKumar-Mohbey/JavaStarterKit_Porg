package Recursion;
import java.util.Scanner;

public class sumOf_N_numbers {
	
	public static void print(int n) {
		if(n < 0) {
			return;
		}
		if(n == 0) {
			System.out.print(n);
			return;
		}
		print (n--);
		System.out.print(n + " ");
	}
	
//	The sum of first N natural numbers
//	public static int f(int n) {
//		if(n == 1) 
//			return 1;
//		int ans = f(n-1);
//		return ans + n;
//	}
	
//	Factorial of a Number
//	public static int fact(int n) {
//		if(n == 0)
//			return 1;
//		int ans = fact(n-1);
//		return ans * n;
//	}
	
//	Fibonacci Number
//	public static int fibo(int n) {
//		if(n <= 1)
//			return n;
//		int ans = f(n-1) + f(n-2);
//		return ans;
//	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter number :- ");
		int n = scan.nextInt();
//		System.out.println("Sum of N number's is\n" + f(4) + "\n");		
//		System.out.println("factorial of that number is \n"+ fact(5) + "\n");		
//		System.out.println("fabonic of number is \n"+ fibo(5));

	}

}

