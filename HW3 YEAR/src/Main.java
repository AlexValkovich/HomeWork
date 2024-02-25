
import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату");
        int y  = sc.nextInt();
        int d = 366;
        int i = y % 4;
        int x = y % 100;
        int k = y % 400;

        if (i == 0)
        {
            if (x == 0 && k != 0)
                d = 365;
        }else
            d = 365;

        System.out.println("Кол-во дней в году: " + d);
    }
}