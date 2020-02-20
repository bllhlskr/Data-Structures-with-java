package recursion;

import java.util.Scanner;

public class Recursion {
	static Scanner sc = new Scanner(System.in);
	static int a;

	public static void main(String[] args) {
			
		//System.out.println("\nCounttown (20)(recursive - return type:void)");
		//countdown(20);
		//System.out.println(fibo(9));
	
		System.out.println(factorial(5));
	}

	private static void countdown(int i) {
		if (i > 0) {
			System.out.print(i + " ");
			countdown(i - 1);
		} else
			return;
	}


	private static int fibo(int n) {
		if(n<=2) {
			return 1;
		}else {
			return fibo(n-1)+fibo(n-2);
		}
	}

	private static int factorial(int i) {
		 if (i == 0)    
			    return 1;    
			  else    
			    return(i * factorial(i-1));  
	}
	

}