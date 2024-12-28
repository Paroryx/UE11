public class HangmanApp {
    /*
     * The HangmanApp class is responsible for initiating the Hangman game.
     * It contains a main method that handles user input for the number of games to be played.
     * The class uses In.java and Out.java for input and output operations.
     * It creates an instance of MultiHangman to start the specified number of Hangman games.
    */
    public static void main(String[] args) {
        int nWords;
        do{
            Out.print("How many Hangman do you want to play? ");
            nWords = In.readInt();
        }while(nWords <= 0 );
        new MultiHangman(nWords);
    }
}
