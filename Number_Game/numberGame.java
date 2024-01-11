import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.util.Random;
// import java.util.Scanner;

public class numberGame{

    private JFrame frame;
    private JTextField guessField;
    private JTextArea outputArea;
    private JButton guessButton;

    private int minRange = 1;
    private int maxRange = 100;
    private int generatedNumber;
    private int noOfLives = 5;

     public static void main(String[] args){
       SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run(){
            new numberGame();
        }
       });

        }

    private void setupUI(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new java.awt.FlowLayout());

        guessButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                getGuesses();
            }
        });

        frame.add(new JLabel("Please guess the number: "));
        frame.add(guessField);
        frame.add(guessButton);
        frame.add(new JScrollPane(outputArea));
        frame.setVisible(true);
    }

    private void startOfGame(){
        Random random = new Random();
        int generatedNumber = random.nextInt(maxRange - minRange+1) + minRange;

        outputArea.append("WELCOME TO GUESS THE NUMBER!\n");
        outputArea.append("Try guessing a number between 1 to 100.");
        outputArea.append("Number of Lives: "+ noOfLives + "\n");
    }

    private void getGuesses(){
        try{
            int usersGuess = Integer.parseInt(guessField.getText());
            if (generatedNumber == usersGuess){
                System.out.println("CONGRATULATIONS! You've Guessed It Correct!");
                endGame();
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
        }
        catch(NumberFormatException ex){
            outputArea.append("Invalid Number.\n");
            }

        guessField.setText("");
        
    }

    private void endGame(){
        guessField.setEnabled(false);
        guessButton.setEnabled(false);
    }

    

    }


