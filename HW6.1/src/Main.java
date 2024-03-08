public class Main {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar();
        Drum drum1 = new Drum();
        Tuba tuba1 = new Tuba();

        guitar1.setNumberOfStrings(7);
        drum1.setSize(15);
        tuba1.setDiameter(10);

        Instrument[] instruments = new Instrument[3];
        instruments[0]= guitar1;
        instruments[1]= drum1;
        instruments[2]= tuba1;

        for (Instrument i: instruments) {
            i.play();
        }
    }
}