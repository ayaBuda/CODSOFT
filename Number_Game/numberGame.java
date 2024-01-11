import  java.util.Random;
import java.util.Scanner;

public class numberGame{
    public static void main(String[] args){
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;

        int generatedNumber = random.nextInt(maxRange - minRange+1) + minRange;

        int noOfLives = 5;

        Scanner scanner =  new Scanner(System.in);
        System.out.println("WELCOME TO GUESS THE NUMBER!");
        System.out.println(generatedNumber);
        System.out.println("Number of lives: "+ noOfLives);


        while(noOfLives > 0){
            System.out.println("Please guess the number: ");
            int usersGuess = scanner.nextInt();

            if (generatedNumber == usersGuess){
                System.out.println("CONGRATULATIONS! You've Guessed It Correct!");
                break;
            }
            else {
                if(noOfLives == 0){
                   System.out.println("You Lose. The number was: "+generatedNumber); 
                }
                // if(generatedNumber != usersGuess){
                else if (usersGuess > generatedNumber){
                    System.out.println("Too High. Try again!");
                    noOfLives --;
                    System.out.println("Lives left: "+ noOfLives);
                }
                else if (usersGuess < generatedNumber){
                    System.out.println("Too Low. Try again!");
                    noOfLives --;
                    System.out.println("Lives left: "+ noOfLives);
                }
               
                
            }
            // }
            
           


        }


    }

}
