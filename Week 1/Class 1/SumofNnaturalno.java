 //Given a value of N, print the sum of first of N natural No
//Formula= N*(N+1)/2;
import java.util.Scanner; // need to always initialise
class Main {
    public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);// need to initalise there to take input
		int n = sc.nextInt();// syntax for adding input
		int sum =(n*(n+1))/2;
		System.out.println(sum);

		//sc.nextDouble()->double
		//sc.nextFloat()-->Float
    }
}