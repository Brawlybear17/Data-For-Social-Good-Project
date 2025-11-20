import java.util.Scanner;

public class UserStory {
// Arrays to store card data
private String[] names; // Names of the cards
private double[] winRate; // Win rates of the cards
private double[] usage; // Usage percentages of the cards
private int[] elixirCost; // Elixir cost of the cards
   /**
     * Parameterized constructor for UserStory.
     * Reads data from provided text files and fills arrays.
     * 
  **/
  public UserStory(String namesFile, String winRateFiles, String usageFiles, String elixirCostFiles) {
    this.names = FileReader.toStringArray(namesFile); // Load names from file
   this.winRate = FileReader.toDoubleArray(winRateFiles); // Load win rates from file
    this.usage = FileReader.toDoubleArray(usageFiles); // Load usage from file
    this.elixirCost = FileReader.toIntArray(elixirCostFiles); // Load elixir costs from file
  }

 /**
     * Returns a string of all the card data.
     * Includes the number of cards analyzed and each card's details.
     */
  public String toString() {
    String result = "Cards analyzed: " + names.length + "\n";
            // Goes through all cards and gets their data
    for (int i = 0; i < names.length; i++) {
      result += "Name: " + names[i] + "Win Rate: " + winRate[i] + "Usage: " + usage[i] + "Elixir Cost: " + elixirCost[i];
      result += "\n"; 
    }
    return result;
  }

  
    /**
     * Determines the top 8 cards with the highest win rate.
     * Once a card is selected as a top pick, its win rate is set to 1
     * to prevent selecting it again.
     */
  public String getBestDeck() {
    String result = "Best Deck: \n" + "Cards analyzed: " + names.length + "\n";
        // Select 8 best cards based on win rate
    for (int i = 0; i < 8; i++) {
        int bestIndex = 0;
            // Find the index of the card with the highest win rate
        for (int j = 0; j < winRate.length; j++) {
            if (winRate[j] > winRate[bestIndex]) {
                bestIndex = j;
            }
        }
       // gets the best card's name and win rate to the result
result += names[bestIndex] + " Win Rate: " + winRate[bestIndex] + "\n";
                  // Set the win rate to 1 to prevent it from being selected again
winRate[bestIndex] = 1;
      
    }
    return result;
}
  
}
  
