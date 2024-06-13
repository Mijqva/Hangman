package hangman;

import java.io.IOException;

import static hangman.Utils.readConsole;
import static hangman.Utils.ReplaceChars;
import static hangman.paintMan.paintMan;

public class Game {
    protected static void iterateOverWord(String Word) throws IOException {
        char[] arrWord = Word.toCharArray();
        char[] arrHiddenWord = ReplaceChars(Word).toCharArray();

        int numOfErrors = 0;
        int numOfSuccess = 0;

        System.out.println(arrHiddenWord);

        for (;;){
            System.out.println("Введите букву");
            char currChar = readConsole().charAt(0);
            boolean isHit = false;

            for (int j=0;j<arrWord.length;j++){
                if (currChar == arrWord[j]){
                    arrHiddenWord[j]=currChar;
                    ++numOfSuccess;
                    isHit = true;
                }
            }

            if(!isHit) {
                ++numOfErrors;
            }

            paintMan(numOfErrors);
            System.out.println(arrHiddenWord);
            System.out.println("Число ошибок:" + numOfErrors);

            if(numOfSuccess == arrWord.length) {
                System.out.println("Поздравляю, вы выиграли!");
                break;
            }

            if (numOfErrors==7){
                System.out.println("Превышено число ошибок. Вы проиграли.");
                break;
            }

        }

    }
}
