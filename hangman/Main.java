package hangman;
import java.io.IOException;

import static hangman.Game.iterateOverWord;


public class Main {
    public static void main(String[] args) throws IOException{

        System.out.println("Это игра Виселица. Чтобы начать игру, введите Start");


        String inpVal = new String(Utils.readConsole());

        if (inpVal.contains("Start")){
            System.out.println("Игра началась");
            System.out.println("Я загадал слово. У тебя есть несколько попыток чтобы его отгадать");
            iterateOverWord(WordList.getWord());

        }else {
            System.out.println("Неверная команда, выполнение прекращено");
            System.exit(0);
        }
    }
}
