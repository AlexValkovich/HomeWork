public class Tuba implements Instrument{
    private int diameter;

    @Override
    public void play() {
        System.out.println("Играет труба, диаметр которой = " + diameter);
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
