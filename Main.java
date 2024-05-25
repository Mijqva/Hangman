import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println(getWord());
        //String command = System.console().readLine();
        //System.out.println(command);
        System.out.println("Введите хоть что-нибудь пожалуйста");
        System.out.println(readConsole());

    }
    private static String getWord(){

        String[] WordArr = new String[]{"Слово"};
        String Word = WordArr[0];
        return Word;

    }

    public static String readConsole() throws IOException { //
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();

    }
}
