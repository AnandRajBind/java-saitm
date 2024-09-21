import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        // 0 for Rock // pathar or stone
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: 0 for Rock, 1 for Paper, 2 for Scissor");
        int userInput = sc.nextInt();

        Random rand = new Random();
        int computerChoice = rand.nextInt(3);
        if (userInput == computerChoice) {
            System.out.println("It's a Draw!");
        } else if (userInput == 0 && computerChoice == 2 || userInput == 1 && computerChoice == 0
                || userInput == 2 && computerChoice == 1) {
            System.out.println("You Win!");
        }

        else  {
            System.out.println("Computer Wins!");
        }
        // 0 for Rock // pathar or stone
        // 1 for Paper
        // 2 for Scissor
    
            // System.out.println("Computer Choice: " + computerChoice);
   
            if(computerChoice == 0){
                System.out.println("Computer Choice: Rock");
            }
            else if(computerChoice == 1){
                System.out.println("Computer Choice: Paper");
            }
            else{
                System.out.println("Computer Choice: Scissor");
            }
    }
}