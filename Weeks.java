
import java.util.Scanner;

public class Weeks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your days");
        String days = sc.nextLine(); 

        switch (days) {  //
            case "Sunday":
                System.out.println("Sunday");
                break;

            case "Monday":
                System.out.println("Monday ");
                break;

            case "Tuesday":
                System.out.println("Tuesday");
                break;

            case "Wednesday":
                System.out.println("Wednesday");
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
            default:
                System.out.println("Invalid Days");
                break;
        }

    }
}
