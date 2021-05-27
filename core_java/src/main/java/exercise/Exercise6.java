package exercise;
//: Create a class with a method to find the difference between the sum of the 
//squares and the square of the sum of the first n natural numbers.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise6 {
	
	public static void calculateDifference () throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a Number:");
	String num=br.readLine();
	int c=Integer.parseInt(num);
	
		int sum=0;
		 int count = 0;
		int a=0;
		double k = 0;
		for(int i=1;i<=c;i++)
		{
			sum=sum+(i*i);
			count++;
			
		}
		System.out.println(sum);
		for(int i=1;i<=c;i++) {
			k=k+i;
			a=(int) Math.pow(k, 2);
		}

		System.out.println(a);
		System.out.println(sum-a);
	}
	


	public static void main(String[] args) throws IOException {
		calculateDifference ();
	}
}