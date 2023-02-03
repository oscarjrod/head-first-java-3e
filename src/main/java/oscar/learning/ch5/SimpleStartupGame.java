package oscar.learning.ch5;

public class SimpleStartupGame {

    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleStartup theStartup = new SimpleStartup();

        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theStartup.setLocationCells(locations);

        boolean isAlive = true;
        System.out.println();
        System.out.println("SimpleStartup GAME START!!!");
        System.out.println();
        while (isAlive) {
            int guess = helper.getUserInput("Please enter a number");
            String result = theStartup.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("YES, you killed it!!")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses!");
                System.out.println();
                System.out.println("----- THANK YOU FOR PLAYING MY GAME -----");
            }
        }

    }

}
