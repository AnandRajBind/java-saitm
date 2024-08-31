
import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float hindi, english, maths, science, socialScience, total, percentage;

        System.out.println("Enter the marks of Hindi: ");
        hindi = sc.nextFloat();

        System.out.println("Enter the marks of English: ");
        english = sc.nextFloat();

        System.out.println("Enter the marks of Math: ");
        maths = sc.nextFloat();

        System.out.println("Enter the marks of science: ");
        science = sc.nextFloat();

        System.out.println("Enter the marks of SocialScience: ");
        socialScience = sc.nextFloat();

        total = hindi + english + maths + science + socialScience;
        System.out.println("Total marks is: " + total);

        percentage = (total / 500) * 100;
        System.out.println("Your Percentage is: " + percentage);

    }
}
