package oscar.learning.ch2;

public class DrumKitTestDrive {

    public static void main(String[] args) {

        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();
        if (d.snare) {
            d.playSnare();
        }

    }

}
