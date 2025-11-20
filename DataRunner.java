import java.util.Scanner;

public class DataRunner {
      /**
     * Main method serves as the tester class for UserStory.
     * It creates an instance of UserStory using data from text files
     * and prints the best deck based on win rates.
     */
  public static void main(String[] args) {
           // Create a UserStory object with data from text files
    UserStory hi = new UserStory("names.txt", "winRate.txt", "usage.txt", "elixirCost.txt");
        // prints the cards and their values
        System.out.println(hi.toString());       
    // Print the best deck of 8 cards determined by win rate
    System.out.println(hi.getBestDeck());


  }
  
}
