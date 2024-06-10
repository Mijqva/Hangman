package hangman;
import java.io.IOException;
import static hangman.Game.iterateOverWord;
import static hangman.WordList.getWord;


public class Main {
    public static void main(String[] args) throws IOException{

        System.out.println("=======================================================================");
        System.out.println("Это игра Виселица. Команды:");
        System.out.println("1 - Начать игру");
        System.out.println("2 - Выйти");
        System.out.println("=======================================================================");


        String inpVal = new String(Utils.readConsole());

        if (inpVal.contains("1")){
            for(;;) {
                System.out.println("Игра началась");
                System.out.println("Я загадал слово. У тебя есть несколько попыток чтобы его отгадать");
                iterateOverWord(getWord());
            }

        }else {
            System.out.println("Выбран выход из игры");
            System.exit(0);
        }
    }
}
