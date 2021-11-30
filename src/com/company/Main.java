package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {
        private static int[] password = new int[4];


        public static void main(String[] args) {
randomNumber();
int radish = 0;
                for (int i = 0; i < 12; i++) {
                        int guessOne = numberGuess();
                        int guessTwo = numberGuess();
                        int guessThree = numberGuess();
                        int guessFour = numberGuess();
                        int counter = 0;
                        if (guessOne == password[0]){
                                System.out.println("Your first number is correct");
                                counter = counter + 1;
                        }
                        else{
                                System.out.println("Your first number is incorrect");
                        }
                        if (guessTwo == password[1]){
                                System.out.println("Your second number is correct");
                                counter = counter + 1;
                        }
                        else{
                                System.out.println("Your second number is incorrect");
                        }
                        if (guessThree == password[2]){
                                System.out.println("Your third number is correct");
                                counter = counter + 1;
                        }
                        else{
                                System.out.println("Your third number is incorrect");
                        }
                        if (guessFour == password[3]){
                                System.out.println("Your fourth number is correct");
                                counter = counter + 1;
                        }
                        else{
                                System.out.println("Your fourth number is incorrect");
                        }
                        if (counter == 4){
                                radish = 4;
                                break;
                        }
                        else{
                                System.out.println("Unlucky you have lost, you have " + (12 - i) + "more guesses");
                        }
                }
if (radish == 4){
        System.out.println("Congratulations you have won!");
}
else{
        System.out.println("Unlucky you have lost!");
}

        }


        public static int numberGuess() {
                Scanner input = new Scanner(System.in);
                int UserGuess = 0;
                boolean whileLoop = true;
                while (whileLoop) {
                        System.out.println("Please enter a number");
                        UserGuess = input.nextInt();
                        if (UserGuess < 10) {
                                whileLoop = false;
                        } else {
                                System.out.println("one number at a time please");
                        }
                }
                return UserGuess;
        }

        public static void randomNumber() {
                Random random = new Random();

                for (int i = 0; i < 4; i++) {
                        int RandomNumber = random.nextInt(9);
                        password[i] = RandomNumber;
                }
        }
}
