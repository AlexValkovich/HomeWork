public class Guitar implements Instrument {

    private int numberOfStrings;
    @Override
    public void play() {
        System.out.println("Играет гитара, у которой " + numberOfStrings +" струн");
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
