import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                int x;
                int y;
                int z;
                Scanner scan = new Scanner(System.in);

                System.out.print("x = ");
                x = scan.nextInt();

                System.out.print("y = ");
                y = scan.nextInt();

                System.out.print("z = ");
                z = scan.nextInt();

                if(x <= y && x <= z){
                    System.out.print(y+z);
                }
                else if(y <= x && y <= z)
                    System.out.print(x+z);
                else {
                    System.out.print(x + y);
                }

            }
        }