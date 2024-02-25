//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int N = scanner.nextInt();
        System.out.println("Введите нижний предел");
        int A = scanner.nextInt();
        System.out.println("Введите верхний предел");
        int B = scanner.nextInt();
        int[] array = new int[N];

        int i;
        for(i = 0; i < array.length; ++i) {
            Random rand = new Random();
            array[i] = rand.nextInt(B + 1 - A) + A;
        }

        int[] y = array;
        int z = array.length;

        int Mas;
        int x;
        for(Mas = 0; Mas < z; ++Mas) {
            x = y[Mas];
            System.out.print("" + x + " ");
        }

        for(i = 0; i < array.length; ++i) {
            for(z = 0; z < array.length - i - 1; ++z) {
                if (array[z] > array[z + 1]) {
                    Mas = array[z];
                    array[z] = array[z + 1];
                    array[z + 1] = Mas;
                }
            }
        }

        System.out.println();
        y = array;
        z = array.length;

        for(Mas = 0; Mas < z; ++Mas) {
            x = y[Mas];
            System.out.print("" + x + " ");
        }

    }
}