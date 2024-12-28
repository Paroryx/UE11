/*

 * This class represent a single word the player is currently playing at.
 * It stores the original word, information about which characters have already been solved, and it keeps track of the remaining lives.
 * The class handles the game logic including guessing letters and checking game status.
*/
public class Hangman {
  /*
   * int lives = the current lives of the current hangman
   * String word = the initial word
   * char[] guessedWord = the displayed word where the guessed + non guessed input is displayed
   * String guessedLetters = to store the letters that are guessed already
   * boolean isFinished = boolean if hangman is still guessable 
   */
  private int lives = 4;
  private String word, guessedLetters;
  private char[] guessedWord;
  public boolean isFinished;
  /**
   * Constructor for Hangman. Initializes the game with the specified word.
   * It sets up the guessedWord array with underscores and initializes guessedLetters as an empty string.
   * 
   * @param word The word to be guessed in this game.
  */
  public Hangman(String word){
    this.word = word;
    this.guessedWord = new char[word.length()];
    for (int i = 0; i < word.length(); i++) {
        guessedWord[i] = '_';
    }
    this.guessedLetters = "";
  }
  /**
   * Handles a single guess cycle in the game. It should process the guessed letter, updates the game state, 
   * and provide feedback to the user.
   * it handles:
   * - if the hangman is guessable
   * - if the guessed letter is already guessed
   * - if the guess is correct/incorrect
   * - if the whole word is guessed
   * 
   * @param letter The letter guessed by the user.
  */
  public void guessCycle(char letter){
    if(isFinished){
      if(lives>0)
        Out.println(" You already won! :) The word was: " + word);
      else
        Out.println(" You already lost! :( The word was: " + word);
      return;
    }
    if (guessedLetters.contains(String.valueOf(letter))) {
      Out.println(" You already guessed that letter. Try again.");
      return;
    }
    guessedLetters += letter;
    if (word.contains(String.valueOf(letter))) {
      for (int i = 0; i < word.length(); i++) {
          if (word.charAt(i) == letter) {
              guessedWord[i] = letter;
          }
      }
      Out.println(" Your guess was correct!");
    } else {
        lives--;
        Out.println(" Incorrect guess. Lives left: " + lives);
    }

    if (new String(guessedWord).equals(word)) {
        isFinished = true;
        Out.println(" Congratulations! You've guessed the word: " + word);
    } else if (lives <= 0) {
        isFinished = true;
        Out.println(" Game over! The word was: " + word);
        guessedWord = word.toCharArray();
    }
  }
  /**
   * drawBlanks() = draws the current state of the "guessedWord" with underscores for unguessed letters.
  */
  private void drawBlanks(){
    Out.print("\t");
    for (char c : guessedWord) {
      Out.print(c + " ");
  }
    Out.print(" (%d)".formatted(guessedWord.length));
    Out.println();
  }
  /**
   * Prints the hangman figure based on the number of remaining lives.
   * 
   * @param lives The number of lives remaining.
  */
  private void printHanger(int lives) {
    switch (lives) {
      case 4:
        Out.println(" ________");
        Out.println(" |      |");
        Out.println(" |");
        Out.println(" |");
        Out.println(" |");
        Out.println(" |");
        Out.println("_|_");
        break;
      case 3:
        Out.println(" ________");
        Out.println(" |      |");
        Out.println(" |      O");
        Out.println(" |");
        Out.println(" |");
        Out.println(" |");
        Out.println("_|_");
        break;
      case 2:
        Out.println(" ________");
        Out.println(" |      |");
        Out.println(" |      O");
        Out.println(" |      |");
        Out.println(" |");
        Out.println(" |");
        Out.println("_|_");
        break;
      case 1:
        Out.println(" ________");
        Out.println(" |      |");
        Out.println(" |      O");
        Out.println(" |     /|\\");
        Out.println(" |");
        Out.println(" |");
        Out.println("_|_");
        break;
      case 0:
        Out.println(" ________");
        Out.println(" |      |");
        Out.println(" |      O");
        Out.println(" |     /|\\");
        Out.println(" |     / \\");
        Out.println(" |");
        Out.println("_|_");
        break;
    }
  }
  /**
   * Should print the current state of the game including the guessed word and hangman figure.
   * 
   * @param index The index of the current Hangman game. (only for a correct user display)
  */
  public void printGame(int index){
    Out.println("Word %d".formatted(index));
    drawBlanks();
    printHanger(lives);
    Out.println("Remaining lives: %d\n".formatted(lives));
  }
}
