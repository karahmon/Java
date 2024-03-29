import java.util.Scanner; 
class Main {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String day = input.next();
        
    switch(day){
        case "Monday": 
        System.out.println("Monday");
        break;

        case "Tuesday": 
        System.out.println("Tuesday");
        break;

        case "Wednesaday": 
        System.out.println("Wednesaday");
        break;

        case "Thursday": 
        System.out.println("Thursday");
        break;

        case "Friday": 
        System.out.println("Friday");
        break;

        case "Saturday": 
        System.out.println("Saturday");
        break;

        case "Sunday": 
        System.out.println("Sunday");
        break;
 
         default:
        System.out.println("The String is not A day");
        break;
    }
        
        }
    }
