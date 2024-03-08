import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку - ");
        String str = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\S+\\.com");

        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}