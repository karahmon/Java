// If Else Statement
import java.util.Scanner; // need to always initialise
class Main {
    public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);// need to initalise there to take input
		int marks1 = input.nextInt();// syntax for adding input
		int marks2 = input.nextInt();

		//Ternary Operator
		boolean passed= marks1>33?true:false;
		System.out.println(passed);

		//If-Else Statement
		if(marks1>=40 && marks2>=40){
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		if(marks1>=30 && marks2>=30){
			System.out.println("Pass");
		}
		else if((marks1>=30 || marks2>=30)) {
			System.out.println("Failed in 1");
		}
		else{
			System.out.println("Failed in Both Subject");
		}
    }
}