import java.util.Scanner;

public class jotto {
    
    public static void main(String[] args) {

        
        //Declaring and initiating all the global variables needed for the program
        boolean validate;
        int counter = 0;
        String mysteryWord;
        String guessWord;
        int lettercounter = 0;
        int wordresult = 0;

        // I. Ask user1 for the 5 words mistery word
        do {

            //we take input for the mistery word
            Scanner input = new Scanner(System.in);
            System.out.print("Enter mystery word: ");
            mysteryWord = input.next().toLowerCase();
            
            //here we call the validate word method to see if the word is 5 letters long and
            // doesn't contain duplicates
            validate = validateWord(mysteryWord);
        
            // we'll keep on asking for input until the input is valid
        } while (validate == false);

        
        
        // II.Ask user2 to guess the mistery word until they find it
        do {

            //we take input for the guess word
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your guess: ");
            guessWord = input.next().toLowerCase();;


            //here we call the validate word method to see if the word is 5 letters long and
            // doesn't contain duplicates
            validate = validateWord(guessWord);
           
            // we keep track of all the number of guesses
            counter++;
            //System.out.println(counter);

            //here we call the wordresult method to score the word and see if the user2 found the mystery word
            wordresult = scoreWord(lettercounter,mysteryWord, guessWord);

            //if they guess the mistery word we go to the next phase of the code otherwise we keep on asking for a guess
        } while (validate == false || wordresult != 5 );
        

        ///VI. Once mistery word is found we calculate the total score and print it
        int score = scroreGame(counter);
        System.out.println(score);


    }
//--------------------------------------------------------------------------------------------------------------------------------------
    public static boolean validateWord(String word) {

        // if the user input "quit" the program stops
        if (word.equals("quit")) {
            System.out.println("Thank you for playing goodbye!");
            return false;
            // if the user doesn't enter a 5 letter word, printing error and stops the
            // program
        } else if (word.length() > 5 || word.length() < 5) {
            System.out.println("The supplied word is not valid.");
            return false;
            // if the word is 5 letters, check to see if they are duplicates
        } else if (word.length() == 5) {
            for (int u = 0; u < word.length(); u++) {
                for (int i = u + 1; i < word.length(); i++) {
                    if (word.charAt(i) == word.charAt(u)) {
                        System.out.println("The supplied word is not valid.");

                        // if duplicates are found return false
                        return false;
                    }
                }
            }
        } else {
            return true;

        }

        // if the input is 5 words witout duplucates, output true.
        return true;
    }

    public static int scoreWord(int counterLetter, String mystery, String guess){

        //here we take the mystery word and the guess word and loop through all letters with the chartAt() method to first retrieve a letter from mysteryword
        // and then compare it to each letter in the guessword using again using chartAt() method to identify if the letter are similar
        // if yes we increment the counterletter that keeps track of "duplicated letters"
        for (int mysteryletter = 0; mysteryletter < mystery.length(); mysteryletter++){
            for (int guessletter = 0; guessletter < guess.length(); guessletter++) {
                if (mystery.charAt(mysteryletter) == guess.charAt(guessletter)) 
                {
                    counterLetter ++;
                }
                
            }

        }

        //we return the value of the counter that we will use to start the score game method it counterLetter = 5
        System.out.println(counterLetter);
        return counterLetter;
    }

     // III. Once user2 find the mistery word
    // 3.1. Print out "You won"
    // 3.2 calculate game score scoreGame()
    // scroce 100 - (5*(i-1))
    // 3. print put game score.

    public static int scroreGame(int numberofguesses) {
        System.out.println("You won!");

        int scrore = 100 - (5*(numberofguesses -1));

        return scrore;

    }







    // 2.2 keeping track of the number of guesses
    // while "guess != mystery", promt again and i++
    // 2.3 keep track of the number of letters found (scoreWord() Method)
    // 2.3.1 Score word will take the mystery word and guess word as a parameter and
    // return how many
    // letters the guess word appear in the mystery word. To do this, you’ll use a
    // loop and
    // indexOf().

    // 2.3.1 print out the number of letter found, with the scoreWord method
    // III. Once user2 find the mistery word
    // 3.1. Print out "You won"
    // 3.2 calculate game score scoreGame()
    // scroce 100 - (5*(i-1))
    // 3. print put game score.
}


// 1.2 Validate input (validateWord() Method)
// b. can only be strings *
// c. if user guess is "quit" *
// quit the game: "Thank you for playing goodbye!"*
// d. else:
// bool 5 words and no duplicates
// In order to see if there are duplicate letters, loop through the word and
// look at each character. Then, use indexOf() with the current index + 1 to see
// if the
// letter appears again in the string. If so, return false.
// d. If it returns false, exit the program with an error: "The supplied mystery
// word is not valid."
// message.
// e. promt again for input

// II.Ask user2 to get the mistery word until it finds it
// 2.1 scanner for input "Enter your guess: "
// 2.2 validate input (validateWord() Method)
// a. convert input to lower case
// b. can only be strings
// c. if user guess is "quit"
// quit the game: "Thank you for playing goodbye!"
// d. else:
// bool 5 words and no duplicates
// In order to see if there are duplicate letters, loop through the word and
// look at each
// character. Then, use indexOf() with the current index + 1 to see if the
// letter appears
// again in the string. If so, return false.
// d. If it returns false, exit the program with an error : "The supplied guess
// is not valid."
// message
// e. promt again for input

// 2.2 keep track of the number of guesses *
// while "guess != mystery", promt again and i++ *
// 2.3 keep track of the number of letters found (scoreWord() Method)
// 2.3.1 Score word will take the mystery word and guess word as a parameter and
// return how many letters the guess word appear in the mystery word. To do this, you’ll use a
// loop and indexOf().
// 2.3.1 print out the number of letter found, with the scoreWord method
// III. Once user2 find the mistery word
// 3.1. Print out "You won"
// 3.2 calculate game score scoreGame()
// scroce 100 - (5*(i-1))
// 3. print put game score.

// ----------------------------------------------------------------------------
// for prof : do know how to output two differents error message without
// creating another method
