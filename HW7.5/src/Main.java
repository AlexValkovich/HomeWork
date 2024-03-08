import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату и время в формате yyyy/MM/dd HH:mm - между 1000 и 2012 годом");
        String dayTime = scanner.nextLine();
//
        Pattern pattern = Pattern.compile("^(1[0-9]{3}|20(0[0-9]|1[0-2]))/(0[1-9]|1[0-2])/([0-2][0-9]|30)\\s([0-1][0-9]|2[0-3]):[0-5][0-9]$");

        Matcher matcher = pattern.matcher(dayTime);
        if (matcher.find()){
            System.out.println(matcher.group() + " – существует");
        }else{
            System.out.println(dayTime + " – не существует");
        }
    }
}