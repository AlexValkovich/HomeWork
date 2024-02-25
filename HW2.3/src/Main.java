import java.util.Random;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите размер массива ");
            int N = scan.nextInt();
            System.out.println("Введите нижний предел значений");
            int A = scan.nextInt();
            System.out.println("Введите верхний предел значений");
            int B = scan.nextInt();
            Random rand = new Random();
            int[] array = new int[N];

            int i;
            for (i = 0; i < N; i++) {
                array[i] = rand.nextInt(A + 1 - B) + B;
                System.out.print(array[i] + " ");
            }

            i = 0;
            int iMax = 0;
            int[] i1 = array;
            int i2 = array.length;

            for (int i3 = 0; i3 < i2; i3++) {
                int x = i1[i3];
                if (x > i) {
                    i = x;
                    iMax++;
                }
            }

            System.out.println();
            System.out.println("Maксимальное значение: " + i + " индекс : " + (iMax - 1));
        }

}
