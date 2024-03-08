public class IncorrectInfoException extends Exception {
    private String Fio;
    private int age;

    public IncorrectInfoException(String message, String FIO, int age) {
        super(message);
        this.Fio = Fio;
        this.age = age;
    }

    @Override
    public String toString() {
        return "IncorrectInfoException{" +
                "Fio='" + Fio + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFIO() {
        return Fio;
    }

    public int getAge() {
        return age;
    }
}
