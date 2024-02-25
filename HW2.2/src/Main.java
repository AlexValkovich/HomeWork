//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = scanner.nextInt();
        if (x <= 0) {
            System.out.println("Неизвестное значение!" +
                    "Введите положительное число!");
            x = scanner.nextInt();
        }

        System.out.println("Укажите нижний предел");
        int a = scanner.nextInt();
        System.out.println("Укажите верхний предел");
        int b = scanner.nextInt();
        if (b < a) {
            System.out.println("Неизвестное значение");
            a = scanner.nextInt();
            System.out.println("Повторите попытку!");
            b = scanner.nextInt();
        }

        int[] array = new int[x];

        for(int i = 0; i < array.length; ++i) {
            Random rand = new Random();
            array[i] = rand.nextInt(b + 1 - a) + a;
        }

        int[] i1 = array;
        int i2 = array.length;

        for(int i3 = 0; i3 < i2; ++i3) {
            int z = i1[i3];
            System.out.print(" " + z + " ");
        }

    }
}