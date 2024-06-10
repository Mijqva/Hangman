import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        System.out.println("Это игра Виселица. Чтобы начать игру, введите Start");

        String inpVal = new String(readConsole());
        //System.out.println(inpVal);
        if (inpVal.contains("Start")){
            System.out.println("Игра началась");
            System.out.println("Я загадал слово. У тебя есть несколько попыток чтобы его отгадать");
            iterateOverWord(getWord());

        }else {
            System.out.println("Неверная команда, выполнение прекращено");
            System.exit(0);
        }


    }

    private static void iterateOverWord(String Word) throws IOException{
        char[] arrWord = Word.toCharArray();
        char[] arrHiddenWord = ReplaceChars(Word).toCharArray();

        System.out.println(arrHiddenWord);

        for (int i=0;i<7;i++){
            System.out.println("Введите букву");
            char currChar = readConsole().charAt(0);//не забыть отвалидировать инпут
            boolean isHit = false;
            for (int j=0;j<arrWord.length;j++){
                if (currChar == arrWord[j]){
                    arrHiddenWord[j]=currChar;
                    isHit = true;
                }

            }
            if(isHit){
                System.out.println(arrHiddenWord);
            }


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
