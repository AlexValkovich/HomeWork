public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();
        Animal rat1 = new Rat();

        dog1.setName("Нюша");
        dog1.setAge(1);

        cat1.setName("Тима");
        cat1.setAge(3);

        rat1.setName("Гарик");
        rat1.setAge(1);

        Animal[] animals = new Animal[3];
        animals[0] = dog1;
        animals[1] = cat1;
        animals[2] = rat1;
        for (Animal i: animals) {
            System.out.print('\n' + "Кличка "+ i.getName() + '\n' + " Возраст " + i.getAge() + '\n' + " Издает звук - "  ) ;
            i.makeNoise();
        }


    }
}