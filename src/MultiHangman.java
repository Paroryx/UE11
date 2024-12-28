/**
 * The MultiHangman class should manage multiple Hangman game instances.
 * It is supposed to store an array of Hangman objects and handles user input for guessing letters and selecting which game to play.
 * The class has to ensure that all games are completed before terminating.
 */
public class MultiHangman {

    private Hangman[] hangmans;

    /**
     * Constructor for MultiHangman. It should Initialize an array of Hangman games based on the number of words.
     * It should prompt the user to enter each word and creates a Hangman object for each.
     * it should use printHangmans() to print the current Game
     * than it should prompt the user to enter the letter and than the word to guess
     * than it should use the prompted index to perform its guessCycle
     * it should check if its finished already
     * 
     * @param nWords = Number of Hangman games to initialize.
     * 
    */
    public MultiHangman(int nWords){
        hangmans = new Hangman[nWords];
        for(int i = 0; i < hangmans.length; i++){
            String word;
            do{
                Out.print("Type the Word for game #%d > ".formatted(i));
                word = In.readWord().strip().toUpperCase();
            }while(word == null || word.isEmpty());
            hangmans[i] = new Hangman(word);
        }
        printHangmans();
        boolean allFinished = false;
        while(!allFinished){
            Out.print("Which letter do you want to guess? ");
            char letter = String.valueOf(In.readChar()).toUpperCase().charAt(0);
            int hangIndex = 0;
            boolean isValid = false;
            while(!isValid){
                Out.print("Which word (number) do you want to play? ");
                In.readLine(); //to get rid off the \n
                hangIndex = In.readInt();
                if(hangIndex > 0 && hangIndex < hangmans.length+1){
                    isValid = true;
                }else{
                    Out.println("Word number %d not valid.".formatted(hangIndex));
                }
            }
            hangmans[hangIndex-1].guessCycle(letter);
            printHangmans();
            allFinished = checkFinshed();
        }
        Out.println("Thank you for playing MultiHangman!");
    }
    /**
     * checkFinished() should check if all Hangman games are finished.
     * 
     * @return true if all games are finished, false otherwise.
    */
    private boolean checkFinshed(){
        int temp = 0;
            for (int i = 0; i < hangmans.length; i++) {
                if(hangmans[i].isFinished){
                    temp++;
                }
            }
        return temp == hangmans.length;
    }
    /**
     * printHangmans() should print the current state of all Hangman games.
    */
    private void printHangmans(){
        for (int i = 0; i < hangmans.length; i++) {
            hangmans[i].printGame(i+1);
        }
    }
}
