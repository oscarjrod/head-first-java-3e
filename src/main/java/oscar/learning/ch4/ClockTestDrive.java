package oscar.learning.ch4;

import oscar.learning.Clock;

public class ClockTestDrive {

    public static void main(String[] args) {

        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("Given time is: " + tod);

    }

}
