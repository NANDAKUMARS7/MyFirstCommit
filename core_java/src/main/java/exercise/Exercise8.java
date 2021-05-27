package exercise;
import java.util.Scanner;
//Create a method to check if a number is a power of two or not
public class Exercise8 {

	static boolean exercise8(int n)
	{
		if(n==0)
		    return false;
		 
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
		       (int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of to check it is the power of 2 or not:");
		int n = sc.nextInt();
		sc.close();
		
		if(exercise8(n))
		    System.out.println("Yes, "+n+" is a power of 2");
		    else
		    System.out.println("No, "+n+" is not a power of 2");

	}

}
