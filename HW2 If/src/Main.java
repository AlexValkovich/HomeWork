//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.




import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Введите число от 1 до 7");
        int d = scan.nextInt();
        if (d == 1){
            System.out.println ("Понедельник");
        }
        else if (d == 2){
            System.out.println ("Вторник");}
        else if (d == 3){
            System.out.println ("Среда");}
        else if (d == 4){
            System.out.println ("Четверг");}
        else if (d == 5){
            System.out.println ("Пятница");}
        else if (d == 6){
            System.out.println ("Суббота");}
        else if (d == 7){
            System.out.println ("Воскресенье");}
        else  {
            System.out.println ("Неизвестное число!!!");}



        

    }
}