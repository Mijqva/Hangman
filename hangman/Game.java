package hangman;

import java.io.IOException;

public class Game {
    protected static void iterateOverWord(String Word) throws IOException {
        char[] arrWord = Word.toCharArray();
        char[] arrHiddenWord = Utils.ReplaceChars(Word).toCharArray();
        int numOfErrors = 0;
        int numOfSuccess = 0;

        System.out.println(arrHiddenWord);

        for (;;){
            System.out.println("Введите букву");
            char currChar = Utils.readConsole().charAt(0);//не забыть отвалидировать инпут
            boolean isHit = false;

            for (int j=0;j<arrWord.length;j++){
                if (currChar == arrWord[j]){
                    arrHiddenWord[j]=currChar;
                    ++numOfSuccess;
                    isHit = true;
                }
            }

            if(isHit){
                System.out.println(arrHiddenWord);
            }else{
                ++numOfErrors;
            }
            paintMan.paintMan(numOfErrors);
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
