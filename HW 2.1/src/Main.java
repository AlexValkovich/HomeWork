//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
public class Main {
    public static void main(String[] args){
        int[] array=new int[4];
        Random random= new Random();
        for(int i=0;i<array.length;i++){
            array[i]=(int)(array.random()*90+10);
            System.out.println(array[i]+" ");
        }
        //С помощью второго цикла переберем по очереди значения елементов массива
        for(int i=0;i<array.length;i++){
            //Если следующий элемент меньше или равен предыдущему, цикл прерывается и выводится сообщение о том, что прогрессия не возрастающая
            if(i>0){
                if(array[i-1]>=array[i]){
                    System.out.println("Прогрессия не возрастающая");
                    break;

                }
            }
            //Если перебрали все значения элементов массива и цикл не прервался - выводим сообщение о том, что последовательность возрастающая
            if(i==Mas.length-1)
                System.out.println("Последовательность строго возрастающая");
        }
    }
}