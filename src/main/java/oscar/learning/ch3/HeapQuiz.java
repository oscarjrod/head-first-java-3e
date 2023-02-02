package oscar.learning.ch3;

public class HeapQuiz {

    int id = 0;

    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        HeapQuiz[] hq = new HeapQuiz[5];

        while (x < 3) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x = x + 1;
        }

        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];

        // do stuff
        while(y < hq.length) {
            if(hq[y] != null) {
                System.out.println("The id of hq[" + y + "] is " + hq[y].id + ".");
            } else {
                System.out.println("hq[" + y + "] is null, it doesn't reference any object.");
            }
            y++;
        }

    }

}