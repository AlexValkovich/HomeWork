//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Phone i1 = new Phone();
        i1.number = 1111111;
        i1.model = "iPhone";
        i1.weight = 200;

        Phone i2 = new Phone();
        i2.number = 2222222;
        i2.model = "Realme";
        i2.weight = 250;

        Phone i3  = new Phone();
        i3.number = 3333333;
        i3.model = "Xiaomi";
        i3.weight = 180;

        Phone[] phones = new Phone[3];
        phones[0] = i1;
        phones[1] = i2;
        phones[2] = i3;

        for (Phone i : phones) {
            System.out.println("Phone" + '\n' + "Number - " + i.number + '\n' + "Model - " + i.model + '\n' + "Weight - " + i.weight);
        }

       // i1.receiveCall("Мама");
        //System.out.println("Телефон - " + i1.getNumber());
        //i2.receiveCall("Папа");
       // System.out.println("Телефон - " + i2.getNumber());
        //i3.receiveCall("Жена");
        //System.out.println("Телефон - " + i3.getNumber());


        i1.receiveCall("Мама", i1.getNumber());
        i2.receiveCall("Папа", i2.getNumber());
        i3.receiveCall("Жена", i3.getNumber());

        Main.sendMessage(i1.getNumber(), i2.getNumber(), i3.getNumber());

    }

    public static void sendMessage(int ... number){
        System.out.println("Отправлено сообщение на номер:");
        for (int n : number) {
            System.out.println("+37525" + n);
        }
    }
}