public class Phone {
    int number;
    String model;
    int weight;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this.weight =weight;
        new Phone(number, model);
    }
    void receiveCall(String name){
        System.out.println("Входящий вызов от - " + name);
    }

    void receiveCall(String name, int number){
        System.out.println("Входящий вызов от - " + name + " Телефон - " + number);
    }

    int getNumber(){
        return number;
    }

}

