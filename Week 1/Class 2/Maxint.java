//Find Max Of Two Integer
import java.util.Scanner; // need to always initialise
class Main {
    public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);// need to initalise there to take input
		int int1 = input.nextInt();// syntax for adding input
		int int2 = input.nextInt();
		int int3 = input.nextInt();

		if(int1>= int2 && int1>=int3){
			System.out.println(int1);
		}
		else if(int1<=int2 && int2>=int3){
			System.out.println(int2);
		}
		else{
			System.out.println(int3);
		}
		
		}
    }
