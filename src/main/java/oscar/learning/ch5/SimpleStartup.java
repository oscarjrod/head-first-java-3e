package oscar.learning.ch5;

public class SimpleStartup {

    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(int guess) {
        String result = "You missed haha!";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Nice, a hit!";
                numOfHits++;
                break;
            } // end if
        } // end for

        if (numOfHits == locationCells.length) {
            result = "YES, you killed it!!";
        } // end if

        System.out.println(result);
        return result;
    }

}