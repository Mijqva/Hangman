import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        // System.out.println(getWord());
        System.out.println("Это игра Виселица. Чтобы начать игру, введите Start");

        String inpVal = new String(readConsole());
        System.out.println(inpVal);
        if (inpVal.contains("Start")){
            System.out.println("Игра началась");
            System.out.println("Я загадал слово. У тебя есть несколько попыток чтобы его отгадать");
            String WordToGuess = new String(getWord());
            System.out.println(ReplaceChars(WordToGuess));
            //iterateOverWord(WordToGuess);
            //StringBuilder EncryptedWord = new StringBuilder(ReplaceChars(getWord()));
            //EncryptedWord.setCharAt(4,'A');
            //System.out.println(EncryptedWord);


        }else {
            System.out.println("Неверная команда, выполнение прекращено");
            System.exit(0);
        }


    }

    private static void iterateOverWord(String Word){
        StringBuilder EncryptedWord = new StringBuilder(ReplaceChars(Word));
        EncryptedWord.setCharAt(4,'A');
        for (int i = 0; i<Word.length();i++){

        }

    }
    private static String getWord(){

        String[] WordArr = new String[]{"Слово"};
        return WordArr[0];

    }
    private static String ReplaceChars(String input){
        String output = new String("_");
        for (int i = 1; i< input.length();i++){
            output = output.concat("_");
        }
        return output;
    }

    private static String readConsole() throws IOException { //вычитываем что написали
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();

    }
}
