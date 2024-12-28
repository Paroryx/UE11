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

## 🛠 Tools  
- **Programming Language:** Java  
- **Editor:** Visual Studio Code with [JavaWiz](https://github.com/SSW-JKU/javawiz) extension  

---

## 📝 License  
This project is licensed under the [MIT License](LICENSE).