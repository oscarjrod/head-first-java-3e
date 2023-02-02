package oscar.learning.ch2;

public class Player {

    int number;

    public void guess() {
        this.number = (int) (Math.random() * 10);
    }

}
