package exercise;
//calculate the sum of first n natural numbers which are divisible by 3 or 5
import java.util.Scanner;
public class Exercise5 {
	
	public static void main(String[] args) {
		int i, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		sc.close();
		
		for(i = 1; i < n; ++i)  
		{  
			if (n % 3 == 0 || n % 5 == 0) {
				
		   sum = sum + i;  
		}  }
		 
		System.out.println("Sum of First 10 Natural Numbers is = " + sum);  

	}

}
