package hangman;
import java.io.IOException;
import static hangman.Game.iterateOverWord;
import static hangman.Utils.readConsole;
import static hangman.WordList.getWord;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("=======================================================================");
        System.out.println("Это игра Виселица. Команды:");
        System.out.println("1 - Начать игру");
        System.out.println("2 - Выйти");
        System.out.println("=======================================================================");


        String inpVal = new String(readConsole());

        if (inpVal.equals("1")) {
            for (;;) {
                System.out.println("Игра началась");
                System.out.println("Я загадал слово. У тебя есть несколько попыток чтобы его отгадать");
                iterateOverWord(getWord());
                System.out.println("=======================================================================");
                System.out.println("Начать новую игру? Команды:");
                System.out.println("1 - Начать игру");
                System.out.println("2 - Выйти");
                System.out.println("=======================================================================");

                inpVal = readConsole();
                if (inpVal.equals("2")){
                    System.exit(0);
                }

            }
        }else {
            System.exit(0);
        }
    }
}