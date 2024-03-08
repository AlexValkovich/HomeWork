public class Drum implements Instrument{
    private int size;

    @Override
    public void play() {
        System.out.println("Играет барабан, размер которого = " + size);
    }

    public void setSize(int size) {
        this.size = size;
    }
}
