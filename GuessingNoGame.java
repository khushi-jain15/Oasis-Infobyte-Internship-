

import java.util.Scanner;
public class GuessingNoGame {
    public static void main(String args[]) 
    {
        Scanner ishi = new Scanner(System.in);
        int Sys_no=(int)(Math.random() * 99 + 1); 
        int Lets_Try = 0;
        int Attempts_Till_Now = 01;         

        System.out.print("Welcome to the guessing number game!!");
        System.out.println("");
        System.out.print("Try to Guess the correct number and win the game!");
        System.out.println("");
        System.out.println("You have max 5 Attempts.");

        do {

            System.out.print("Guess number between 1 to 100");
            System.out.println("");

            if(ishi.hasNextInt()) {
                Lets_Try = ishi.nextInt();
                if (Lets_Try == Sys_no)
                {    
                    System.out.print("OH My God, Your Number is Correct and You Won the Game! ");
                    System.out.println("");
                    System.out.print(" Great Guess champ! ");
                    System.out.println("");
                    break;
                }
                else if (Lets_Try < Sys_no){
                    System.out.print("Hey! Your Number is Smaller!");
                    System.out.println("");
                }
                    
                else if (Lets_Try > Sys_no){
                    System.out.print("Hey! Your Number is Greater!");
                    System.out.println("");
                }
                    
                if(Attempts_Till_Now == 5) {
                    System.out.print("You have exceeded the max attempts. \n Please Try Again Later !");
                    System.out.println("");
                    break;
                }
                Attempts_Till_Now++;
            }
            else {
                System.out.println("Enter A Valid Number Within The Range");
                break;
            }
        } while (Lets_Try!=Sys_no);
    }
}