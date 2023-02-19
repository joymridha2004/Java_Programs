package Normal_Programs;

import java.util.Random;
import java.util.Scanner;

class Game {

    private final int Number;
    private static int NumberOfGuess;
    public int InputNumber;

    Game() {
        Random random = new Random();
        Number = random.nextInt(100);
        InputNumber = 0;
    }

    public int getNumberOfGuess() {
        return NumberOfGuess;
    }

    public void setNumberOfGuess(int numberOfGuess) {
        NumberOfGuess = numberOfGuess;
    }

    public void TakeUserInput() {
        Scanner sc = new Scanner(System.in);
        InputNumber = sc.nextInt();
    }

    public boolean IsCorrectNumber() {
        if (Number == InputNumber) {
            return true;
        } else if (Number < InputNumber) {
            System.out.print("Enter Smaller Number: ");
        } else {
            System.out.print("Enter Bigger  Number: ");
        }
        return false;
    }
}

public class guess_The_Number {

    public static void main(String[] args) {

        Game game = new Game();
        boolean Input = false;
        System.out.print("Enter Number: ");

        while (!Input) {
            game.TakeUserInput();
            Input = game.IsCorrectNumber();
            game.setNumberOfGuess(game.getNumberOfGuess() + 1);
        }
        System.out.println("You number of guess is : " + game.getNumberOfGuess());

    }
}
