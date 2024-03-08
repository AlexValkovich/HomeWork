import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ф.И.О - ");
        String Fio = scanner.nextLine();
        System.out.println("Введите возраст - ");
        int age = scanner.nextInt();
        try {
            String result = personInfo(Fio, age);
            System.out.println(result);
        } catch (IncorrectInfoException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
            ex.printStackTrace();
        }
    }

    public static String personInfo(String Fio, int age) throws IncorrectInfoException {
        if (age < 0 || age > 100) {
            throw new IncorrectInfoException("Возраст некорректен", Fio, age);
        }

        Pattern pattern = Pattern.compile("^\\w+\\s\\w+\\s\\w+$", Pattern.UNICODE_CHARACTER_CLASS);

        Matcher matcher = pattern.matcher(Fio);
        if (!matcher.find()) {
            throw new IncorrectInfoException("Некорректные Ф.И.О", Fio, age);
        }

        return "Ф.И.О - " + Fio + "\n Возраст - " + age;
    }
}