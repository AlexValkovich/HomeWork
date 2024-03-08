import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число \"a\"- ");
        int a = scanner.nextInt();
        System.out.print("Введите число \"b\"- ");
        int b = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d + %d = %d \n", a, b, sum(a,b)));
        sb.append(String.format("%d - %d = %d \n", a, b, subtraction(a,b)));
        sb.append(String.format("%d * %d = %d \n", a, b, multiplication(a,b)));
        System.out.println(sb.toString());

        while (sb.indexOf("=") >= 0){
            int c = sb.indexOf("=");
            sb.replace(c,c+1,"равно");
        }
        System.out.println(sb.toString());
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }
}