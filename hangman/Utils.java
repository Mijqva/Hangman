package hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {
    protected static String ReplaceChars(String input){
        String output = new String("_");
        for (int i = 1; i< input.length();i++){
            output = output.concat("_");
        }
        return output;
    }

    protected static String readConsole() throws IOException { //вычитываем что написали
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
