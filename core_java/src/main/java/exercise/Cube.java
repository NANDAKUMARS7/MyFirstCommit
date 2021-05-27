package exercise;
import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Cube {
     public static int sum(int n) {
    	 int s=0;
    	 while (n>0) {
    		 int r=n%10;
    		 s=s+(r*r*r);
    		 n=n/10;
    	 }
    	 return s;
     }
     
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a value");
		String b1=br.readLine();
		int n=Integer.parseInt(b1);
		
		System.out.println("Your solution is: "+sum(n));

	}

}
