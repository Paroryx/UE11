# Software Development Exercises - UE11  

## 📜 Task  
This exercise focuses on stepwise refinement to implement **Multi-Hangman**, a variation of the classic Hangman game. Players guess multiple words simultaneously, with each word having its own life counter. The game ends when either all words are solved (win) or one word is lost (lose).  

### Game Features:  
1. **Multiple Words:** The player chooses how many words they want to guess.  
2. **Lives System:** Each word starts with 4 lives, and incorrect guesses reduce the remaining lives.  
3. **Custom Input:** Players input words and guesses. Words are automatically converted to uppercase.  
4. **Game End Conditions:**  
   - **Win:** All words are guessed correctly.  
   - **Lose:** At least one word runs out of lives.  

---

## 📂 Project Structure  

``src/``

- ``In.java`` Helper class for input  
- ``Out.java`` Helper class for output  
- ``Hangman.java`` Class representing the logic for a single Hangman word  
- ``MultiHangman.java`` Main class managing multiple Hangman games  
- ``HangmanApp.java`` Entry point for the Multi-Hangman game  

``tests/``

- ``Testprotokolle.txt`` Test case and results for a complete game session  

---

## 🛠 Implementation Details  
- **Stepwise Refinement:**  
  - Start by defining the overall structure of the game.  
  - Decompose the problem into smaller subproblems (e.g., managing lives, checking guesses).  
  - Use helper methods to handle repetitive tasks, like displaying words or checking game status.  

- **Game Logic Highlights:**  
  - Display words with unrevealed letters as `.` and guessed letters as their actual value.  
  - Include visual feedback for remaining lives using the `printHanger(int lives)` method.  

- **Test Cases:**  
  - Valid inputs (e.g., correct guesses, valid word selections).  
  - Invalid inputs (e.g., selecting a non-existing word, entering invalid characters).  

---
## 🎮 How to Play  

1. **Setup the Game:**  
   - The player starts by entering how many games (words) they want to play.  
   - For each game, the player inputs a word to guess. Example:  
     ```
     How many Hangman do you want to play? 2  
     Type the Word for game #0 > bun  
     Type the Word for game #1 > bird  
     ```

2. **Guess Letters:**  
   - Each round, the player is prompted to guess a letter and choose which word (number) to play. Example:  
     ```
     Which letter do you want to guess? b  
     Which word (number) do you want to play? 1  
     ```

3. **Feedback on Guesses:**  
   - **Correct Guess:** The guessed letter is revealed in the word.  
   - **Incorrect Guess:** One life is lost for that word, and the hangman figure progresses.  

4. **Game Over Conditions:**  
   - **Win:** The player guesses all letters for every word.  
   - **Lose:** A word’s lives reach zero, and the game reveals the word.  

5. **Game States:**  
   - Players are informed about their progress, including guessed letters, remaining lives, and hangman visuals for each word.  

6. **Special Scenarios:**  
   - **Duplicate Guesses:** If a letter is guessed again, the player is reminded that it was already guessed.  
   - **Completed Words:** If the word is already won or lost, the game skips further interaction with it.  

---

## 🛠 Tools  
- **Programming Language:** Java  
- **Editor:** Visual Studio Code with [JavaWiz](https://github.com/SSW-JKU/javawiz) extension  

---

## 📝 License  
This project is licensed under the [MIT License](LICENSE).