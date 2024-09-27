import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNuOfGuesses() {
        return noOfGuesses;
    }

    public void setNuOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();

        this.number = rand.nextInt(100);
        // System.out.println("Random number is " + num);
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1 to 100");
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes you guessed it right, it was %d \n  you guessed it in %d attempts", number,
                    noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("please input the high number, it is low number ");
        } else if (inputNumber > number) {
            System.out.println("please input the lower number, it is high number ");
        }
        return false;
    }
}

class GuessTheNumber {
    public static void main(String[] args) {
        boolean b = false;
        Game g = new Game();
        while (b != true) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            // System.out.println(b);
        }
    }
}
