import java.util.*;
import java.io.*;
class RockPaperScissor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] moves = {"rock", "paper", "scissors"};
        Random random = new Random();
        while (true) 
        {
            String computermove = moves[random.nextInt(moves.length)];
            System.out.print("Enter your move (rock, paper, scissors):");
            String playermove = sc.nextLine();

            if (playermove.equals(computermove)) 
            {
                System.out.println("Computer's Move is " + computermove);
                System.out.println("Player's Move is " + playermove);
                System.out.println("It's a tie!");
            } 
            else if (playermove.equals("rock")) 
            {
                if (computermove.equals("paper")) {
                    System.out.println("Computer's Move is " + computermove);
                    System.out.println("Player's Move is " + playermove);
                    System.out.println("Computer Wins! You Lose!");
                } else if (computermove.equals("scissors")) {
                    System.out.println("Computer's Move is " + computermove);
                    System.out.println("Player's Move is " + playermove);
                    System.out.println("You Win! Computer Loses!");
                }
            } 
            else if (playermove.equals("paper")) 
            {
                if (computermove.equals("rock")) {
                    System.out.println("Computer's Move is " + computermove);
                    System.out.println("Player's Move is " + playermove);
                    System.out.println("You Win! Computer Loses!");
                } else if (computermove.equals("scissors")) {
                    System.out.println("Computer's Move is " + computermove);
                    System.out.println("Player's Move is " + playermove);
                    System.out.println("Computer Wins! You Lose!");
                }
            } 
            else if (playermove.equals("scissors")) 
            {
                if (computermove.equals("paper")) {
                    System.out.println("Computer's Move is " + computermove);
                    System.out.println("Player's Move is " + playermove);
                    System.out.println("You Win! Computer Loses!");
                } else if (computermove.equals("rock")) {
                    System.out.println("Computer's Move is " + computermove);
                    System.out.println("Player's Move is " + playermove);
                    System.out.println("Computer Wins! You Lose!");
                }
            } 
            else 
            {
                System.out.println("Invalid move! Please enter rock, paper, or scissors.");
                continue;
            }

            System.out.println();
            System.out.print("Do you want to play again? (yes/no): ");
            String again = sc.nextLine();
            if (again.equals("no") || again.equals("n")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
        sc.close();
    }
}
