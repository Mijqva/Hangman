package hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WordList {
    protected static String getWord(){
        List<String> arrayList = new ArrayList<>(Arrays.asList(
                "указатель", "радуга", "мармелад", "поиск", "прятки", "сторож", "копейка", "леопард",
                "человек", "компьютер", "погрузчик", "туалет", "диван", "подушка", "бутылка", "кресло",
                "водолаз", "машина", "квартира", "защита", "градусник", "стакан", "раковина", "ванна", "батарея", "шоколад",
                "гардероб", "записка", "журнал", "новости", "велосипед", "клавиатура", "подарок", "жизнь", "лестница"));
        return arrayList.get(new Random().nextInt(arrayList.size() - 1));
    }
}
